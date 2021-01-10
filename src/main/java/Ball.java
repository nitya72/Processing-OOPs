import processing.core.PApplet;

public class Ball {

    private float xPosition;
    private final float yPosition;
    private final int diameter;
    private final int speed;

    public Ball(float xPosition, float yPosition, int speed, int diameter) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.speed = speed;
        this.diameter = diameter;
    }

    public void drawCircle(PApplet pApplet) {
        pApplet.ellipse(xPosition, yPosition, diameter, diameter);
    }

    public void move() {
        xPosition += speed;
    }
}
