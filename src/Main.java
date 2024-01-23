

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Vedant");
        Player p2 = new Player("Singh");

        System.out.println("Game Start");
        System.out.println("Player Position : " + p1.position);
        while (p1.position<100 || p2.position<100) {
            p1.rollDie();
            p2.rollDie();
        }
        System.out.println("Game Finished, Dice rolled : " + p1.diceRollCount + " Times");

    }
}