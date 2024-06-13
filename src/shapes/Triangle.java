package shapes;

public class Triangle extends Shape {

    private int base;
    private int height;

    public Triangle(Point bl, int base, int height) {
        super(bl);
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getArea() {
        return (base * height ) / 2.0;
    }

    @Override
    public double getPerimeter() {
        // Guy style
        return 2 * base ;
    }
}
