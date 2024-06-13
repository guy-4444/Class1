package shapes;

public class Square extends Rectangle {

    public Square(Point bl, int length) {
        super(bl, length, length);
    }

    @Override
    public String toString() {
        return super.toString() + ", [Square]";
    }
}
