package shapes;

import amazon.Product;

public class ShapesManager {

    private Circle[] circles;
    private Square[] squares;
    private Rectangle[] rectangles;

    private int sizeOfCircles;
    private int sizeOfSquares;
    private int sizeOfRectangles;

    public ShapesManager() {
        circles = new Circle[4];
        squares = new Square[4];
        rectangles = new Rectangle[4];

        sizeOfCircles = 0;
        sizeOfSquares = 0;
        sizeOfRectangles = 0;
    }

    public void addCircle(Circle circle) {
        validateCirclesArray();

        circles[sizeOfCircles] = circle;
        sizeOfCircles++;
    }

    private void validateCirclesArray() {
        if (sizeOfCircles != circles.length) {
            return;
        }

        int newSize = sizeOfCircles * 2;
        newSize = Math.max(2, newSize);
        Circle[] temp = new Circle[newSize];
        for (int i = 0; i < circles.length; i++) {
            temp[i] = circles[i];
        }
        circles = temp;
    }

    public Circle getCircle(int i) {
        return circles[i];
    }
}
