import objects.Date;

import java.util.Scanner;

public class ZooTopia {

    public static void start() {

        Scanner sssss = new Scanner(System.in);

        Date date2 = new Date(01, 01, 700);


        AnimalModel a1 = new AnimalModel(10, "Lion");
        a1.setWeight(400);
        a1.setKosher(false);
        a1.setDate(new Date(01, 01, 400));

        AnimalModel a2 = new AnimalModel(20, "Giraffe", 700, true);
        a2.setDate(new Date(01, 01, 600));

        AnimalModel a3 = new AnimalModel(20, "Giraffe", 700, true);
        a3.setDate(new Date(01, 01, 500));
        a3.setWeight(800);


        AnimalModel[] animals = new AnimalModel[] {a1, a2, a3};

        for (int i = 0; i < animals.length; i++) {
            AnimalModel a = animals[i];
            System.out.println((i+1) + ". " + a.toString());

        }


        AnimalModel simba = new AnimalModel(10, "Lion");
        simba.setWeight(300);
        simba.setKosher(false);
        simba.setDate(new Date(06, 06, 2024));

        AnimalModel scar = new AnimalModel(simba);
        scar.setWeight(400);
        scar.getDate().setM(01);

        System.out.println(simba);

        System.out.println(scar);

    }

}













/*


        Date date1 = new Date(01, 01, 400);
        a1.setDate(date1);
same like:
        a1.setDate(new Date(01, 01, 400));



 */