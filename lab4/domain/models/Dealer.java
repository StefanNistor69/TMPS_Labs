package domain.models;

public class Dealer {
    public Car createCar(String model, double price) {
        System.out.println("Dealer Added a "+ model + " to the store");
        return new Car(model, price);
    }
}