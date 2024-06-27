package shapes;

public class Circle extends Shape {

    private int radius;

    public Circle(Point center, int radius) {
        super(center);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }



    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "" + super.toString() +
                ", radius=" + radius;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Circle)) {
            return false;
        }

        Circle otherCircle = (Circle) other;

        return super.equals(otherCircle) && (radius == otherCircle.radius);
    }
}
