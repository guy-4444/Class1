import java.util.Scanner;

public class Zoo {

    static int[] types;
    static String[] names;
    static int[] ages;

    static int[] dateTypes = new int[]{10, 20, 30, 40, 50};
    static String[] dataNames = new String[]{"Bunny", "Donkey", "Eagle", "Elephant", "Tiger",};
    static int[] dataLifeSpan = new int[]{12, 30, 20, 100, 40,};

    public static void start() {
        // scan animals
        scanAnimals();

        // calculate and print
        printAnimals();
    }

    private static void scanAnimals() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of animals:");
        int sizeOfArray = scanner.nextInt();

        types = new int[sizeOfArray];
        names = new String[sizeOfArray];
        ages = new int[sizeOfArray];


        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println("Enter type of animal:");
            int type = scanner.nextInt();
            System.out.println("Enter name:");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Enter age:");
            int age = scanner.nextInt();

            types[i] = type;
            names[i] = name;
            ages[i] = age;
        }



    }

    private static void printAnimals() {
        for (int i = 0; i < types.length; i++) {
            int type = types[i];
            String name = names[i];
            int age = ages[i];

            int animalIndexInData = -1;
            for (int j = 0; j < dateTypes.length; j++) {
                if (type == dateTypes[j]) {
                    animalIndexInData = j;
                    break;
                }
            }

            String animal = dataNames[animalIndexInData];
            int lifeSpan = dataLifeSpan[animalIndexInData];

            System.out.println((i + 1) + ". " + animal + " " + name + " " + age + "(" + lifeSpan + ")");

        }
    }

}
