import java.util.Random;
import java.util.Scanner;

public class Player {
    Integer position;
    String name;

    Player(String name){
        System.out.println("Enter your name:");
        Scanner reader = new Scanner(System.in);
        this.name = reader.nextLine();
        this.position = 0;
    }

    public void rollDie() {
        Integer rolled = new Dice().roll();
        System.out.println(this.name + " rolled " + rolled);

        //Check for Random Option
        int rand = new Random().nextInt(4);
        switch (rand) {
            case 1: noPlay(rolled);break;
            case 2: ladder(rolled);break;
            case 3: snake(rolled);break;
        }
    }

    public void noPlay(int rolled) {
        System.out.println("No Play!");
    }

    public void ladder(int rolled) {
        this.position += rolled;
        if (this.position>100) {
            this.position = 100;
        }
        System.out.println("Ladder gained. New Position : " + this.position);
    }

    public void snake(int rolled) {
        this.position -= rolled;
        if (this.position<0) {
            this.position = 0;
        }
        System.out.println("Snake Bite. New Position : " + this.position);
    }
}
