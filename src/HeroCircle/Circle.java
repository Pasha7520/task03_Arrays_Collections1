package HeroCircle;

public class Circle {
    Essenс[] essenсes = new Essenс[10];
    Hero hero = new Hero();

    public Circle() {
        fillEssenсes();
    }

    public void fillEssenсes() {
        int loop = 0;
        int randInt;
        while (loop < 10) {
            randInt = Randomaizer.RandPower(1, 3);
            if (randInt == 1) {
                essenсes[loop] = new Monster();
            } else {
                essenсes[loop] = new Artifact();
            }
            loop++;
        }
    }

    public boolean essencesIsNotEmpry() {
        for (Essenс essenс : essenсes) {
            if (essenс != null) {
                return true;
            }
        }
        return false;
    }

    public void printDoors() {
        for (int i = 0; i < essenсes.length; i++) {
            if (essenсes[i] != null) {
                System.out.print("[Door - "+(i+1)+"]");
            }

        }
    }
    public void printEssences() {
        for (int i = 0; i < essenсes.length; i++) {
            if (essenсes[i] instanceof Monster) {
                System.out.println((Monster)essenсes[i]);
            }else {
                System.out.println((Artifact)essenсes[i]);
            }

        }
    }

    public boolean openDoor(int number) {
        number -= 1;
        if (essenсes[number] == null) {
            System.out.println("You've already opened this dor!");
            return true;
        }
        if (essenсes[number] instanceof Artifact) {
            System.out.println("it's artifact , and your Hero gets " + essenсes[number].getPower() + " points of power!");
            hero.setPower(hero.getPower() + essenсes[number].getPower());
            System.out.println("Your hero power is "+hero.getPower());
            essenсes[number] = null;
        } else {
            System.out.println("it's monster , and your Hero have to fight !!");
            int result = hero.getPower() - essenсes[number].getPower();
            if (result <= 0) {
                System.out.println("Monster kill you!!!");
                return false;
            } else {
                hero.setPower(hero.getPower() - essenсes[number].getPower());
                System.out.println("hero wins!! you power is "+hero.getPower());
                essenсes[number] = null;
                return true;
            }
        }
        return true;
    }
}
