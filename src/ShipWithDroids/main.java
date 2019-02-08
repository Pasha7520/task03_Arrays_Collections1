package ShipWithDroids;

import ShipWithDroids.Droid;
import ShipWithDroids.Ship;
import ShipWithDroids.Terminator;

public class main {
    public static void main(String[] args) {
        Ship<Droid> shipDroid = new Ship<>();
        shipDroid.putWarrior(new Droid(602,"Piton"));
        shipDroid.putWarrior(new Droid(30,"Ivanik"));
        shipDroid.putWarrior(new Droid(10,"Vitia"));
        shipDroid.putWarrior(new Droid(40,"Andron"));
        shipDroid.putWarrior(new Droid(10,"Vitaliu"));
        shipDroid.putWarrior(new Droid(10,"Anton"));
        shipDroid.putWarrior(new Droid(10,"Vitia"));
        shipDroid.putWarrior(new Droid(20,"Ivan"));
        shipDroid.putWarrior(new Droid(402,"Piton"));
        shipDroid.putWarrior(new Droid(10,"Abadon"));



        Ship<Terminator> shipTerminator = new Ship<>();
        shipTerminator.putWarrior(new Terminator(300,"Term_AB"));
        shipTerminator.putWarrior(new Terminator(300,"Term_AA"));
        shipTerminator.putWarrior(new Terminator(400,"Term_F"));
        /*shipTerminator.getWarrior();
        shipTerminator.getWarrior();
        shipTerminator.getWarrior();
        shipTerminator.getWarrior();
        shipTerminator.getWarrior();
        shipTerminator.getWarrior();
        shipTerminator.getWarrior();
        shipTerminator.getWarrior();
        shipTerminator.getWarrior();
        shipTerminator.getWarrior();
        shipTerminator.getWarrior();*/
        System.out.println(shipDroid.priorityQueue2.size());
        System.out.println(shipTerminator.priorityQueue2.size());
        shipDroid.addAnotherShipWarriors(shipTerminator.getPriorityQueue());
        System.out.println(shipDroid.priorityQueue2.toString());
        System.out.println(shipDroid.priorityQueue2.size());
    }
}
