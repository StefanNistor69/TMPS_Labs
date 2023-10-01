package domain.models;

import domain.models.Dealership;

public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String notification) {
        System.out.println(name + " received notification: " + notification);
    }

    public void buyCar(Dealership dealership, Car car) {
        System.out.println(name + " is buying the following car:");
        dealership.displayCarDetails(car);
    }
}