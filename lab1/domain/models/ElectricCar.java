package domain.models;

import java.util.Objects;

public class ElectricCar extends Car {
    private ElectricCarModel electricModel;
    private int batteryCapacity;

    public ElectricCar(ElectricCarModel electricModel, int batteryCapacity) {
        super(null);
        this.electricModel = electricModel;
        this.batteryCapacity = batteryCapacity;
    }

    public ElectricCarModel getElectricModel() {
        return electricModel;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " with a " + batteryCapacity + " kWh battery";
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
