package samplepackage;

import java.util.ArrayList;
import java.util.List;


abstract class Vehicle {
    protected double distance; 
    protected double weight;   

    // Constructor
    public Vehicle(double distance, double weight) {
        this.distance = distance;
        this.weight = weight;
    }

    
    public abstract double calculateCost();

   
    public double getDistance() {
        return distance;
    }

    public double getWeight() {
        return weight;
    }
}


class Truck extends Vehicle {

   
    public Truck(double distance, double weight) {
        super(distance, weight);
    }

  
    @Override
    public double calculateCost() {
        return distance * 5 + weight * 2;
    }
}


class Ship extends Vehicle {

    // Constructor
    public Ship(double distance, double weight) {
        super(distance, weight);
    }

   
    @Override
    public double calculateCost() {
        return distance * 3 + weight * 1.5;
    }
}


class Airplane extends Vehicle {

    // Constructor
    public Airplane(double distance, double weight) {
        super(distance, weight);
    }

   
    @Override
    public double calculateCost() {
        return distance * 10 + weight * 5;
    }
}


public class TransportCost {
    public static void main(String[] args) {
       
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Truck(200, 1000));      
        vehicles.add(new Ship(500, 3000));      
        vehicles.add(new Airplane(1000, 500));  

        // Display transport costs for each vehicle using polymorphism
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getClass() + " Details:");
            System.out.println("Distance: " + vehicle.getDistance() + " km");
            System.out.println("Weight: " + vehicle.getWeight() + " kg");
            System.out.println("Transport Cost: rs." + vehicle.calculateCost());
            System.out.println();
        }
    }
}

