package HeroCircle;

public class Hero extends Essenс {
    public Hero() {
        super(25);
    }

    @Override
    public String toString() {
        return "Hero{"+
                "power=" + getPower() +
                '}';
    }
}
