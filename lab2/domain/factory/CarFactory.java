package domain.factory;

import domain.models.Car;
import domain.models.CarModel;
import domain.models.ElectricCar;
import domain.models.ElectricCarModel;

public class CarFactory implements AbstractFactory {
    @Override
    public Car createCar(CarModel model) {
        return new Car(model);
    }

    @Override
    public ElectricCar createElectricCar(ElectricCarModel electricModel) {
        return new ElectricCar(electricModel);
    }


}

