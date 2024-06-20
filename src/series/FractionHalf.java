package series;

public class FractionHalf extends Series {

    public FractionHalf(int index) {
        super(index);
    }

    @Override
    public int getElement() {
        int sum = 1;
        for (int i = 1; i <= index; i++) {
            sum += i;
        }
        return sum;
    }
}
