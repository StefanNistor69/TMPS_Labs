
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
            System.out.println("Choose an action: \n1. Add Car to Stock \n2. Add Paint to Stock \n3. Add Part to Stock \n4. Remove Paint from Stock \n5. Remove Part from Stock \n6. Add Electric Car to stock \n7. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    CarFactory factory = new CarFactory();
                    System.out.println("Enter Car Model (SEDAN, SUV, TRUCK, HATCHBACK):");
                    Car car = factory.createCar(CarModel.valueOf(scanner.next().toUpperCase()));
                    stockManager.addCarToStock(car);
                    break;
                case 2:
                    System.out.println("Enter paint color:");
                    Paint paint = new Paint(scanner.next());
                    stockManager.addPaintToStock(paint);
                    break;
                case 3:
                    System.out.println("Enter part name:");
                    Part part = new Part(scanner.next());
                    stockManager.addPartToStock(part);
                    break;
                case 4:
                    System.out.println("Enter paint color to remove:");
                    Paint paintToRemove = new Paint(scanner.next());
                    stockManager.removePaintFromStock(paintToRemove);
                    break;
                case 5:
                    System.out.println("Enter part name to remove:");
                    Part partToRemove = new Part(scanner.next());
                    stockManager.removePartFromStock(partToRemove);
                    break;
                case 6:
                    System.out.println("Choose an electric car model (TESLA, LEAF, NIO):");
                    ElectricCarModel chosenModel = ElectricCarModel.valueOf(scanner.next().toUpperCase());
                    System.out.println("Enter battery capacity in kWh:");
                    int batteryCapacity = scanner.nextInt();
                    ElectricCar electricCar = new ElectricCar(chosenModel, batteryCapacity);
                    stockManager.addCarToStock(electricCar);
                    System.out.println("Dealer added " + electricCar + " to stock");
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
