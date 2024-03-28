package practiceCode.bookP132to2;

public abstract class Insect {
    private int legs;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public Insect() {

    }

    public Insect(int legs) {
        this.legs = legs;
    }

    public abstract void reproduce();

}
