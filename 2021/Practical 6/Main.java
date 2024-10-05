//Author: Yanga Rubushe

public class Main {
    public static void main(String[] args) {
        // Create DeliveryDrone objects
        DeliveryDrone drone1 = new DeliveryDrone("Drone A", 500.0);
        DeliveryDrone drone2 = new DeliveryDrone("Drone B", 750.0);
        DeliveryDrone drone3 = new DeliveryDrone("Drone C", 1200.0);

        // Create AerialDockingStation object
        AerialDockingStation station = new AerialDockingStation();

        // Dock the drones
        System.out.println("Docking Drone A: " + station.dock(drone1));
        System.out.println("Docking Drone B: " + station.dock(drone2));
        System.out.println("Docking Drone C: " + station.dock(drone3));

        // Print docked drones information
        station.printInfo();

        // Calculate total weight of docked drones
        System.out.println("Total Weight: " + station.calculateTotalWeight());
    }
}
