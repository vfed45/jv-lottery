package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private static final int MAX_BALL_NUMBER = 101;

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor().name(), random.nextInt(MAX_BALL_NUMBER));
    }
}
