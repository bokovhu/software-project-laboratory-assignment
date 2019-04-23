package hu.johndoe.panda.proto.pl.cmd;

import org.antlr.v4.runtime.ParserRuleContext;

/**
 * A command handler, used to handle user commands in the command line interface (CLI)
 * @param <ARGS> The type, whose instances hold the arguments of the command
 */
@FunctionalInterface
public interface CommandHandler <ARGS> {

    /**
     * Handles a single command execution
     * @param args the command arguments
     */
    void handleCommand (ARGS args);

}
