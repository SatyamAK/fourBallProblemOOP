import processing.core.PApplet;
import objects.Ball;

public class MainClass extends PApplet {

    private final int HEIGHT = 480;
    private final int WIDTH = 640;
    private final int DIAMETER = 10;

    Ball ballOne = new Ball(DIAMETER, 1, 0);
    Ball ballTwo = new Ball(DIAMETER, 2, 0);
    Ball ballThree = new Ball(DIAMETER, 3, 0);
    Ball ballFour = new Ball(DIAMETER, 4, 0);

    public static void main(String[] args){
        PApplet.main("MainClass", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        setupWhiteBackground();
    }

    @Override
    public void draw() {
        ellipse(ballOne.getPosition(), HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(ballTwo.getPosition(), 2*HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(ballThree.getPosition(), 3*HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(ballFour.getPosition(), 4*HEIGHT/5, DIAMETER, DIAMETER);

        ballOne.setPosition((ballOne.getPosition()+ ballOne.getSpeed())%WIDTH);
        ballTwo.setPosition((ballTwo.getPosition()+ ballTwo.getSpeed())%WIDTH);
        ballThree.setPosition((ballThree.getPosition()+ ballThree.getSpeed())%WIDTH);
        ballFour.setPosition((ballFour.getPosition()+ ballFour.getSpeed())%WIDTH);
    }

    private void setupWhiteBackground() {
        background(255);
    }
}
