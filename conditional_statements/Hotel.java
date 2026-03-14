package conditional_statements;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roomCategory = sc.nextLine();
        String season = sc.nextLine();
        int nightsBooked = sc.nextInt();
        sc.nextLine();
        double baseRate = 0;
        String loyaltyTier = sc.nextLine();
        double seasonalMultiplier = 0;
        int stayDiscount = 0;
        int loyaltyDiscount = 0;
        String upgrades = "None";
        if (roomCategory.equals("Standard")) {
            baseRate = 150;
        } else if (roomCategory.equals("Deluxe")) {
            baseRate = 300;
        } else if (roomCategory.equals("Suite")) {
            baseRate = 500;
        } else if (roomCategory.equals("Presidential")) {
            baseRate = 1000;
        }
        if (season.equals("Off-Peak")) {
            seasonalMultiplier = 0.7;
        } else if (season.equals("Regular")) {
            seasonalMultiplier = 1.0;
        } else if (season.equals("Peak")) {
            seasonalMultiplier = 1.5;
        } else if (season.equals("Holiday")) {
            seasonalMultiplier = 2.0;
        }
        if (nightsBooked >= 1 && nightsBooked <= 4) {
            stayDiscount = 0;
        } else if (nightsBooked >= 5 && nightsBooked <= 7) {
            stayDiscount = 5;
        } else if (nightsBooked >= 8 && nightsBooked <= 14) {
            stayDiscount = 10;
        } else if (nightsBooked >= 15) {
            stayDiscount = 20;
        }
        if (loyaltyTier.equals("None")) {
            loyaltyDiscount = 0;
        } else if (loyaltyTier.equals("Member")) {
            loyaltyDiscount = 10;
        } else if (loyaltyTier.equals("Gold")) {
            loyaltyDiscount = 15;
        } else if (loyaltyTier.equals("Platinum")) {
            loyaltyDiscount = 20;
        }
        if (loyaltyTier.equals("Gold") && roomCategory.equals("Deluxe")) {
            upgrades = "Free breakfast and spa access";
        } else if (loyaltyTier.equals("Member") && roomCategory.equals("Suite")) {
            upgrades = "Free breakfast";
        } else if (loyaltyTier.equals("Platinum") && roomCategory.equals("Presidential")) {
            upgrades = "Concierge service, airport transfer, and fine dining";
        }
        double seasonalRate = baseRate * seasonalMultiplier;
        double discountedRate = seasonalRate * (1 - stayDiscount / 100.0) * (1 - loyaltyDiscount / 100.0);
        double totalCost = discountedRate * nightsBooked;
        System.out.println("Room Category:" + roomCategory);
        System.out.println("Season:" + season);
        System.out.println("Nights Booked:" + nightsBooked);
        System.out.println("Loyalty Tier:" + loyaltyTier);
        System.out.println("Base Rate Per Night: $" + baseRate);
        System.out.println("Seasonal Multiplier:" + seasonalMultiplier + "x");
        System.out.println("Extended Stay Discount:" + stayDiscount + "%");
        System.out.println("Loyalty Discount:" + loyaltyDiscount + "%");
        System.out.println("Nightly Rate: $" + discountedRate);
        System.out.println("Total Booking Cost: $" + totalCost);
        System.out.println("Complimentary Upgrades:" + upgrades);
        sc.close();
    }
}
