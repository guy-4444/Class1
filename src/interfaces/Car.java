package interfaces;

public class Car extends Vehicle implements Goable, Soundable {
    @Override
    double costPerKm() {
        return 5.0;
    }

    @Override
    public double getSpeedKm() {
        return 300;
    }

    @Override
    public String makeSound() {
        return "Bip Bip";
    }

    @Override
    public int soundVolume() {
        return 80;
    }
}
