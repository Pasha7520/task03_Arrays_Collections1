package HeroCircle;

import java.util.Scanner;

public class Game {
    Circle circle ;

    public Game(Circle circle) {
        this.circle = circle;
    }

    public void startGame(){
        Scanner scanner = new Scanner(System.in);
       boolean loop = true;
       boolean doorExists = true;
       int number ;
        while(loop && doorExists){
            circle.printDoors();
            System.out.println("\nChoice the door :");
            number = scanner.nextInt();
            if(number < 1 || number >10) {
                System.out.println("Door number doesn't exist");
                continue;
            }
            loop = circle.openDoor(number);
            doorExists = circle.essencesIsNotEmpry();
        }
        if(!loop){
            System.out.println("Game Over!!!");
        }else {
            System.out.println("Your hero won!!");
        }
    }

}
