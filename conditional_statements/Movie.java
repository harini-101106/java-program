package conditional_statements;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movieFormat = sc.nextLine();
        String showTime = sc.nextLine();
        String seatCategory = sc.nextLine();
        String customerType = sc.nextLine();
        double formatSurcharge = 0;
        double seatUpgradeFee = 0;
        int timeBasedAdjustment = 0;
        int customerDiscount = 0;
        String voucher = "no";
        String pricingCategory = "";
        double baseTicketPrice = 12;
        if (movieFormat.equals("2D")) {
            formatSurcharge = 0;
        } else if (movieFormat.equals("3D")) {
            formatSurcharge = 5;
        } else if (movieFormat.equals("IMAX")) {
            formatSurcharge = 8;
        } else if (movieFormat.equals("4DX")) {
            formatSurcharge = 10;
        }
        if (seatCategory.equals("Standard")) {
            seatUpgradeFee = 0;
        } else if (seatCategory.equals("Premium")) {
            seatUpgradeFee = 4;
        } else if (seatCategory.equals("Recliner")) {
            seatUpgradeFee = 7;
        }
        if (showTime.equals("Matinee")) {
            timeBasedAdjustment = -30;
        } else if (showTime.equals("Evening")) {
            timeBasedAdjustment = 0;
        } else if (showTime.equals("Prime-Time")) {
            timeBasedAdjustment = 20;
        } else if (showTime.equals("Late-Night")) {
            timeBasedAdjustment = -20;
        }
        if (customerType.equals("Adult")) {
            customerDiscount = 0;
        } else if (customerType.equals("Senior")) {
            customerDiscount = 25;
        } else if (customerType.equals("Student")) {
            customerDiscount = 15;
        } else if (customerType.equals("Child")) {
            customerDiscount = 30;
        }
        double baseWithSurcharges = baseTicketPrice + formatSurcharge + seatUpgradeFee;
        double adjustedPrice = baseWithSurcharges * (1 + timeBasedAdjustment / 100.0);
        double finalPrice = adjustedPrice * (1 - customerDiscount / 100.0);
        if (showTime.equals("Matinee") || customerType.equals("Senior")
                || customerType.equals("Student") || customerType.equals("Child"))
            voucher = "Yes";
        if (finalPrice < 10)
            pricingCategory = "Value";
        else if (finalPrice >= 10 && finalPrice < 20)
            pricingCategory = "Standard";
        else if (finalPrice >= 20 && finalPrice < 30)
            pricingCategory = "Premium";
        else
            pricingCategory = "Luxury";
        System.out.println("Movie Format:" + movieFormat);
        System.out.println("Show Time:" + showTime);
        System.out.println("Seat Category:" + seatCategory);
        System.out.println("Customer Type:" + customerType);
        System.out.println("Base Ticket Price: $" + baseTicketPrice);
        System.out.println("Format Surcharge: $" + formatSurcharge);
        System.out.println("Seat Upgrade Fee: $" + seatUpgradeFee);
        System.out.println("Time-Based Adjustment:" + timeBasedAdjustment + "%");
        System.out.println("Customer Discount:" + customerDiscount + "%");
        System.out.printf("Final Ticket Price: $%.2f\n", finalPrice);
        System.out.println("Concession Voucher:" + voucher);
        System.out.println("Pricing Category:" + pricingCategory);
        sc.close();

    }
}
