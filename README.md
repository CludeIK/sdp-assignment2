# Logistics & UI Configuration System (Assignment 2)

## Purpose
This application demonstrates the integration of two creational design patterns:
1. **Factory Method**: Used to create different transport types (`Truck`, `Ship`) without binding the client code to concrete classes.
2. **Abstract Factory**: Used to create cross-platform UI component families (`Windows`, `macOS`) ensuring that buttons and checkboxes match their respective OS.

## Package Structure
- `logistics/` - Factory Method implementation for transport.
- `ui/` - Abstract Factory implementation for UI components.
- `app/` - Client code (`DeliveryApplication`) and startup validation logic (`Main`).

## Prerequisites & Build Instructions
- **Java Development Kit (JDK):** JDK 17 or higher (tested on JDK 25).
- **IDE:** IntelliJ IDEA (recommended).
1. Clone the repository.
2. Open the project in your IDE.
3. Run the `Main.java` class located in the `app` package.

## Supported Input Values
- **Delivery mode:** `ROAD` or `SEA`
- **UI platform:** `WINDOWS` or `MACOS`

## Sample Run
```text
Enter delivery mode (ROAD or SEA): ROAD
Enter UI platform (WINDOWS or MACOS): WINDOWS

--- Starting Application ---
Rendering Windows button
Rendering Windows checkbox
Truck delivers laboratory equipment to Aktau warehouse by land