// Author: Yanga Rubushe

public class Car {
  // Define properties
  String make;
  String model;
  int year;

  // Define a method to start the engine
  public void startEngine() {
      System.out.println("Engine started!");
  }

  public static void main(String[] args) {
      // Create an object of Car class
      Car myCar = new Car();

      // Accessing object properties and methods
      myCar.make = "Toyota";
      myCar.model = "Corolla";
      myCar.year = 2022;

      // Output car details and start engine
      System.out.println("Car: " + myCar.make + " " + myCar.model + " (" + myCar.year + ")");
      myCar.startEngine();
  }
}
