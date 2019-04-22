package hu.johndoe.panda.proto.cli;

import hu.johndoe.panda.proto.model.Game;
import hu.johndoe.panda.proto.model.Level;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayDeque;
import java.util.Deque;

public class PandaStack {

    private Deque <Level> stack = new ArrayDeque<> ();

    public void push () {

        try {

            ByteArrayOutputStream baos = new ByteArrayOutputStream ();
            ObjectOutputStream oos = new ObjectOutputStream (baos);

            oos.writeObject (Game.getInstance ().level);
            oos.close ();

            ByteArrayInputStream bais = new ByteArrayInputStream (baos.toByteArray ());
            ObjectInputStream ois = new ObjectInputStream (bais);

            stack.addLast ((Level) ois.readObject ());

            ois.close ();

        } catch (Exception e) {
            e.printStackTrace ();
        }

    }

    public Level pop () {

        if (!stack.isEmpty ()) {
            return stack.removeLast ();
        }
        return null;

    }

    public void clear () {
        stack.clear ();
    }

}
