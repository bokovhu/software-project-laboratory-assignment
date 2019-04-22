package hu.johndoe.panda.proto.pl.cmd.args;

public class WorkArgs {

    public final boolean isAnimal;
    public final boolean isItem;
    public final int id;

    public WorkArgs (boolean isAnimal, boolean isItem, int id) {
        this.isAnimal = isAnimal;
        this.isItem = isItem;
        this.id = id;
    }

}
