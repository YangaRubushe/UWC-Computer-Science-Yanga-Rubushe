// Author: Yanga Rubushe

public class CargoDrone {
    private String[] cargoList; // Array to hold cargo descriptions
    private int numItems; // Current number of items loaded

    // Constructor for CargoDrone
    public CargoDrone(int maxCapacity) {
        this.cargoList = new String[maxCapacity]; // Initialize cargo list based on max capacity
        this.numItems = 0; // Start with zero items loaded
    }

    // Method to check if the cargo list is full
    public boolean isFull() { 
        return numItems >= cargoList.length; // Check if the cargo list is full
    }

    // Method to check if there are no items in the cargo list
    public boolean isEmpty() {
        return numItems == 0; // Check if there are no items
    }

    // Method to load cargo into the drone
    public void loadCargo(String[] descriptions) {
        for (String description : descriptions) {
            if (!isFull()) { // Check if there is space to load more cargo
                cargoList[numItems] = description; // Load cargo into the list
                numItems++; // Increment count of loaded items
            } else {
                System.out.println("Cargo list is full! Cannot load more cargo.");
                break; // Exit loop if full
            }
        }
    }
}