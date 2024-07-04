package interfaces;

public class Submarine extends Vehicle implements Swimable {
    @Override
    double costPerKm() {
        return 850.0;
    }

    @Override
    public double getSpeedKnots() {
        return 20;
    }
}
