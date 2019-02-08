package ShipWithDroids;

import java.util.Comparator;

public class Terminator extends Warrior {

    public Terminator(int power, String name) {
        super(power, name);
    }

    @Override
    public String toString() {
        return "ShipWithDroids.Terminator{" +
                "power=" + getPower() +
                ", name='" + getName() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Terminator o) {
        return Comparator.comparing(Terminator::getPower)
                .thenComparing(Terminator::getName)
                .compare(this,  o);

    }

    @Override
    public int compareTo(Droid o) {
        if(this.getPower() > o.getPower()) {
            return 1;
        } else if (this.getPower() < o.getPower()) {
            return -1;
        } else {
            if(this.getName().compareTo(o.getName()) > 0) {
                return 1;
            } else if (this.getName().compareTo(o.getName())<0) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    @Override
    public int compareTo(Warrior o) {
        if(this.getPower() > o.getPower()) {
            return 1;
        } else if (this.getPower() < o.getPower()) {
            return -1;
        } else {
            if(this.getName().compareTo(o.getName()) > 0) {
                return 1;
            } else if (this.getName().compareTo(o.getName())<0) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
