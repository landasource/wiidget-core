// Generated from C:\Users\Zsolti\Documents\GitHub\landasource\wiidget-core\src\main\java\com\landasource\wiidget\antlr\Wiidget.g4 by ANTLR 4.1
package com.landasource.wiidget.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WiidgetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WiidgetVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WiidgetParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull WiidgetParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#wiidgetDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWiidgetDeclaration(@NotNull WiidgetParser.WiidgetDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#wiidgetArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWiidgetArguments(@NotNull WiidgetParser.WiidgetArgumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull WiidgetParser.CompilationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(@NotNull WiidgetParser.ElementValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull WiidgetParser.ExpressionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#wiidgetVariableBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWiidgetVariableBinding(@NotNull WiidgetParser.WiidgetVariableBindingContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(@NotNull WiidgetParser.PrimaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#controlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlStatement(@NotNull WiidgetParser.ControlStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#mapEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapEntry(@NotNull WiidgetParser.MapEntryContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#elseControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseControl(@NotNull WiidgetParser.ElseControlContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#foreachVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachVariable(@NotNull WiidgetParser.ForeachVariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(@NotNull WiidgetParser.ImportDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#expressionWiidgetName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionWiidgetName(@NotNull WiidgetParser.ExpressionWiidgetNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#foreachControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachControl(@NotNull WiidgetParser.ForeachControlContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#ifControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfControl(@NotNull WiidgetParser.IfControlContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(@NotNull WiidgetParser.QualifiedNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#wiidgetBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWiidgetBody(@NotNull WiidgetParser.WiidgetBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(@NotNull WiidgetParser.ElementValuePairsContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(@NotNull WiidgetParser.ElementValuePairContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#mapKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapKey(@NotNull WiidgetParser.MapKeyContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#wiidgetVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWiidgetVariable(@NotNull WiidgetParser.WiidgetVariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#innerImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerImport(@NotNull WiidgetParser.InnerImportContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#attributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeName(@NotNull WiidgetParser.AttributeNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#unifiedWiidgetName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnifiedWiidgetName(@NotNull WiidgetParser.UnifiedWiidgetNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#mapExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExpression(@NotNull WiidgetParser.MapExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#statementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDeclaration(@NotNull WiidgetParser.StatementDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#listExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpression(@NotNull WiidgetParser.ListExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#externalImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalImport(@NotNull WiidgetParser.ExternalImportContext ctx);

	/**
	 * Visit a parse tree produced by {@link WiidgetParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull WiidgetParser.LiteralContext ctx);
}