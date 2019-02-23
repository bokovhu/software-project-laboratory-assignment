package hu.johndoe.spl.ass3;

public class Portal {

    public Tile place;
    public Portal otherEnd;

    public void enter (Animal animal) {

        otherEnd.place.accept (animal);

    }

}
