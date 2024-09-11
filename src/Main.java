import Laptop.*;
import TargetObject.PowerOutlet;
import SmartphoneCharger.*;
import Refrigerator.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean stooper = false;

        do {
            System.out.println("Select what device you want to plug-in: ");
            System.out.println("1. Laptop");
            System.out.println("2. Refrigerator");
            System.out.println("3. Smartphone");

            System.out.print("Please Choose a Number: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Plug-Type: ");
                    String laptopplugtype = scanner.next();

                    System.out.println("Enter Voltage: ");
                    int laptopvoltage = scanner.nextInt();

                    if (laptopvoltage > 200 ) {
                        System.out.println("Voltage is too high. Cannot proceed.");
                    } else {
                        System.out.println("Enter Amperage: ");
                        int laptopamperage = scanner.nextInt();
                        LaptopAdapter adapterLaptop = new LaptopAdapter(new Laptop(laptopplugtype, laptopvoltage, laptopamperage));
                        System.out.println(adapterLaptop.plugIn());
                    }
                    break;

                case 2:
                    System.out.println("Enter Plug-Type: ");
                    String refplugtype = scanner.next();

                    System.out.println("Enter Voltage: ");
                    int refvoltage = scanner.nextInt();

                    if (refvoltage > 200) {
                        System.out.println("Voltage is too high. Cannot proceed.");
                    } else {
                        System.out.println("Enter Amperage: ");
                        int refamperage = scanner.nextInt();
                        RefrigeratorAdapter adapterRefrigerator = new RefrigeratorAdapter(new Refrigerator(refplugtype, refvoltage, refamperage));
                        System.out.println(adapterRefrigerator.plugIn());
                    }
                    break;

                case 3:
                    System.out.println("Enter Plug-Type: ");
                    String phoneplugtype = scanner.next();

                    System.out.println("Enter Voltage: ");
                    int phonevoltage = scanner.nextInt();

                    if (phonevoltage > 200) {
                        System.out.println("Voltage is too high. Cannot proceed.");
                    } else {
                        System.out.println("Enter Amperage: ");
                        int phoneamperage = scanner.nextInt();
                        SmartphoneChargerAdapter adapterSmartphoneCharger = new SmartphoneChargerAdapter(new SmartphoneCharger(phoneplugtype, phonevoltage, phoneamperage));
                        System.out.println(adapterSmartphoneCharger.plugIn());
                    }
                    break;

                default:
                    System.out.println("Please choose between 1-3");
            }

            System.out.println("Do you want to plug in another device? (yes/no): ");
            String continueLoop = scanner.next();
            stooper = continueLoop.equalsIgnoreCase("no");

        } while (!stooper);

        scanner.close();
    }
}
