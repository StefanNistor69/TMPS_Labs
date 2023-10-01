package domain.models;

import domain.models.Dealership;


public class SingleDealership implements Dealership {
    private String name;

    public SingleDealership(String name) {
        this.name = name;
    }

    @Override
    public void displayCarDetails(Car car) {
        System.out.println("Dealership: " + name);
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Price: " + car.getPrice());
    }
}
