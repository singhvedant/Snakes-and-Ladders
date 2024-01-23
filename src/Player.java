import java.util.Random;
import java.util.Scanner;

public class Player {
    public Integer position;
    public String name;
    public Integer diceRollCount;
    Player(String name){
        this.name = name;
        this.position = 0;
        this.diceRollCount = 0;
    }

    public void rollDie() {
        this.diceRollCount += 1;
        Integer rolled = new Dice().roll();
        System.out.println(this.name + " rolled " + rolled);
        if (this.position+rolled <= 100) {
            this.position += rolled;
            System.out.println("New Position : " + this.position);
            if (this.position == 100){
                System.out.println(this.name + " won the game.");
                return;
            }
            int rand = new Random().nextInt(5);
            switch (rand) {
                case 1: break;
                case 2: break;
                case 3: ladder(rolled);break;
                case 4: snake(rolled);break;
            }
        } else {
            System.out.println("Move Nullified...need " + (100 - this.position));
        }
    }

    public void ladder(int rolled) {
        if (this.position+rolled < 100) {
            this.position += rolled;
            System.out.println("Ladder gained. New Position : " + this.position);
            this.rollDie();
        }
    }

    public void snake(int rolled) {
        this.position -= rolled;
        if (this.position<0) {
            this.position = 0;
            System.out.println("Snake Bite. New Position : " + this.position);
        }
    }
}
