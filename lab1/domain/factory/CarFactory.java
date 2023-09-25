package domain.factory;

import domain.models.Car;
import domain.models.CarModel;
import domain.models.ElectricCar;
import domain.models.ElectricCarModel;

public class CarFactory {
    public Car createCar(CarModel model) {
        return new Car(model);
    }

    public ElectricCar createElectricCar(ElectricCarModel electricModel, int batteryCapacity) {
        return new ElectricCar(electricModel, batteryCapacity);
    }
}
