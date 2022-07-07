package objects;

public class Ball {

    private int diameter;
    private int speed;
    private int position;

    public Ball(int x_diameter, int speed, int position) {
        this.diameter = x_diameter;
        this.speed = speed;
        this.position = position;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
