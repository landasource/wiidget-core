package com.landasource.wiidget;

import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.util.List;


import com.landasource.wiidget.commons.Macro;

import com.landasource.wiidget.util.PropertyFactory;
import org.apache.commons.io.IOUtils;

import com.landasource.wiidget.commons.ContextualWiidget;
import com.landasource.wiidget.context.Context;


/**
 * Wiidget for files.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class ResourceWiidget extends ContextualWiidget implements PropertyFactory {

    /**
     * Full path to file.
     */
    private String fileName;
    private String content;


    @Override
    public void init() {
        super.init();
        startBuffer();
    }

    @Override
    public void run() {

        this.content = endBuffer();

        try {
            final InputStream inputStream = getEngine().getConfiguration().getFileLoader().getFile(fileName);

            final String template = IOUtils.toString(inputStream);

            final Context context = getEngine().getContext();
            final Object prevThis = context.get("this");

            context.set("this", this);

            final String templateContent = Renderer.create(getEngine()).render(template);

            if (null == prevThis) {
                context.remove("this");
            } else {
                context.set("this", prevThis);
            }
            write(templateContent);

        } catch (final WiidgetException exception) {

            throw new WiidgetException("Cannot render wiidget: " + fileName, exception);

        } catch (final IOException e) {
            throw new WiidgetException("Cannot load wiidget", e);
        } catch (Exception e) {
            throw new WiidgetException("Cannot render wiidget: " + fileName, e);
        }

        super.run();
        restoreContext();
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * With this lazy load we can use macros.
     *
     * @return
     */
    public String getContent() {
        return content;
    }

    @Override
    public Object provideProperty(String name) {
        List<Macro> macros = getChildren(Macro.class);
        for (Macro macro : macros) {
            if (name.equals(macro.get__wiidgetMacroName())) {
                return macro;
            }
        }

        return null;
    }


}
