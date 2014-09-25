package com.landasource.wiidget.parser.imports;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.TerminalNode;

import com.landasource.wiidget.Wiidget;
import com.landasource.wiidget.antlr.WiidgetParser.ExternalImportContext;
import com.landasource.wiidget.antlr.WiidgetParser.ImportDeclarationContext;
import com.landasource.wiidget.antlr.WiidgetParser.InnerImportContext;
import com.landasource.wiidget.engine.Engine;
import com.landasource.wiidget.parser.ParserException;
import com.landasource.wiidget.parser.resource.ClassWiidgetResource;
import com.landasource.wiidget.parser.resource.ExternalWiidgetResource;
import com.landasource.wiidget.parser.resource.FileWiidgetResource;
import com.landasource.wiidget.parser.resource.WiidgetResource;
import com.landasource.wiidget.parser.util.QuilifiedName;
import com.landasource.wiidget.parser.util.StringDeclaration;
import com.landasource.wiidget.util.WiidgetProperties;

/**
 * Import context is due to manage and check imports of template.
 *
 * @author Zsolt Lengyel (zsolt.lengyel@gmail.com)
 */
public class ImportContext {

    /** Imports to process. */
    private final List<ImportDeclarationContext> imports;

    /** Alias -> resource map. */
    private final Map<String, WiidgetResource> importMap = new HashMap<String, WiidgetResource>();

    /** Current factory. */
    private final Engine engine;

    /**
     * @param imports
     *            imports to process
     * @param engine
     *            current factory
     */
    public ImportContext(final List<ImportDeclarationContext> imports, final Engine engine) {
        super();
        this.imports = imports;
        this.engine = engine;

    }

    public void process() throws DuplicateAliasException, ImportException {

        checkDuplicateAliases();
        // at this point the template does not contain duplicate aliases

        processImports();
    }

    public WiidgetResource findByAlias(final String wiidgetName) {
        return importMap.get(wiidgetName);
    }

    /**
     * Check whether the template contains duplicated aliases
     *
     * @throws DuplicateAliasException
     *             when the template contains duplicated aliases
     */
    protected void checkDuplicateAliases() throws DuplicateAliasException {

        // store in this map the aliases and their imports
        final Map<String, ImportDeclarationContext> aliases = new HashMap<String, ImportDeclarationContext>();

        // for each import check alias
        for (final ImportDeclarationContext importDeclaration : imports) {

            final InnerImportContext innerImport = importDeclaration.innerImport();
            if (null == innerImport) {
                final ExternalImportContext externalImport = importDeclaration.externalImport();
                final String alias = externalImport.Identifier().getText();

                checkAlias(aliases, alias, importDeclaration);

            } else {

                final String alias = getAlias(innerImport);
                checkAlias(aliases, alias, importDeclaration);

            }
        }

    }

    protected void checkAlias(final Map<String, ImportDeclarationContext> aliases, final String alias, final ImportDeclarationContext importDeclaration)
            throws DuplicateAliasException {

        final ImportDeclarationContext existingImport = aliases.get(alias);
        if (null != existingImport) {
            throw new DuplicateAliasException(alias, existingImport, importDeclaration);
        }

        aliases.put(alias, importDeclaration);
    }

    /**
     * @param importDeclarationContext
     * @throws ParserException
     */
    protected void processImport(final ImportDeclarationContext importDeclarationContext) throws ImportException {

        final InnerImportContext innerImport = importDeclarationContext.innerImport();
        if (null == innerImport) {
            processExternalImport(importDeclarationContext.externalImport());
        } else {
            processInnerImport(innerImport);
        }

    }

    private void processImports() throws ImportException {
        for (final ImportDeclarationContext importDeclarationContext : imports) {
            processImport(importDeclarationContext);
        }
    }

    private void processExternalImport(final ExternalImportContext externalImport) {

        final String alias = externalImport.Identifier().getText();
        final String content = new StringDeclaration(externalImport.StringLiteral()).getContent();

        pull(alias, new ExternalWiidgetResource(content));
    }

    /**
     * @param innerImport
     *            inner import
     * @throws ImportException
     *             when the import is not satisfiable
     */
    private void processInnerImport(final InnerImportContext innerImport) throws ImportException {

        final String alias = getAlias(innerImport);
        final String className = innerImport.qualifiedName().getText();

        Class<? extends Wiidget> imported = null;
        try {
            imported = findWiidgetClass(className);
        } catch (final ClassNotFoundException e) {
            // avoid. Maybe this is a file
        } catch (final NonWiidgetClassException exception) {
            throw new ImportException(innerImport, "Not a wiidget class", exception);
        }

        if (null == imported) {

            final String canonicalFileName = getCanonicalFileName(className);

            if (isWiidgetFile(canonicalFileName)) {

                pull(alias, new FileWiidgetResource(canonicalFileName));

            } else {
                throw new ImportException(innerImport, "Cannot find wiidget: " + className);
            }
        } else {

            // put the full and simple name too
            pull(alias, new ClassWiidgetResource(imported));

        }

    }

    private String getAlias(final InnerImportContext innerImport) {

        final TerminalNode alias = innerImport.Identifier();
        return null == alias ? new QuilifiedName(innerImport.qualifiedName()).getLastIdentifier() : alias.getText();
    }

    @SuppressWarnings("unchecked")
    protected Class<? extends Wiidget> findWiidgetClass(final String wiidgetName) throws NonWiidgetClassException, ClassNotFoundException {

        Class<? extends Wiidget> wiidgetClass = null;
        Class<?> loadedClass = null;
        try {

            try {
                loadedClass = getClass().getClassLoader().loadClass(wiidgetName);
            } catch (final ClassNotFoundException e) {
                throw e;
            }

            wiidgetClass = (Class<? extends Wiidget>) loadedClass;

        } catch (final ClassCastException castException) {
            throw new NonWiidgetClassException(loadedClass);
        }

        return wiidgetClass;
    }

    protected boolean isWiidgetFile(final String canonicalFileName) {
        return engine.getConfiguration().getFileLoader().exists(canonicalFileName);
    }

    private String getCanonicalFileName(final String className) {
        final String filename = className.replaceAll("\\.", "/");
        final String fileextension = engine.getWiidgetProperties().getString(WiidgetProperties.WIIDGET_FILE_EXTENSION);

        final String canonicalFileName = "/" + filename + fileextension;
        return canonicalFileName;
    }

    public void pull(final String alias, final WiidgetResource resource) {
        importMap.put(alias, resource);
    }

}
