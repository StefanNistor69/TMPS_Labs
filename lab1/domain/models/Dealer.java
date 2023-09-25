package domain.models;

public class Dealer {
    private IStockManager stockManager;

    public Dealer(IStockManager stockManager) {
        this.stockManager = stockManager;
    }

    public void addCarToStock(Car car) {
        stockManager.addCarToStock(car);
        System.out.println("Dealer added " + car.getModel() + " to stock.");
    }

    public void addPaintToStock(Paint paint) {
        stockManager.addPaintToStock(paint);
        System.out.println("Dealer added paint of color " + paint.getColor() + " to stock.");
    }

    public void addPartToStock(Part part) {
        stockManager.addPartToStock(part);
        System.out.println("Dealer added part: " + part.getPartName() + " to stock.");
    }

    public void removePaintFromStock(Paint paint) {
        stockManager.removePaintFromStock(paint);
        System.out.println("Dealer removed paint of color " + paint.getColor() + " from stock.");
    }

    public void removePartFromStock(Part part) {
        stockManager.removePartFromStock(part);
        System.out.println("Dealer removed part: " + part.getPartName() + " from stock.");
    }
}
