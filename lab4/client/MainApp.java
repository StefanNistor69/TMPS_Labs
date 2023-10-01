package client;

import domain.models.*;
import java.util.Arrays;
import domain.models.Dealership;
import domain.models.DealershipAdapter;
import domain.models.DealershipProxy;
import domain.models.PremiumDealershipDecorator;
import domain.models.Car;
import domain.models.Dealer;
import domain.models.Customer;
import utilities.DealershipNotifier;
import utilities.DiscountStrategy;
import utilities.FestiveDiscountStrategy;
import utilities.Command;
import utilities.BuyCarCommand;
import domain.models.SingleDealership;
import domain.models.DealershipGroup;
import utilities.PriceCalculator;

public class MainApp {
    public static void main(String[] args) {
        // Create a dealer and cars
        Dealer dealer = new Dealer();
        Car car = dealer.createCar("BMW", 60000);


        // Observer Pattern: Notify customers when a new car is added
        DealershipNotifier notifier = new DealershipNotifier();
        Customer alice = new Customer("Alice");
        notifier.addObserver(alice);
        notifier.notifyObservers("New cars are now available!");

        // Strategy Pattern: Apply different discount strategies
        DiscountStrategy discountStrategy = new FestiveDiscountStrategy();
        double discountedPrice = discountStrategy.applyDiscount(car.getPrice());
        System.out.println("Discounted Price for BMW: " + discountedPrice);

        // Set up dealerships
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

        // Command Pattern: Encapsulate the car buying operation
        Command buyCar = new BuyCarCommand(alice, adaptedDealership, car);


        System.out.println("Buying from individual dealerships :");
        buyCar.execute();


        System.out.println("\nBuying from dealership group:");
        alice.buyCar(dealershipGroup, car);
    }
}