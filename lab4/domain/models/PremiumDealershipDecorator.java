package domain.models;



public class PremiumDealershipDecorator extends DealershipDecorator {
    public PremiumDealershipDecorator(Dealership dealership) {
        super(dealership);
    }

    @Override
    public void displayCarDetails(Car car) {
        System.out.println("Premium Car details:");
        super.displayCarDetails(car);
    }
}