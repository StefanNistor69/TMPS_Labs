package domain.models;



public class DealershipProxy implements Dealership {
    private Dealership dealership;

    public DealershipProxy(Dealership dealership) {
        this.dealership = dealership;
    }

    @Override
    public void displayCarDetails(Car car) {
        if (car.getPrice() > 50000) {
            System.out.println("This is a premium car!");
        }
        dealership.displayCarDetails(car);
    }
}