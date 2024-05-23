import java.util.Scanner;

public class ZooTopia {

    public static void start() {

        Scanner sssss = new Scanner(System.in);

        Animal a1 = new Animal(10, "Lion");
        a1.setWeight(400);
        a1.setKosher(false);
        Animal a2 = new Animal(20, "Giraffe", 700, true);


        Animal[] animals = new Animal[] {a1, a2};

        for (int i = 0; i < animals.length; i++) {
            Animal a = animals[i];
            System.out.println((i+1) + ". " + a.toString());

        }


    }

}
