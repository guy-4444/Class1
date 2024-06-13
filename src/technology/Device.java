package technology;

public class Device {

    public enum TYPE {
        SMARTPHONE,
        TABLET,
        SMARTWATCH,
        LAPTOP,
        PC,
        CONSOLE,
        OTHER;

        public static TYPE getType(int input) {
            switch (input) {

                case 1:
                    return Device.TYPE.SMARTPHONE;
                case 2:
                    return Device.TYPE.TABLET;
                case 3:
                    return Device.TYPE.SMARTWATCH;
            }

            return TYPE.OTHER;
        }
    }

    private TYPE type;
    private String model;
    private String manufacturer;
    private double price;

    public Device(TYPE type, String model, String manufacturer, double price) {
        this.type = type;
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Device{" +
                "type=" + type +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
}
