package rideshare.service;

public class BikeRide implements Rideable {
    private double distance;
    private double farePerKm = 8.0; // Example fare

    @Override
    public void bookRide(double distance) {
        this.distance = distance;
        System.out.println("Bike ride booked for " + distance + " km.");
    }

    @Override
    public void endRide() {
        double totalFare = distance * farePerKm;
        System.out.println("Bike ride completed. Total fare: ₹" + totalFare);
    }
}
