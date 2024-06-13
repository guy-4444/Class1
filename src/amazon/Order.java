package amazon;


import objects.Date;

import java.util.Arrays;

public class Order {

    private String address;
    private Product[] products;
    private Date date;
    private int productsSize = 0;

    public Order(Order another) {
        this.address = another.address;
        this.date = new Date(another.date);

        products = new Product[0];
        for (int i = 0; i < another.productsSize; i++) {
            Product copy = new Product(another.products[i]);
            addProduct(copy);
        }
    }

    public Order(String address) {
        this.address = address;
        products = new Product[0];
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Product[] getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        validateProductsArray();

        Product copy = new Product(product);

        products[productsSize] = copy;
        productsSize++;
    }

    public void removeProduct(int index) {
        if (index < 0) {
            return;
        }
        if (index >= productsSize) {
            // out of array index
            return;
        }


        for (int i = index; i < productsSize - 1; i++) {
            products[i] = products[i + 1];
        }
        productsSize--;
    }

    private void validateProductsArray() {
        if (productsSize == products.length) {

            int newSize = productsSize * 2;
            newSize = Math.max(2, newSize);
            Product[] temp = new Product[newSize];
            for (int i = 0; i < products.length; i++) {
                temp[i] = products[i];
            }
            products = temp;
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private int getNumOfProducts() {
        return products.length;
    }

    private double getTotalPrice() {
        double sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += (products[i].getPrice() / 100.0) * (100 - products[i].getCoupon());
        }

        return sum;
    }

    public void applyCoupon(int productIndex, int coupon) {
        if (coupon < 0 || coupon > 100) {
            return;
        }

        if (productIndex < 0 || productIndex >= productsSize) {
            return;
        }

        products[productIndex].setCoupon(coupon);
    }

    @Override
    public String toString() {
        return "Order: " +
                "Address= " + address +
                "\n" + getNumOfProducts() + " products:" +
                "\n" + Arrays.toString(products) +
                "\nDate=" + date +
                "\nTotal=" + getTotalPrice();
    }
}





/*



    increase array size by +1
    public void addProduct(Product product) {
        // new array (size + 1)
        int newSize = products.length + 1;
        Product[] temp = new Product[newSize];

        // copy old items
        for (int i = 0; i < products.length; i++) {
            temp[i] = products[i];
        }

        // insert the new item
        temp[temp.length - 1] = product;

        // new assign
        products = temp;
    }

 */