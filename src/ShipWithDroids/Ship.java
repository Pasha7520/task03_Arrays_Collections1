package ShipWithDroids;

public class Ship<T extends Warrior> {
  //  MyPriorityQueue<T> priorityQueue = new MyPriorityQueue<T>();
    MyPriorityQueue<Warrior> priorityQueue2 = new MyPriorityQueue<>();



    public MyPriorityQueue getPriorityQueue() {
        return priorityQueue2;
    }

    public void getWarrior() {
        if (priorityQueue2.isEmpty()) {
            System.out.println("Ship with is empty!! come back to base!");
            return;
        }
        System.out.println(priorityQueue2.pop() + " ready to the fight!!");
    }

    public void putWarrior(T warrior) {
        System.out.println(warrior + " joined to out ship!!");
        priorityQueue2.push(warrior);
    }

    public void addAnotherShipWarriors(MyPriorityQueue<? extends Warrior> myPriorityQueue) {
        for (int i = 0; i < myPriorityQueue.size(); i++) {
            priorityQueue2.push(myPriorityQueue.pop());
        }
    }
}
