package domain.models;

import domain.models.*;
import domain.factory.CarFactory;

import java.util.*;

public class Stock implements IStockManager {
    private List<Car> cars = new ArrayList<>();
    private List<Paint> paints = new ArrayList<>();
    private List<Part> parts = new ArrayList<>();
    private CarFactory factory = new CarFactory();

    @Override
    public void addCarToStock(Car car) {
        cars.add(car);
    }

    @Override
    public void addPaintToStock(Paint paint) {
        paints.add(paint);
    }

    @Override
    public void addPartToStock(Part part) {
        parts.add(part);
    }

    @Override
    public void removePaintFromStock(Paint paint) {
        paints.remove(paint);
    }

    @Override
    public void removePartFromStock(Part part) {
        parts.remove(part);
    }
    @Override
    public String listAllItems() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cars in Stock: ").append(cars.toString()).append("\n");
        sb.append("Paints in Stock: ").append(paints.toString()).append("\n");
        sb.append("Parts in Stock: ").append(parts.toString()).append("\n");
        return sb.toString();
    }
    @Override
    public boolean isCarInStock(Car car) {
        return cars.contains(car);
    }

}
