
package domain.models;
import domain.models.IStockManager;
import domain.factory.CarFactory;
import domain.models.Car;
import domain.models.CarModel;
import domain.models.Paint;
import domain.models.Part;

import java.util.Scanner;

public class DealerActionsHandler {

    private IStockManager stockManager;

    public DealerActionsHandler(IStockManager stockManager) {
        this.stockManager = stockManager;
    }

    public void handleActions() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an action: \n1. Add Car to Stock \n2. Remove Paint from Stock \n3. Remove Part from Stock \n4. Add Electric Car to stock \n5. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    CarBuilder builder = new CarBuilder(stockManager);
                    System.out.println("Enter Car Model (SEDAN, SUV, TRUCK, HATCHBACK):");
                    builder.setModel(CarModel.valueOf(scanner.next().toUpperCase()));

                    System.out.println("Enter paint color:");
                    builder.setPaint(new Paint(scanner.next()));

                    System.out.println("Do you want to add parts? (yes/no)");
                    while ("yes".equalsIgnoreCase(scanner.next())) {
                        System.out.println("Enter part name:");
                        builder.setPart(new Part(scanner.next()));
                        System.out.println("Add another part? (yes/no)");
                    }

                    Car car = builder.build();
                    stockManager.addCarToStock(car);
                    break;
                case 2:
                    System.out.println("Enter paint color to remove:");
                    Paint paintToRemove = new Paint(scanner.next());
                    stockManager.removePaintFromStock(paintToRemove);
                    break;
                case 3:
                    System.out.println("Enter part name to remove:");
                    Part partToRemove = new Part(scanner.next());
                    stockManager.removePartFromStock(partToRemove);
                    break;
                case 4:
                    CarFactory electricFactory = new CarFactory();
                    System.out.println("Choose an electric car model:");
                    ElectricCarModel chosenModel = ElectricCarModel.valueOf(scanner.next().toUpperCase());
                    ElectricCar electricCar = electricFactory.createElectricCar(chosenModel);
                    stockManager.addCarToStock(electricCar);
                    System.out.println("Dealer added " + electricCar + " to stock");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
