package series;

public class Factorial extends Series {


    public Factorial(int index) {
        super(index);
    }

    public int getNumber() {
        return 1;
    }

    @Override
    public int getElement() {
        int sum = 1;
        for (int i = 1; i <= index; i++) {
            sum *= i;
        }

        return sum;
    }
}
