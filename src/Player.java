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
    }
}
