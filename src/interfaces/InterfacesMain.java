package interfaces;

public class InterfacesMain {

    public static void start() {

        System.out.println("- - START - -");
        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new Car();
        vehicles[1] = new Plane();
        vehicles[2] = new Bicycle();
        vehicles[3] = new Ship();
        vehicles[4] = new Submarine();

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getClass().getName() + " - " + vehicle.costPerKm());
        }

        System.out.println("- - - - - - - -");
        Animal[] animals = new Animal[4];
        animals[0] = new Hawk();
        animals[1] = new Lion();
        animals[2] = new Worm();
        animals[3] = new Fish();

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getName() + " - " + animal.getLifeSpan());
        }


        Object[] all = new Object[vehicles.length + animals.length];
        int index = 0;
        for (Vehicle vehicle : vehicles) {
            all[index] = vehicle;
            index++;
        }
        for (Animal animal : animals) {
            all[index] = animal;
            index++;
        }


        for (Object o : all) {
            if (o instanceof Goable) {
                Goable goable = (Goable) o;
                System.out.println(o.getClass().getName() + " - " + goable.getSpeedKm());
            }
        }


        Soundable maxNoise = null;
        for (Object o : all) {
            if (o instanceof Soundable) {
                Soundable soundable = (Soundable) o;
                if (maxNoise == null) {
                    maxNoise = soundable;
                    continue;
                }

                if (soundable.soundVolume() > maxNoise.soundVolume()) {
                    maxNoise = soundable;
                }
            }
        }
        System.out.println("The most noise maker: " + maxNoise.getClass().getName() + " - " + maxNoise.makeSound());


    }
}
