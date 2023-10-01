package domain.models;



public class DealershipDecorator implements Dealership {
    protected Dealership dealership;

    public DealershipDecorator(Dealership dealership) {
        this.dealership = dealership;
    }

    @Override
    public void displayCarDetails(Car car) {
        dealership.displayCarDetails(car);
    }
}