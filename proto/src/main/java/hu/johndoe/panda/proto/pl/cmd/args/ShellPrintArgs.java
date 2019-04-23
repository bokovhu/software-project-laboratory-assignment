package hu.johndoe.panda.proto.pl.cmd.args;

/**
 * Contains the arguments of a "/print ..." shell command
 */
public final class ShellPrintArgs {

    /** The filename to print to. Optional, may be null, in that case the output goes to STDOUT */
    public final String filename;

    public ShellPrintArgs (String filename) {
        this.filename = filename;
    }

}
