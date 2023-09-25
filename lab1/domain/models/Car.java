package domain.models;

import java.util.Objects;

import domain.models.CarModel;
import domain.models.Paint;

public class Car {
    private CarModel model;
    private Paint paint;

    public Car(CarModel model) {
        this.model = model;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public CarModel getModel() {
        return model;
    }

    public Paint getPaint() {
        return paint;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Car car = (Car) obj;
        return model == car.model;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }

}
