package utilities;
import domain.models.Car;
import domain.models.Customer;
import domain.models.Dealership;
import utilities.Command;

public class BuyCarCommand implements Command {
    private Customer customer;
    private Dealership dealership;
    private Car car;

    public BuyCarCommand(Customer customer, Dealership dealership, Car car) {
        this.customer = customer;
        this.dealership = dealership;
        this.car = car;
    }

    @Override
    public void execute() {
        customer.buyCar(dealership, car);
    }
}
