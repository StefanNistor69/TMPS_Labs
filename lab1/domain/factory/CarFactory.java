package domain.factory;

import domain.models.Car;
import domain.models.CarModel;

public class CarFactory {
    public Car createCar(CarModel model) {
        return new Car(model);
    }
}
