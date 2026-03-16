package conditional_statements;

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unitsConsumed = sc.nextInt();
        sc.nextLine();
        String customerType = sc.nextLine();
        String season = sc.nextLine();
        String paymentMethod = sc.nextLine();

        double rate1 = 0, rate2 = 0, rate3 = 0, rate4 = 0;

        // Rates based on customer type
        if (customerType.equals("Residential")) {
            rate1 = 0.10;
            rate2 = 0.15;
            rate3 = 0.25;
            rate4 = 0.30;
        } else if (customerType.equals("Commercial")) {
            rate1 = 0.12;
            rate2 = 0.18;
            rate3 = 0.25;
            rate4 = 0.25;
        } else if (customerType.equals("Industrial")) {
            rate1 = 0.08;
            rate2 = 0.12;
            rate3 = 0.20;
            rate4 = 0.20;
        }

        int tier1Units = 0, tier2Units = 0, tier3Units = 0, tier4Units = 0;

        // Tier calculations
        if (unitsConsumed <= 100) {
            tier1Units = unitsConsumed;
        } else if (unitsConsumed <= 300) {
            tier1Units = 100;
            tier2Units = unitsConsumed - 100;
        } else if (unitsConsumed <= 500) {
            tier1Units = 100;
            tier2Units = 200;
            tier3Units = unitsConsumed - 300;
        } else {
            tier1Units = 100;
            tier2Units = 200;
            tier3Units = 200;
            tier4Units = unitsConsumed - 500;
        }

        double tier1Cost = tier1Units * rate1;
        double tier2Cost = tier2Units * rate2;
        double tier3Cost = tier3Units * rate3;
        double tier4Cost = tier4Units * rate4;

        double subtotal = tier1Cost + tier2Cost + tier3Cost + tier4Cost;

        int seasonalPercent = 0;

        if (season.equals("Summer")) {
            seasonalPercent = 15;
        } else if (season.equals("Winter")) {
            seasonalPercent = -10;
        } else {
            seasonalPercent = 0;
        }

        double seasonalAmount = subtotal * seasonalPercent / 100.0;
        double adjustedBill = subtotal + seasonalAmount;

        int paymentPercent = 0;

        if (paymentMethod.equals("Auto-Pay")) {
            paymentPercent = 5;
        } else if (paymentMethod.equals("Online")) {
            paymentPercent = 3;
        } else {
            paymentPercent = 0;
        }

        double discount = adjustedBill * paymentPercent / 100.0;
        double totalBill = adjustedBill - discount;

        double averageRate = totalBill / unitsConsumed;

        System.out.println("Units Consumed: " + unitsConsumed + " kWh");
        System.out.println("Customer Type: " + customerType);
        System.out.println("Season: " + season);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Tier 1 Cost (0-100): $" + tier1Cost);
        System.out.println("Tier 2 Cost (101-300): $" + tier2Cost);
        System.out.println("Tier 3 Cost (301-500): $" + tier3Cost);
        System.out.println("Tier 4 Cost (501+): $" + tier4Cost);
        System.out.println("Seasonal Adjustment: " + seasonalPercent + "%");
        System.out.println("Payment Discount: " + paymentPercent + "%");
        System.out.printf("Total Bill: $%.2f\n", totalBill);
        System.out.printf("Average Rate: $%.2f/kWh\n", averageRate);

        sc.close();
    }
}
