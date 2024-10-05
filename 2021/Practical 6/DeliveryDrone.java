//Author: Yanga Rubushe

public class DeliveryDrone extends Drone {

    public DeliveryDrone(String name, double weight) {
        super(name, weight);
    }

    @Override
    public double calculateTotalWeight() {
        return getWeight();
    }

    @Override
    public void printInfo() {
        System.out.println("Drone Name: " + getName());
        System.out.println("Drone Weight: " + getWeight());
    }
}

