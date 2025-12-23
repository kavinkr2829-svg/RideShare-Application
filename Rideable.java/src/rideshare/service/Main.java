package rideshare.main;

import rideshare.service.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to RideShare ===");
        System.out.println("Choose your ride type:");
        System.out.println("1. Car Ride");
        System.out.println("2. Bike Ride");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = sc.nextInt();
        Rideable ride;

        switch (choice) {
            case 1:
                ride = new CarRide();
                break;
            case 2:
                ride = new BikeRide();
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();

        ride.bookRide(distance);
        ride.endRide();

        sc.close();
    }
}
