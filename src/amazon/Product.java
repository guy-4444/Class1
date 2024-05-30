package amazon;

public class Product {


    private String name;
    private double price;
    private int coupon = 0;
    private double weight = 0;

    public Product(Product another) {
        this.name = another.name;
        this.price = another.price;
        this.coupon = another.coupon;
        this.weight = another.weight;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, int coupon) {
        this.name = name;
        this.price = price;
        this.coupon = coupon;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCoupon() {
        return coupon;
    }

    public void setCoupon(int coupon) {
        if (coupon >= 1  &&  coupon <= 100) {
            this.coupon = coupon;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        String cpn = (coupon > 0) ? " (" + coupon + "%)" : "";
        return "Product: " + name + " - " + price + cpn + ", weight = " + weight;
    }
}
