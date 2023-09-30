package client;


import domain.models.*;



import java.util.Scanner;

public class MainApp {

    private static IStockManager stockManager = Stock.getInstance();



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DealerActionsHandler dealerHandler = new DealerActionsHandler(stockManager);
        CustomerActionsHandler customerHandler = new CustomerActionsHandler(stockManager);
        while (true) {
            System.out.println("Login as: \n1. Dealer \n2. Customer \n3. Exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                dealerHandler.handleActions();
            } else if (choice == 2) {
                customerHandler.handleActions();
            } else if (choice == 3) {
                System.out.println("Exiting the program...");
                scanner.close();
                return;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }



}
