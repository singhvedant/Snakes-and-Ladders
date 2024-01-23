

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Vedant");

        System.out.println("Game Start");
        System.out.println("Player Position : " + p1.position);
        while (p1.position<100) {
            p1.rollDie();
        }
        System.out.println("Game Finished");

    }
}