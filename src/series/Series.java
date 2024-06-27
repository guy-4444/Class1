package series;

public abstract class Series {

    protected int index = 1;

    public Series(int index) {
        this.index = index;
    }

    public abstract int getElement();

    public String toString() {
        return "Series{" +
                "index=" + index +
                '}';
    }
}
