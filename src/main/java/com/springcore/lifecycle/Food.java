package com.springcore.lifecycle;

public class Food {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void init(){

        System.out.println("Init");
    }

    public void destroy(){
        System.out.println("Destroy");
    }

    @Override
    public String toString() {
        return "Food{" +
                "price=" + price +
                '}';
    }
}
