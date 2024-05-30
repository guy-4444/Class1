import objects.Date;

public class Animal {

    private int type;
    private String name;
    private String[] desc;
    private boolean isKosher;
    private double weight;
    private Date date;

    public Animal(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animal(int type, String name, double weight, boolean isKosher) {
        this.type = type;
        this.name = name;
        this.isKosher = isKosher;
        this.weight = weight;
    }

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String[] getDesc() {
        return desc;
    }

    public boolean isKosher() {
        return isKosher;
    }

    public double getWeight() {
        return weight;
    }

    public void setKosher(boolean kosher) {
        isKosher = kosher;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return name + " - Average Weight: " + weight + " ,Kosher: " + isKosher;
    }
}
