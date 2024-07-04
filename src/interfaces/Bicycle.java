package interfaces;

public class Bicycle extends Vehicle implements Goable {
    @Override
    double costPerKm() {
        return 0.0;
    }

    @Override
    public double getSpeedKm() {
        return 20;
    }
}
