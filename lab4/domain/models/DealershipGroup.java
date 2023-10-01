package domain.models;

import domain.models.Dealership;
import domain.models.Car;

import java.util.ArrayList;
import java.util.List;

public class DealershipGroup implements Dealership {
    private String groupName;
    private List<Dealership> dealerships;

    public DealershipGroup(String groupName) {
        this.groupName = groupName;
        this.dealerships = new ArrayList<>();
    }

    public void addDealership(Dealership dealership) {
        dealerships.add(dealership);
    }

    public void removeDealership(Dealership dealership) {
        dealerships.remove(dealership);
    }

    @Override
    public void displayCarDetails(Car car) {
        System.out.println("Dealership Group: " + groupName);
        for (Dealership dealership : dealerships) {
            dealership.displayCarDetails(car);
        }
    }
}