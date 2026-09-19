package app;

import logistics.Logistics;
import logistics.RoadLogistics;
import logistics.SeaLogistics;
import ui.GUIFactory;
import ui.MacOSFactory;
import ui.WindowsFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter delivery mode (ROAD or SEA): ");
        String deliveryInput = scanner.nextLine().trim().toUpperCase();

        System.out.print("Enter UI platform (WINDOWS or MACOS): ");
        String uiInput = scanner.nextLine().trim().toUpperCase();

        Logistics logistics = configureLogistics(deliveryInput);
        GUIFactory guiFactory = configureGUI(uiInput);

        if (logistics == null || guiFactory == null) {
            System.out.println("Error: Invalid selection. Stopping the application.");
            return;
        }

        System.out.println("\n--- Starting Application ---");
        DeliveryApplication app = new DeliveryApplication(guiFactory, logistics);

        app.renderAndDeliver("laboratory equipment", "Aktau warehouse");
    }

    private static Logistics configureLogistics(String deliveryInput) {
        switch (deliveryInput) {
            case "ROAD":
                return new RoadLogistics();
            case "SEA":
                return new SeaLogistics();
            default:
                System.out.println("Validation message: Unsupported delivery mode '" + deliveryInput + "'.");
                return null;
        }
    }

    private static GUIFactory configureGUI(String uiInput) {
        switch (uiInput) {
            case "WINDOWS":
                return new WindowsFactory();
            case "MACOS":
                return new MacOSFactory();
            default:
                System.out.println("Validation message: Unsupported UI platform '" + uiInput + "'.");
                return null;
        }
    }
}