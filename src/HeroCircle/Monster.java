package HeroCircle;

public class Monster extends Essenс {
    public Monster() {
        super(Randomaizer.RandPower(5,101));
    }

    public String toString() {
        return "Monster{" +
                "power=" + getPower() +
                '}';
    }
}
