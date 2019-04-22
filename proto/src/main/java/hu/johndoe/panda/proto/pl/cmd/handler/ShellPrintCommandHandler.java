package hu.johndoe.panda.proto.pl.cmd.handler;

import hu.johndoe.panda.proto.pl.cmd.CommandHandler;
import hu.johndoe.panda.proto.pl.cmd.args.ShellPrintArgs;

import java.io.File;
import java.io.PrintStream;
import java.io.PrintWriter;

public class ShellPrintCommandHandler implements CommandHandler <ShellPrintArgs> {

    @Override
    public void handleCommand (ShellPrintArgs shellPrintArgs) {

        PrintStream pw = null;
        String filename = shellPrintArgs.filename == null
                ? ""
                : shellPrintArgs.filename.trim ();

        if (!filename.isEmpty ()) {
            if (filename.startsWith ("\"") && filename.endsWith ("\"")) {
                filename = filename.substring (1, filename.length () - 1);
            } else {
                throw new IllegalArgumentException ("Filenames should be between '\"' characters!");
            }
        }

        try {

            if (!filename.isEmpty ()) {
                pw = new PrintStream (new File (filename));
            } else {
                pw = System.out;
            }

            pw.println ("Hello!");

            if (!filename.isEmpty ()) pw.close ();

        } catch (Exception e) {
            e.printStackTrace ();
        }

    }

}
