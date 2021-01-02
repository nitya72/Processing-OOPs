import processing.core.PApplet;

public class Processing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 25;

    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;

    public static void main(String[] args) {
        PApplet.main("Processing", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ball1 = new Ball(this, 0, HEIGHT * 0.2f, 1, DIAMETER);
        ball2 = new Ball(this, 0, HEIGHT * 0.4f, 2, DIAMETER);
        ball3 = new Ball(this, 0, HEIGHT * 0.6f, 3, DIAMETER);
        ball4 = new Ball(this, 0, HEIGHT * 0.8f, 4, DIAMETER);
    }

    @Override
    public void draw() {
        ball1.colorBall(Ball.BallColors.RED);
        ball1.drawBall();

        ball2.colorBall(Ball.BallColors.YELLOW);
        ball2.drawBall();

        ball3.colorBall(Ball.BallColors.GREEN);
        ball3.drawBall();

        ball4.colorBall(Ball.BallColors.PURPLE);
        ball4.drawBall();
    }
}
