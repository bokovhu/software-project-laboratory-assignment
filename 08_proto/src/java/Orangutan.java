package java;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;

public class Orangutan extends Animal {

    public Orangutan () {
    }

    public Orangutan (Animal leaderAnimal, Animal guidedAnimal, Tile standingOn) {
        super (leaderAnimal, guidedAnimal, standingOn);
    }

    @Override
    public void leadOut(){
        ActionLogger.log (this, "Going out and back in");
        ActionLogger.push ();
        if(getGuidedAnimal()!=null) getGuidedAnimal().leadOut();
        setGuidedAnimal(null);
        moveTo(Game.getInstance().level.getStartTile());
    }

    @Override
    public void collideWithAnimal (Animal animal) {

        ActionLogger.log (this, "Colliding with animal %s", animal.toString ());
        ActionLogger.push ();

        animal.collideWithOrangutan (this);

        ActionLogger.pop ();

    }

    @Override
    public String toString () {
        return "Orangutan{" +
                "id=" + id +
                '}';
    }

}
