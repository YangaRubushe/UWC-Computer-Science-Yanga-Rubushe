//Author: Yanga Rubushe

public abstract class Drone {
    private String name;
    private double weight;

    public Drone(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    public abstract void printInfo();
    public abstract double calculateTotalWeight();
}

