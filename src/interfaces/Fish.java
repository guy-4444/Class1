package interfaces;

public class Fish extends Animal implements Swimable {
    @Override
    double getLifeSpan() {
        return 5;
    }

    @Override
    public double getSpeedKnots() {
        return 20;
    }
}
