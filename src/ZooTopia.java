import objects.Date;

import java.util.Scanner;

public class ZooTopia {

    public static void start() {

        Scanner sssss = new Scanner(System.in);

        Date date2 = new Date(01, 01, 700);


        Animal a1 = new Animal(10, "Lion");
        a1.setWeight(400);
        a1.setKosher(false);
        a1.setDate(new Date(01, 01, 400));

        Animal a2 = new Animal(20, "Giraffe", 700, true);
        a2.setDate(new Date(01, 01, 600));

        Animal a3 = new Animal(20, "Giraffe", 700, true);
        a3.setDate(new Date(01, 01, 500));
        a3.setWeight(800);


        Animal[] animals = new Animal[] {a1, a2, a3};

        for (int i = 0; i < animals.length; i++) {
            Animal a = animals[i];
            System.out.println((i+1) + ". " + a.toString());

        }


    }

}













/*


        Date date1 = new Date(01, 01, 400);
        a1.setDate(date1);
same like:
        a1.setDate(new Date(01, 01, 400));



 */