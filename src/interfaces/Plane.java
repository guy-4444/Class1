package interfaces;

public class Plane extends Vehicle implements Flyable, Soundable {
    @Override
    double costPerKm() {
        return 2000.0;
    }

    @Override
    public double getSpeedKm() {
        return 700;
    }

    @Override
    public String makeSound() {
        return "Brrrrrr";
    }

    @Override
    public int soundVolume() {
        return 140;
    }
}
