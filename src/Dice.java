import java.util.Random;

public class Dice {

    public Integer roll() {
        return new Random().nextInt(7);
    }
}
