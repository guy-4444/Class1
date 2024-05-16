import java.util.Scanner;

public class Inputs {

    public static void salaryCalculator() {
        final double HEALTH_SOCIAL = 0.12;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi to salary calculator");

        System.out.println("Enter age:");
        int age = scanner.nextInt();

        System.out.println("Enter gross salary:");
        double gross = scanner.nextDouble();


        double tax = calculateTax(gross, 2.25);

        double social = 0.0;
        if (age > 18) {
            social = gross * HEALTH_SOCIAL;
        }

        double pension = calculatePension(gross);


        double education = calculateEducationFund(gross);
        ;

        double salary = gross - tax - social - pension - education;

        System.out.println("Enter gross salary:" + salary);

    }

    private static double calculatePension(double gross) {
        final double PENSION_RATIO = 0.06;
        return gross * PENSION_RATIO;
    }

    private static double calculateEducationFund(double gross) {
        final double MAX_FOR_EDUCATION = 15712;
        double education = Math.min(gross, MAX_FOR_EDUCATION) * 0.025;
        return education;
    }

    private static double calculateTax(double gross, double nz) {
        if (gross < 0) {
            return 0;
        }
        if (nz < 0) {
            return 0;
        }

        final double NZ_RATIO = 242.0;
        final double[] STEPS = new double[]{0, 7_010, 10_060, 16_150, 22_440, 46_690, 60_130};
        final double[] RATES = new double[]{0.1, 0.14, 0.20, 0.31, 0.35, 0.47, 0.5};
        double tax = 0;

        for (int i = STEPS.length - 1; i > 0; i--) {
            if (gross > STEPS[i]) {
                tax += (gross - STEPS[i]) * RATES[i];
                gross = STEPS[i];
            }
        }
        tax += gross * RATES[0];

        double nzSum = nz * NZ_RATIO;
        tax = Math.max(0, tax - nzSum);

        return tax;
    }

    public static void add() {
        String data = "56.8";
        int distance = (int) Double.parseDouble(data);
        System.out.println("distance = " + distance);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("Your age: " + age);

        System.out.println("Enter name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Your name: " + name);
    }


}
