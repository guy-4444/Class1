package amazon;

import objects.Date;

public class Amazon {

    public static void start() {

        Product p1 = new Product("Playstation", 1000);
        Product p2 = new Product("Gameboy", 200, 20);



        Order order1 = new Order("Mivtsa Kadesh 138");
        order1.setDate(new Date(30, 05, 2024));
        order1.addProduct(p1);
        order1.addProduct(p2);



        Product p3 = new Product("PC", 2000, 10);
        Order order2 = new Order("Bnei Efraim 202");
        order2.setDate(new Date(30, 06, 2024));
        order2.addProduct(p1);
        order2.addProduct(p3);
        p1.setCoupon(30);


        System.out.println(order1);
        System.out.println("- - - - - - - - ");
        System.out.println(order2);

    }
}
