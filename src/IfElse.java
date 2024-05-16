public class IfElse {


public static void shortIf(int salary) {
    String result = (salary > 6000) ? "Over" : "Below";

    int tax = (salary > 10_000) ? 1000 : 0;

    System.out.println(result);
}

    public static void gradeSwitch(int grade) {
        switch (grade) {
            case 100:
                System.out.println("A");
                break;
            case 90:
                System.out.println("B");
                break;
            case 80:
                System.out.println("C");
                break;
            case 60:
                System.out.println("D");
                break;
            default:
                System.out.println("NA");
        }
    }

    public static void grade(int grade) {
        if (grade >= 100) {
            System.out.println("A");
        } else if (grade >= 90) {
            System.out.println("B");
        } else if (grade >= 80) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("FAILED");
        }
    }

    public static void asiron(int salary) {
        final int MINIMUM_SALARY = 7000;
        final int[] RATIOS = new int[]{
                2000,
                4000,
                6000,
                8000,
                10000,
                12000,
                14000,
                16000,
                18000,
                Integer.MAX_VALUE
        };

        for (int i = 0; i < RATIOS.length; i++) {
            if (salary < RATIOS[i]) {
                System.out.println("Asiron " + (i + 1));
                break;
            }
        }
    }
}
