import processing.core.PApplet;

import java.util.Arrays;
import java.util.List;

public class Processing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 25;

    public static final int SPEED_BALL1 = 1;
    public static final int SPEED_BALL2 = 2;
    public static final int SPEED_BALL3 = 3;
    public static final int SPEED_BALL4 = 4;

    private List<Ball> ballList;

    public static void main(String[] args) {
        PApplet.main("Processing", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        Ball ball1 = new Ball(0, HEIGHT * 0.2f, SPEED_BALL1, DIAMETER);
        Ball ball2 = new Ball(0, HEIGHT * 0.4f, SPEED_BALL2, DIAMETER);
        Ball ball3 = new Ball(0, HEIGHT * 0.6f, SPEED_BALL3, DIAMETER);
        Ball ball4 = new Ball(0, HEIGHT * 0.8f, SPEED_BALL4, DIAMETER);

        ballList = Arrays.asList(ball1, ball2, ball3, ball4);
    }

    @Override
    public void draw() {
        ballList.forEach(Ball::move);

        ballList.forEach(ball -> ball.drawCircle(this));
    }
}
