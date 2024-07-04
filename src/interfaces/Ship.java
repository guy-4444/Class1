package interfaces;

public class Ship extends Vehicle implements Swimable, Soundable {
    @Override
    double costPerKm() {
        return 400.0;
    }

    @Override
    public double getSpeedKnots() {
        return 40;
    }

    @Override
    public String makeSound() {
        return "tssssssss";
    }

    @Override
    public int soundVolume() {
        return 160;
    }
}
