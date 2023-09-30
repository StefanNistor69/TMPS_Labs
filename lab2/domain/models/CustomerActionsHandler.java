
package domain.models;
import domain.models.IStockManager;
import domain.models.Car;
import domain.models.CarModel;
import domain.models.Customer;
import java.util.Scanner;

public class CustomerActionsHandler {

    private IStockManager stockManager;
    private Customer customer;

    public CustomerActionsHandler(IStockManager stockManager) {
        this.stockManager = stockManager;
        this.customer = new Customer();
    }

    public void handleActions() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an action: \n1. View Products \n2. Add Car to Wishlist \n3. Add Electric Car to Wishlist \n4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(stockManager.listAllItems());
                    break;
                case 2:
                    System.out.println("Enter Car Model to add to wishlist (SEDAN, SUV, TRUCK, HATCHBACK):");
                    Car carToWish = new Car(CarModel.valueOf(scanner.next().toUpperCase()));
                    if (stockManager.isCarInStock(carToWish)) {
                        customer.addToWishlist(carToWish);
                    } else {
                        System.out.println("Car not in stock!");
                    }
                    break;
                case 3:
                    System.out.println("Enter Electric Car Model to add to wishlist (TESLA, LEAF, NIO):");
                    ElectricCarModel electricModelToWish = ElectricCarModel.valueOf(scanner.next().toUpperCase());
                    ElectricCar electricToWish = new ElectricCar(electricModelToWish);
                    if (stockManager.isCarInStock(electricToWish)) {
                        customer.addElectricToWishlist(electricToWish);
                        System.out.println("Added " + electricToWish + " to your wishlist!");
                    } else {
                        System.out.println("Car not in stock!");
                    }
                    break;

                case 4:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
