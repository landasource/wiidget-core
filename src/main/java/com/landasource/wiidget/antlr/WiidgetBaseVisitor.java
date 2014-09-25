// Generated from C:\Users\Zsolti\Documents\GitHub\landasource\wiidget-core\src\main\java\com\landasource\wiidget\antlr\Wiidget.g4 by ANTLR 4.1
package com.landasource.wiidget.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link WiidgetVisitor}, which
 * can be extended to create a visitor which only needs to handle a subset of
 * the available methods.
 *
 * @param <T>
 *            The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public class WiidgetBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements WiidgetVisitor<T> {
    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitExpression(@NotNull final WiidgetParser.ExpressionContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitWiidgetDeclaration(@NotNull final WiidgetParser.WiidgetDeclarationContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitWiidgetArguments(@NotNull final WiidgetParser.WiidgetArgumentsContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitCompilationUnit(@NotNull final WiidgetParser.CompilationUnitContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitElementValue(@NotNull final WiidgetParser.ElementValueContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitExpressionList(@NotNull final WiidgetParser.ExpressionListContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitWiidgetVariableBinding(@NotNull final WiidgetParser.WiidgetVariableBindingContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitPrimary(@NotNull final WiidgetParser.PrimaryContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitControlStatement(@NotNull final WiidgetParser.ControlStatementContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitMapEntry(@NotNull final WiidgetParser.MapEntryContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitElseControl(@NotNull final WiidgetParser.ElseControlContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitWiidgetMethodCallExpression(@NotNull final WiidgetParser.WiidgetMethodCallExpressionContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitForeachVariable(@NotNull final WiidgetParser.ForeachVariableContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitImportDeclaration(@NotNull final WiidgetParser.ImportDeclarationContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitExpressionWiidgetName(@NotNull final WiidgetParser.ExpressionWiidgetNameContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitForeachControl(@NotNull final WiidgetParser.ForeachControlContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitIfControl(@NotNull final WiidgetParser.IfControlContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitQualifiedName(@NotNull final WiidgetParser.QualifiedNameContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitWiidgetBody(@NotNull final WiidgetParser.WiidgetBodyContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitMapKey(@NotNull final WiidgetParser.MapKeyContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitElementValuePairs(@NotNull final WiidgetParser.ElementValuePairsContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitElementValuePair(@NotNull final WiidgetParser.ElementValuePairContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitSeamStatement(@NotNull final WiidgetParser.SeamStatementContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitWiidgetVariable(@NotNull final WiidgetParser.WiidgetVariableContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitInnerImport(@NotNull final WiidgetParser.InnerImportContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitAttributeName(@NotNull final WiidgetParser.AttributeNameContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitUnifiedWiidgetName(@NotNull final WiidgetParser.UnifiedWiidgetNameContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitMapExpression(@NotNull final WiidgetParser.MapExpressionContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitListExpression(@NotNull final WiidgetParser.ListExpressionContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitStatementDeclaration(@NotNull final WiidgetParser.StatementDeclarationContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitExternalImport(@NotNull final WiidgetParser.ExternalImportContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     */
    @Override
    public T visitLiteral(@NotNull final WiidgetParser.LiteralContext ctx) {
        return visitChildren(ctx);
    }
}