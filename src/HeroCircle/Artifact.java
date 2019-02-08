package HeroCircle;

public class Artifact extends Essenс {
    public Artifact() {
        super(Randomaizer.RandPower(10,81));
    }

    @Override
    public String toString() {
        return "Artifact{" +
                "power=" + getPower() +
                '}';
    }
}
