//Author: Yanga Rubushe

import java.util.ArrayList;

public class AerialDockingStation extends Drone implements Dockable {
    private ArrayList<Drone> dockedDrones;

    public AerialDockingStation() {
        super("Aerial Dock", 0);
        dockedDrones = new ArrayList<>();
    }

    @Override
    public boolean canDock() {
        return dockedDrones.size() < 3;
    }

    @Override
    public int dock(Drone drone) {
        if (canDock()) {
            dockedDrones.add(drone);
            return dockedDrones.size() - 1; // Return the index where the drone was docked
        } else {
            return -1; // Docking failed
        }
    }

    @Override
    public double calculateTotalWeight() {
        double totalWeight = 0;
        for (Drone drone : dockedDrones) {
            totalWeight += drone.getWeight();
        }
        return totalWeight;
    }

    @Override
    public void printInfo() {
        if (dockedDrones.isEmpty()) {
            System.out.println("No drones docked.");
        } else {
            for (int i = 0; i < dockedDrones.size(); i++) {
                System.out.println("Drone " + (i + 1) + ": " + dockedDrones.get(i).getName() + ", Weight: " + dockedDrones.get(i).getWeight());
            }
        }
    }
}

