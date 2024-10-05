// Author: Yanga Rubushe

public class BasicDrone {
    private double setLatitude;
    private double setLongitude;
    private double setAltitude;
    private String setRegistration;

    // Default constructor
    public BasicDrone() {
        this.setRegistration = "unknown";
        this.setAltitude = 0.0;
        this.setLongitude = 0.0;
        this.setLatitude = 0.0;
    }

    // Parameterized constructor
    public BasicDrone(String registration, double altitude, double longitude, double latitude) {
        this.setRegistration = registration;
        this.setAltitude = altitude;
        this.setLongitude = longitude;
        this.setLatitude = latitude;
    }

    // Method to print drone information
    public void printInfo() {
        System.out.println("Registration: " + setRegistration);
        System.out.println("Current position: ");
        System.out.println("Alt: " + setAltitude);
        System.out.println("Lat: " + setLatitude);
        System.out.println("Long: " + setLongitude);
    }

    // Method to calculate distance to another location
    public double distanceTo(double altitude, double longitude, double latitude) {
        // Correcting the calculation of distance using instance variables
        double resultDx = Math.pow(latitude - this.setLatitude, 2); 
        double resultDy = Math.pow(longitude - this.setLongitude, 2); 
        double resultDz = Math.pow(altitude - this.setAltitude, 2); 
        double sum = resultDx + resultDy + resultDz;
        return Math.sqrt(sum); // Return the calculated distance
    }

    // Setters for instance variables
    public void setLatitude(double d) {
        this.setLatitude = d; 
    }

    public void setLongitude(double d) {
        this.setLongitude = d; 
    }

    public void setAltitude(double d) {
        this.setAltitude = d; 
    }

    public void setRegistration(String string) {
        this.setRegistration = string; 
    }
}