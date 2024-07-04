package interfaces;

public class Worm extends Animal implements Goable {
    @Override
    double getLifeSpan() {
        return 3.5;
    }

    @Override
    public double getSpeedKm() {
        return 0.1;
    }
}
