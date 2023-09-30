package domain.factory;

import domain.models.Car;
import domain.models.CarModel;
import domain.models.ElectricCar;
import domain.models.ElectricCarModel;

public interface AbstractFactory {
    Car createCar(CarModel model);

    ElectricCar createElectricCar(ElectricCarModel electricModel);

}
