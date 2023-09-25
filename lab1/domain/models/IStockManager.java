package domain.models;

import domain.models.Paint;
import domain.models.Part;
import domain.models.Car;

public interface IStockManager {
    void addCarToStock(Car car);
    void addPaintToStock(Paint paint);
    void addPartToStock(Part part);
    void removePaintFromStock(Paint paint);
    void removePartFromStock(Part part);

    String listAllItems();

    boolean isCarInStock(Car car);
}
