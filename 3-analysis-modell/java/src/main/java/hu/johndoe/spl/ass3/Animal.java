package hu.johndoe.spl.ass3;

public abstract class Animal implements Updatable {

    public Tile standingOn;
    public Animal leaderAnimal;
    public Animal guidedAnimal;

    public void collideWithPanda (Animal panda) {

    }

    public void collideWithOrangutan (Animal orangutan) {

    }

    // TODO: Missing from DOCUMENT.md
    public abstract void collideWithAnimal (Animal animal);

    public void kill () {

    }

    public void startLeading (Animal leader) {

        Animal previouslyGuidedAnimal = leader.guidedAnimal;

        this.leaderAnimal = leader;
        previouslyGuidedAnimal.leaderAnimal = this;
        leader.guidedAnimal = this;

    }

    public void stopLeading () {

        if (this.guidedAnimal != null) {
            this.guidedAnimal.stopLeading ();
        }

        this.leaderAnimal = null;
        this.guidedAnimal = null;

    }

    // TODO: Missing from DOCUMENT.md
    public void moveTo (Tile targetTile) {

        targetTile.accept (this);

    }

    // TODO: Missing from DOCUMENT.md
    public void use (Item item) {

        item.use (this);

    }

}
