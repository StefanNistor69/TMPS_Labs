package domain.models;

import domain.models.Dealership;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void buyCar(Dealership dealership, Car car) {
        System.out.println(name + " is buying the following car:");
        dealership.displayCarDetails(car);
    }
}