package utilities;

import domain.models.Car;

public class PriceCalculator {
    public static double calculateDiscountedPrice(Car car, double discount) {
        return car.getPrice() - (car.getPrice() * discount / 100);
    }
}