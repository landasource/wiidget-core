package com.landasource.wiidget;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

import com.landasource.wiidget.commons.ContextualWiidget;

/**
 * Wiidget for files.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class ResourceWiidget extends ContextualWiidget {

    /** Full path to file. */
    private String fileName;

    // TODO handle children

    @Override
    public void run() {

        try {
            final InputStream inputStream = getEngine().getConfiguration().getFileLoader().getFile(fileName);

            final String template = IOUtils.toString(inputStream);

            final String content = Renderer.create(getEngine()).render(template);

            write(content);

        } catch (final WiidgetException exception) {

            throw new WiidgetException("Cannot render wiidget: " + fileName, exception);

        } catch (final IOException e) {
            throw new WiidgetException("Cannot load wiidget", e);
        }

        super.run();
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName
     *            the fileName to set
     */
    public void setFileName(final String fileName) {
        this.fileName = fileName;
    }

}
