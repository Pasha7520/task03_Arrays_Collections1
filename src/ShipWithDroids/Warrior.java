package ShipWithDroids;

public abstract class Warrior implements Comparable<Warrior> {
    private int power;
    private String name;

    public Warrior(int power, String name) {
        this.power = power;
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int compareTo(Terminator o);

    public abstract int compareTo(Droid o);
}
