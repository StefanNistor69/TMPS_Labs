package domain.models;



public class DealershipAdapter implements Dealership {
    private Dealership dealership;

    public DealershipAdapter(Dealership dealership) {
        this.dealership = dealership;
    }

    @Override
    public void displayCarDetails(Car car) {
        dealership.displayCarDetails(car);
    }
}