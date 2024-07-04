package interfaces;

public class Lion extends Animal implements Goable, Soundable {
    @Override
    double getLifeSpan() {
        return 35;
    }

    @Override
    public double getSpeedKm() {
        return 40;
    }

    @Override
    public String makeSound() {
        return "Raaaaa";
    }

    @Override
    public int soundVolume() {
        return 120;
    }
}
