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

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Shape)) {
            return false;
        }

        Shape otherShape = (Shape) other;
        return position.equals(otherShape.position);
    }
}
