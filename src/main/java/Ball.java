public class Ball {

    private final Processing processing;
    private float xPos;
    private float yPos;
    private final int diameter;
    private int speed;

    public enum BallColors {RED, BLUE, GREEN, PURPLE, YELLOW, WHITE, BLACK}

    public Ball(Processing processing, float xPos, float yPos, int speed, int diameter) {
        this.processing = processing;
        this.xPos = xPos;
        this.yPos = yPos;
        this.speed = speed;
        this.diameter = diameter;
    }

    public void colorBall(BallColors ballColors) {
        switch (ballColors) {
            case RED:
                processing.fill(255, 0, 0);
                break;
            case BLUE:
                processing.fill(0, 0, 255);
                break;
            case GREEN:
                processing.fill(0, 128, 0);
                break;
            case PURPLE:
                processing.fill(128, 0, 128);
                break;
            case YELLOW:
                processing.fill(255, 255, 0);
                break;
            case WHITE:
                processing.fill(0, 0, 0);
                break;
            case BLACK:
                processing.fill(255, 255, 255);
                break;
            default:
                System.out.println("Color not found");
        }
    }

    public void drawBall() {
        processing.ellipse(xPos, yPos, diameter, diameter);
        xPos += speed;
    }
}
