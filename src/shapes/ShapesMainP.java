package shapes;

public class ShapesMainP {

    public static void start() {

        Shape[] shapes = new Shape[7];
        Point p = new Point(0, 0);

        shapes[0] = new Circle(p, 3);
        shapes[1] = new Circle(p, 4);
        shapes[2] = new Circle(p, 5);
        shapes[3] = new Square(p, 10);
        shapes[4] = new Square(p, 12);
        shapes[5] = new Rectangle(p, 12, 6);
        shapes[6] = new Triangle(p, 12, 6);

        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
        }

        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Circle) {
                ((Circle) shape).getArea();
            } else if (shape instanceof Rectangle) {
                ((Rectangle) shape).getArea();
            } else if (shape instanceof Triangle) {
                ((Triangle) shape).getArea();
            }
        }


        for (Shape shape : shapes) {
            shape.getPerimeter();
        }
    }

}
