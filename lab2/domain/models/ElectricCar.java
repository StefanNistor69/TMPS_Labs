package domain.models;

import java.util.Objects;

public class ElectricCar extends Car {
    private ElectricCarModel electricModel;


    public ElectricCar(ElectricCarModel electricModel) {
        super(null);
        this.electricModel = electricModel;

    }

    public ElectricCarModel getElectricModel() {
        return electricModel;
    }


    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        ElectricCar car = (ElectricCar) obj;
        return electricModel == car.electricModel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(electricModel);
    }
}
