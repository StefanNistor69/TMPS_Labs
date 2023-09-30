package domain.models;


public class CarBuilder {
    private CarModel model;
    private Paint paint;
    private Part part;
    private IStockManager stockManager;




    public CarBuilder(IStockManager stockManager) {  // Modify the constructor
        this.stockManager = stockManager;
    }

    public CarBuilder setModel(CarModel model) {
        this.model = model;
        return this;
    }

    public CarBuilder setPaint(Paint paint) {
        this.paint = paint;
        return this;
    }

    public CarBuilder setPart(Part part) {
        this.part = part;
        return this;
    }

    public Car build() {
        Car car = new Car(model);
        car.setPaint(paint);
        car.setPart(part);
        // Add the paint and parts to the stock
        stockManager.addPaintToStock(paint);

        stockManager.addPartToStock(part);

        return car;
    }

}
