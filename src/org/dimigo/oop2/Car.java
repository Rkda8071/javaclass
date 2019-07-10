package org.dimigo.oop2;

public class Car {
    private static String company;
    private String name;
    private static Car ang;

    private Car() {
    }
    private Car(String name) {
        this.name = name;
    }

    static {
        Car ang = new Car("angCar");
    }
    public static Car getang(){
        return ang;
    }
    public static void setCompany(String company) {
        Car.company = company;
    }

    public void setName(String name) {
        ang.name = name;
    }

    public static String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return company + " : " + name;
    }
}
