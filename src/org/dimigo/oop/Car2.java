package org.dimigo.oop;

public class Car2 {
    private String company,model,color;
    private int maxSpeed,price;

    public Car2(String company, String model, String color, int maxSpeed, int price) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getPrice() {
        return price;
    }
}
