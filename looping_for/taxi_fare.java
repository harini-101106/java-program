package looping_for;

import java.util.Scanner;

public class taxi_fare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int timeSurcharges = 0;
        double totalDistance = 0;
        double totalRevenue = 0;
        for (int i = 1; i <= n; i++) {
            double distance = sc.nextDouble();
            String timeOfDay = sc.next();
            double baseFare = 3.00;
            double distanceCharge = 1.00 * distance;
            if (timeOfDay.equals("Morning")) {
                timeSurcharges = 0;
            } else if (timeOfDay.equals("Afternoon")) {
                timeSurcharges = 0;
            } else if (timeOfDay.equals("Evening")) {
                timeSurcharges = 3;
            } else if (timeOfDay.equals("Night")) {
                timeSurcharges = 5;
            }
            double totalFare = baseFare + distanceCharge + timeSurcharges;
            totalDistance += distance;
            totalRevenue += totalFare;
            System.out.println("Ride" + i);
            System.out.println("Distance:" + distance + "km");
            System.out.println("Time:" + timeOfDay);
            System.out.println("Base Fare:$" + baseFare);
            System.out.println("Distance Charge:$" + distanceCharge);
            System.out.println("Time Surcharge:$" + timeSurcharges);
            System.out.println("Total Fare:$" + totalFare);
            System.out.println();
        }
        double averageFare = totalRevenue / n;
        System.out.println("Total Rides:" + n);
        System.out.println("Total Distance:" + totalDistance + "km");
        System.out.println("Total Revenue:$" + totalRevenue);
        System.out.printf("Average Fare:$%.2f", averageFare);
        sc.close();
    }
}
