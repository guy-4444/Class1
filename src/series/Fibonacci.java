package series;

public class Fibonacci extends Series {

    public Fibonacci(int index) {
        super(index);
    }

    @Override
    public int getElement() {
        int prev = 1;
        int sum = 1;
        for (int i = 1; i < index; i++) {
            int temp = sum;
            sum += prev;
            prev = temp;
        }

        return sum;
    }
}
