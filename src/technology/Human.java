package technology;

import java.sql.Statement;

public class Human {

    private String name;
    private int age;
    private double height;
    private double weight;

    public Human(String name, int age, double height, double weight) {
        counter++;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void jump() {
        System.out.println("Hop!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



    private static long counter = 0;

    public static long getNumOfHuman() {
        return counter;
    }
}
