import java.util.Scanner;

// Base class for inventory management
class ProductStockLevel {
    void displayWelcomeMessage() {
        System.out.println("===================================");
        System.out.println("   INVENTORY MANAGEMENT SYSTEM    ");
        System.out.println("===================================");
        System.out.println("Available product categories and stock levels:");
    }
}

// Electronics class for managing electronic products
class Electronics extends ProductStockLevel {
    void displayElectronicsMenu() {
        System.out.println("\nAvailable Electronics:");
        System.out.println("1. TV\n2. Washing Machine\n3. Fridge\n4. Other Items");
        System.out.print("Enter the product number to view details: ");
    }

    void handleElectronics() {
        Scanner scanner = new Scanner(System.in);
        displayElectronicsMenu();
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\nTV\nAvailable Brands:");
                System.out.println("1. Sony - Stock: 25 units - Price: $85/unit");
                System.out.println("2. Panasonic - Stock: 20 units - Price: $80/unit");
                break;
            case 2:
                System.out.println("\nWashing Machine\nAvailable Brands:");
                System.out.println("1. Bosch - Stock: 15 units - Price: $95/unit");
                System.out.println("2. IFB - Stock: 10 units - Price: $85/unit");
                break;
            case 3:
                System.out.println("\nFridge\nAvailable Brands:");
                System.out.println("1. Whirlpool - Stock: 10 units - Price: $90/unit");
                System.out.println("2. LG - Stock: 5 units - Price: $95/unit");
                break;
            case 4:
                handleOtherElectronics();
                break;
            default:
                System.out.println("Invalid choice! Returning to the main menu.");
        }
    }

    void handleOtherElectronics() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the product name (e.g., Oven, Mixer, Grinder): ");
        String productName = scanner.nextLine();

        switch (productName.toLowerCase()) {
            case "oven":
                System.out.println("Oven - Available Brands:");
                System.out.println("1. LG - Stock: 30 units - Price: $40/unit");
                System.out.println("2. Panasonic - Stock: 20 units - Price: $45/unit");
                break;
            case "mixer":
            case "grinder":
                System.out.println("Mixer/Grinder - Available Brands:");
                System.out.println("1. Preethi - Stock: 30 units - Price: $50/unit");
                System.out.println("2. Prestige - Stock: 25 units - Price: $55/unit");
                break;
            default:
                System.out.println("Sorry, the product is not available. We'll restock soon based on demand.");
        }
    }
}

// Gadgets class for managing gadget products
class Gadgets extends ProductStockLevel {
    void displayGadgetsMenu() {
        System.out.println("\nAvailable Gadgets:");
        System.out.println("1. Mobile Phone\n2. Laptop\n3. Headset/Earbuds\n4. Other Items");
        System.out.print("Enter the product number to view details: ");
    }

    void handleGadgets() {
        Scanner scanner = new Scanner(System.in);
        displayGadgetsMenu();
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\nMobile Phones\nAvailable Brands:");
                System.out.println("1. Samsung - Stock: 25 units - Price: $850/unit");
                System.out.println("2. Apple - Stock: 10 units - Price: $1200/unit");
                break;
            case 2:
                System.out.println("\nLaptops\nAvailable Brands:");
                System.out.println("1. Dell - Stock: 15 units - Price: $900/unit");
                System.out.println("2. Asus - Stock: 10 units - Price: $950/unit");
                break;
            case 3:
                System.out.println("\nHeadset/Earbuds\nAvailable Brands:");
                System.out.println("1. Boat - Stock: 50 units - Price: $40/unit");
                System.out.println("2. Noise - Stock: 30 units - Price: $50/unit");
                break;
            case 4:
                handleOtherGadgets();
                break;
            default:
                System.out.println("Invalid choice! Returning to the main menu.");
        }
    }

    void handleOtherGadgets() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the product name (e.g., Smartwatch, Tablet): ");
        String productName = scanner.nextLine();

        System.out.println("Sorry, " + productName + " is not available. We'll restock soon based on demand.");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n===================================");
            System.out.println("       PRODUCT INVENTORY MENU      ");
            System.out.println("===================================");
            System.out.println("1. Electronics");
            System.out.println("2. Gadgets");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Electronics electronics = new Electronics();
                    electronics.displayWelcomeMessage();
                    electronics.handleElectronics();
                    break;
                case 2:
                    Gadgets gadgets = new Gadgets();
                    gadgets.displayWelcomeMessage();
                    gadgets.handleGadgets();
                    break;
                case 3:
                    System.out.println("Thank you for using the Inventory Management System. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please select again.");
            }
        }

        scanner.close();
    }
}
