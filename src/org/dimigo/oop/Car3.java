package org.dimigo.oop;

public class Car3 {
    private String company,model,color;
    private int maxSpeed,price;

    public Car3(String company, String model, String color, int maxSpeed, int price) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }
    public Car3(String company, String model, String color, int maxSpeed) {
        this(company,model,color,maxSpeed,0);
    }
    public Car3(String company, String model, String color) {
        this(company,model,color,0,0);
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
