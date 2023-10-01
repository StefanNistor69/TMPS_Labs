package client;

import java.util.Arrays;
import domain.models.Dealership;
import domain.models.DealershipAdapter;
import domain.models.DealershipProxy;
import domain.models.PremiumDealershipDecorator;
import domain.models.Car;
import domain.models.Dealer;
import domain.models.Customer;
import domain.models.SingleDealership;
import domain.models.DealershipGroup;
import utilities.PriceCalculator;

public class MainApp {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        Car car = dealer.createCar("BMW", 60000);


        Dealership dealership1 = new SingleDealership("Central Dealership");
        Dealership dealership2 = new SingleDealership("Westside Dealership");
        Dealership dealership3 = new SingleDealership("Eastside Dealership");

        DealershipGroup dealershipGroup = new DealershipGroup("City Dealerships");
        dealershipGroup.addDealership(dealership1);
        dealershipGroup.addDealership(dealership2);
        dealershipGroup.addDealership(dealership3);

        Dealership adaptedDealership = new DealershipAdapter(new DealershipProxy(new PremiumDealershipDecorator(new Dealership() {
            @Override
            public void displayCarDetails(Car car) {
                System.out.println("Car Model: " + car.getModel());
                System.out.println("Car Price: " + car.getPrice());
            }
        })));

        Customer customer = new Customer("Alice");
        System.out.println("Buying from individual dealerships :");
        customer.buyCar(adaptedDealership, car);

        System.out.println("\nBuying from dealership group:");
        customer.buyCar(dealershipGroup, car);

    }
}