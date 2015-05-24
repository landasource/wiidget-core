package com.landasource.wiidget.commons;

import com.landasource.wiidget.Extension;
import com.landasource.wiidget.Wiidget;
import com.landasource.wiidget.WiidgetException;
import com.landasource.wiidget.annotation.DefaultField;
import com.landasource.wiidget.antlr.WiidgetParser;
import com.landasource.wiidget.context.Context;
import com.landasource.wiidget.parser.ParserException;
import com.landasource.wiidget.parser.StatementProcessor;
import com.landasource.wiidget.util.DataMap;
import com.landasource.wiidget.util.Function;

import java.util.List;

/**
 * Created by Zsolti on 2015.05.23..
 */
public class Macro extends Wiidget implements Extension {


    @DefaultField
    private String __wiidgetMacroName;
    private List<WiidgetParser.StatementDeclarationContext> statements;
    private StatementProcessor statementProcessor;
    private Wiidget parent;
    private String content;
    private DataMap attributes = new DataMap();

    @Override
    public void init() {
        super.init();
        this.parent = (Wiidget) getEngine().getContext().get("this");
        startBuffer();
    }

    @Override
    public void run() {
        content = endBuffer();

        startBuffer();

        Context context = getEngine().getContext();
        // TODO use context stack
        context.set("$macro", this);

        final Object prevThis = context.get("this");

        context.set("this", parent);

        callStatements();

        if (null == prevThis) {
            context.remove("this");
        } else {
            context.set("this", prevThis);
        }

        String res = endBuffer();

        write(res);
    }

    public String get__wiidgetMacroName() {
        return __wiidgetMacroName;
    }

    public void set__wiidgetMacroName(String __wiidgetMacroName) {
        this.__wiidgetMacroName = __wiidgetMacroName;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void setAttribute(String name, Object value) {
        attributes.put(name, value);
    }

    public DataMap getAttributes() {
        return attributes;
    }

    @Override
    public void processStatements(List<WiidgetParser.StatementDeclarationContext> statements, StatementProcessor statementProcessor) throws ParserException {
        this.statements = statements;
        this.statementProcessor = statementProcessor;
    }

    private void callStatements() {
        try {
            statementProcessor.processStatements(statements);
        } catch (ParserException e) {
            throw new WiidgetException("Cannot process statements", e);
        }
    }
}
