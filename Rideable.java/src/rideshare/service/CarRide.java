package rideshare.service;

public class CarRide implements Rideable {
    private double distance;
    private double farePerKm = 15.0; // Example fare

    @Override
    public void bookRide(double distance) {
        this.distance = distance;
        System.out.println("Car ride booked for " + distance + " km.");
    }

    @Override
    public void endRide() {
        double totalFare = distance * farePerKm;
        System.out.println("Car ride completed. Total fare: ₹" + totalFare);
    }
}
