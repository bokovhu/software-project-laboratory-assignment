package hu.johndoe.panda.proto.pl.cmd;

import org.antlr.v4.runtime.ParserRuleContext;

@FunctionalInterface
public interface CommandHandler <ARGS> {

    void handleCommand (ARGS args);

}
