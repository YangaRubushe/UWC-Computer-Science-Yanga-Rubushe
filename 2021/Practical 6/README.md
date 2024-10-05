# Drone Docking System

## Project Overview
This project simulates a drone docking system where various drones can dock at an aerial docking station. The system includes different types of drones, and each drone can dock at a station with a limited capacity. The docking station can calculate the total weight of all docked drones and provide detailed information about them.

## Features
- **Drone Class**: Abstract class for defining common properties and behavior of drones.
- **Aerial Docking Station**: A docking station that allows drones to dock and keeps track of their weight and information.
- **Delivery Drones**: A type of drone that can be docked at an aerial docking station.
- **Dockable Interface**: Interface that defines methods for docking drones and checking if docking is possible.

## Class Structure
- `Drone`: Abstract base class for all drones.
- `AerialDockingStation`: Manages the docking and undocking of drones and calculates total docked drone weight.
- `DeliveryDrone`: A specific type of drone.
- `Dockable`: Interface for defining docking methods.

## How to Run

1. Ensure you have all the necessary `.java` files:
   - `Main.java`
   - `Drone.java`
   - `AerialDockingStation.java`
   - `DeliveryDrone.java`
   - `Dockable.java`

2. Compile the project using the following command:
   ```bash
   javac *.java
