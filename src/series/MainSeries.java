package series;

public class MainSeries {

    public static void start() {

        // Fibonacci - 1 1 2 3 5 8 13 21
        // Factorial - 1 2 6 24 120 720

        //int getElement(int index)


        Fibonacci fib1 = new Fibonacci(6);
        Fibonacci fib2 = new Fibonacci(3);
        Fibonacci fib3 = new Fibonacci(10);
        Factorial fac1 = new Factorial(5);
        Factorial fac2 = new Factorial(6);
        Factorial fac3 = new Factorial(7);



        Series[] series = new Series[9];
        series[0] = new Fibonacci(3);
        series[1] = new Fibonacci(6);
        series[2] = new Fibonacci(10);
        series[3] = new Factorial(5);
        series[4] = new Factorial(6);
        series[5] = new Factorial(7);
        series[6] = new FractionHalf(5);
        series[7] = new FractionHalf(6);
        series[8] = new FractionHalf(7);




        for (Series s : series) {
            System.out.println(s.getElement());
        }


        System.out.println(fib1.getElement());
        System.out.println(fac2.getElement());

    }
}
