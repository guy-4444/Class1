package interfaces;

public class Hawk extends Animal implements Flyable, Soundable{
    @Override
    double getLifeSpan() {
        return 20;
    }

    @Override
    public double getSpeedKm() {
        return 300;
    }

    @Override
    public String makeSound() {
        return "ka ka ka";
    }

    @Override
    public int soundVolume() {
        return 70;
    }
}
