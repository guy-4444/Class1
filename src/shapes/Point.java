package shapes;

public class Point {

    private int x;
    private int y;
    private char color = 'B';

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, char color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
        this.color = other.color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public double distanceFrom(Point other) {
        return Math.sqrt( Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2) );
        // equal to:
        //return distance(this, other);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ") " + color;
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt( Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2) );
    }


}
