package samplepackage;

 class Shipment {
    protected String shipmentId;
    protected double weight;
    protected String destination;

    // Constructor
    public Shipment(String shipmentId, double weight, String destination) {
        this.shipmentId = shipmentId;
        this.weight = weight;
        this.destination = destination;
    }

    // Getters and Setters
    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    // Placeholder method to calculate total cost
    public double calculateTotalCost() {
        return 0; // To be overridden in subclasses
    }
}

class DomesticShipment extends Shipment {
    private String region;
    private double shipmentCost;

    // Constructor
    public DomesticShipment(String shipmentId, double weight, String destination, String region, double shipmentCost) {
        super(shipmentId, weight, destination);
        this.region = region;
        this.shipmentCost = shipmentCost;
    }

    // Getters and Setters
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getShipmentCost() {
        return shipmentCost;
    }

    public void setShipmentCost(double shipmentCost) {
        this.shipmentCost = shipmentCost;
    }

    // Override calculateTotalCost
    @Override
    public double calculateTotalCost() {
        double tax = 0.05 * shipmentCost; // 5% tax
        return shipmentCost + tax;
    }
}

 class InternationalShipment extends Shipment {
    private double customsFee;
    private double insuranceFee;
    private double shipmentCost;

    // Constructor
    public InternationalShipment(String shipmentId, double weight, String destination, double shipmentCost, double customsFee, double insuranceFee) {
        super(shipmentId, weight, destination);
        this.shipmentCost = shipmentCost;
        this.customsFee = customsFee;
        this.insuranceFee = insuranceFee;
    }

    // Getters and Setters
    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    public double getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    public double getShipmentCost() {
        return shipmentCost;
    }

    public void setShipmentCost(double shipmentCost) {
        this.shipmentCost = shipmentCost;
    }

    // Override calculateTotalCost
    @Override
    public double calculateTotalCost() {
        double tax = 0.15 * shipmentCost; // 15% tax
        return shipmentCost + customsFee + insuranceFee + tax;
    }
}


public class ShipmentManagement{
    public static void main(String[] args) {
        // Create DomesticShipment instance
        DomesticShipment domesticShipment = new DomesticShipment(
                "D001", 25.0, "Jaffna", "North", 1000.0);

        // Create InternationalShipment instance
        InternationalShipment internationalShipment = new InternationalShipment(
                "I001", 50.0, "London", 500.0, 500.0, 200.0);

        // Display total cost for DomesticShipment
        System.out.println("Domestic Shipment Details:");
        System.out.println("Shipment ID: " + domesticShipment.getShipmentId());
        System.out.println("Destination: " + domesticShipment.getDestination());
        System.out.println("Region: " + domesticShipment.getRegion());
        System.out.println("Total Cost: rs." + domesticShipment.calculateTotalCost());

        // Display total cost for InternationalShipment
        System.out.println("\nInternational Shipment Details:");
        System.out.println("Shipment ID: " + internationalShipment.getShipmentId());
        System.out.println("Destination: " + internationalShipment.getDestination());
        System.out.println("Customs Fee: rs." + internationalShipment.getCustomsFee());
        System.out.println("Insurance Fee: rs." + internationalShipment.getInsuranceFee());
        System.out.println("Total Cost: rs." + internationalShipment.calculateTotalCost());
    }
}

