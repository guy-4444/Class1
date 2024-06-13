package shapes;

public abstract class Shape {

    protected Point position;

    public Shape(Point position) {
        this.position = position;
    }

    public abstract double getPerimeter();

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "position=" + position +
                '}';
    }
}
