import java.util.Scanner;

public class GPA {


    public static void start() {
        Scanner scanner = new Scanner(System.in);

        final String[] NAMES = new String[]{"AAA", "BBB", "CCC", "DDD", "EEE"};
        final double[] WEIGHTS = new double[]{0.2, 0.3, 0.4, 0.05, 0.05};
        double total = 0;

        for (int i = 0; i < NAMES.length; i++) {
            System.out.println("Enter grade for " + NAMES[i]);
            int input = scanner.nextInt();
            total += input * WEIGHTS[i];
        }

        System.out.println("Total: " + total);



        // get inputs into grades

        // calculation and print final grade

        // A-100 B-90 C-75 D-60 Failed


    }
}
