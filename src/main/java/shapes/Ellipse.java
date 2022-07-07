package shapes;

public class Ellipse{

    private int x_diameter;
    private int y_diameter;

    public Ellipse(int x_diameter, int y_diameter) {
        this.x_diameter = x_diameter;
        this.y_diameter = y_diameter;
    }

    public int getX_diameter() {
        return x_diameter;
    }

    public void setX_diameter(int x_diameter) {
        this.x_diameter = x_diameter;
    }

    public int getY_diameter() {
        return y_diameter;
    }

    public void setY_diameter(int y_diameter) {
        this.y_diameter = y_diameter;
    }
}
