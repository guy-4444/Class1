package technology;

public class TechnologyStore {

    public static void start() {
        Device[] devices = new Device[10];


        int input = 3;
        Device.TYPE type = Device.TYPE.getType(input);




        devices[0] = new Device(type, "iPhone 15", "Apple", 1000);
        devices[1] = new Device(Device.TYPE.SMARTPHONE, "iPhone 15 Pro", "Apple", 1200);
        devices[2] = new Device(Device.TYPE.TABLET, "Tab A9", "Samsung", 300);
        devices[3] = new Device(Device.TYPE.LAPTOP, "ttt1", "Razer", 3000);


        for (int i = 0; i < devices.length; i++) {
            Device device = devices[i];
            if (device == null) {
                break;
            }


        }

        // equal to:
        for (Device device : devices) {
            if (device == null) {
                break;
            }

            if (device.getType() == Device.TYPE.SMARTPHONE) {
                System.out.println(device);
            }
        }


        Human h = new Human("Guy", 40, 177, 70);
        h.jump();
        h.jump();

        Human.getNumOfHuman();


    }

}
