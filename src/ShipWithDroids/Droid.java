package ShipWithDroids;

public class Droid extends Warrior{

    public Droid(int power, String name) {
        super(power, name);
    }

    @Override
    public int compareTo(Terminator o) {
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
    public String toString() {
        return "ShipWithDroids.Droid{" +
                "power=" + getPower() +
                ", name='" + getName() + '\'' +
                '}';
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
