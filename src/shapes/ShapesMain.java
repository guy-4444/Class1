package shapes;

public class ShapesMain {

    private static ShapesManager shapesManager;


    public static void start() {
        shapesManager = new ShapesManager();

        Point p1 = new Point(0, 0);
        Point p2 = new Point(10, 5);

        double distance1 = Point.distance(p1, p2);
        System.out.println(distance1);

        double distance2 = p2.distanceFrom(p1);
        System.out.println(distance1);


        Circle circle = new Circle(new Point(8, 8), 3);
        Square square = new Square(new Point(3, 5), 4);
        Rectangle rectangle = new Rectangle(new Point(2, 5), 5, 4);

        System.out.println(circle);

        shapesManager.addCircle(circle);
        shapesManager.addCircle(circle);

        circle = new Circle(new Point(8, 8), 3);

        shapesManager.addCircle(circle);
        shapesManager.addCircle(circle);

        shapesManager.getCircle(2).setRadius(90);

        shapesManager.addCircle(circle);

        System.out.println(circle);
    }

}
