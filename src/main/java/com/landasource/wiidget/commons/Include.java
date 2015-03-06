package com.landasource.wiidget.commons;

import com.landasource.wiidget.annotation.DefaultField;
import com.landasource.wiidget.validator.Required;

/**
 * Includes the content of the file.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class Include extends ContextualWiidget {

    /** Path to the file. */
    @Required
    @DefaultField
    private String path;

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void run() {
        super.run();

        final String fileContent = getFileContent(path);

        write(fileContent);

        restoreContext();
    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path
     *            the path to set
     */
    public void setPath(final String path) {
        this.path = path;
    }

}
