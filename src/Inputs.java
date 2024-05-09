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
        double tax = 0.0;
        if (gross > 6000) {
            tax = (gross - 6000) * 0.35;
        }
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
