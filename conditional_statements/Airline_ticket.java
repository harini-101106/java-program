package conditional_statements;

import java.util.Scanner;

public class Airline_ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bookingClass = sc.nextLine();
        int daysUntilDeparture = sc.nextInt();
        double seatAvailability = sc.nextDouble();
        sc.nextLine();
        String routeType = sc.nextLine();
        int basePrice = 0;
        double demandMultiplier = 0;
        String pricingCategory = "";
        if (bookingClass.equals("Economy")) {
            if (routeType.equals("Domestic")) {
                basePrice = 200;
            } else if (routeType.equals("Int-Short")) {
                basePrice = 500;
            } else if (routeType.equals("Int-Long")) {
                basePrice = 800;
            }
        } else if (bookingClass.equals("Business")) {
            if (routeType.equals("Domestic")) {
                basePrice = 600;
            } else if (routeType.equals("Int-Short")) {
                basePrice = 1500;
            } else if (routeType.equals("Int-Long")) {
                basePrice = 2500;
            }
        } else if (bookingClass.equals("First")) {
            if (routeType.equals("Domestic")) {
                basePrice = 1000;
            } else if (routeType.equals("Int-Short")) {
                basePrice = 3000;
            } else if (routeType.equals("Int-Long")) {
                basePrice = 5000;
            }
        }
        if (seatAvailability < 30 && daysUntilDeparture < 14) {
            demandMultiplier = 1.8;
            pricingCategory = "High Demand";
        } else if (seatAvailability < 50 && daysUntilDeparture < 30) {
            demandMultiplier = 1.5;
            pricingCategory = "High Demand";
        } else if (seatAvailability < 60 || (daysUntilDeparture >= 30 && daysUntilDeparture <= 60)) {
            demandMultiplier = 1.0;
            pricingCategory = "Moderate";
        } else if (seatAvailability >= 60 && daysUntilDeparture > 60) {
            demandMultiplier = 0.8;
            pricingCategory = "Low Demand";
        }
        double finalPrice = basePrice * demandMultiplier;
        System.out.println("Booking Class:" + bookingClass);
        System.out.println("Days Until Departure:" + daysUntilDeparture);
        System.out.println("Seat Availability:" + seatAvailability + "%");
        System.out.println("Route Type:" + routeType);
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Demand Multiplier:" + demandMultiplier + "x");
        System.out.println("Final Ticket Price: $" + finalPrice);
        System.out.println("Pricing Category:" + pricingCategory);
        sc.close();
    }
}
