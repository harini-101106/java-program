package conditional_statements;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String orderType = sc.nextLine();
        String loyaltyStatus = sc.nextLine();
        double orderValue = sc.nextDouble();
        sc.nextLine();
        String timeSlot = sc.nextLine();
        int baseDiscount = 0;
        int timeBasedAdjustment = 0;
        double serviceFee = 0;
        String kitchenPriority = "";
        if (loyaltyStatus.equals("Gold")) {
            baseDiscount = 15;
        } else if (loyaltyStatus.equals("Silver")) {
            baseDiscount = 10;
        } else if (loyaltyStatus.equals("Bronze")) {
            baseDiscount = 5;
        } else if (loyaltyStatus.equals("None")) {
            baseDiscount = 0;
        }
        if (timeSlot.equals("Peak")) {
            timeBasedAdjustment = 0;
        } else if (timeSlot.equals("Regular")) {
            timeBasedAdjustment = 0;
        } else if (timeSlot.equals("Latet-Night")) {
            timeBasedAdjustment = -5;
        }
        int totalDiscount = baseDiscount + timeBasedAdjustment;
        if (orderType.equals("Delivery")) {
            serviceFee = 0.1 * orderValue;
        } else if (orderType.equals("Takeout")) {
            serviceFee = 0.03 * orderValue;
        } else if (orderType.equals("Dine=In")) {
            serviceFee = 0;
        }
        double discountedValue = orderValue * (1 - totalDiscount / 100.0);
        double finalAmount = discountedValue + serviceFee;
        if (timeSlot.equals("Peak") && (orderType.equals("Delivery"))) {
            kitchenPriority = "High";
        } else if (timeSlot.equals("Regular")) {
            kitchenPriority = "Medium";
        } else if (timeSlot.equals("Late=Night")) {
            kitchenPriority = "Low";
        }
        int prepTime;
        if (kitchenPriority.equals("High")) {
            if (orderValue > 70) {
                prepTime = 25;
            } else {
                prepTime = 30;
            }
        } else if (kitchenPriority.equals("Medium")) {
            if (loyaltyStatus.equals("Gold")) {
                prepTime = 25;
            } else {
                prepTime = 20;
            }
        } else {
            prepTime = 15;
        }
        System.out.println("Order Type:" + orderType);
        System.out.println("Loyalty Ststus:" + loyaltyStatus);
        System.out.println("Order Value: $" + orderValue);
        System.out.println("Time Slot:" + timeSlot);
        System.out.println("Base Discount:" + baseDiscount + "%");
        System.out.println("Time-Based Adjustment:" + timeBasedAdjustment + "%");
        System.out.println("Service Fee: $" + serviceFee);
        System.out.println("Final Amount: $" + finalAmount);
        System.out.println("Kitchen Priority:" + kitchenPriority);
        System.out.println("Estimated prep Time:" + prepTime + "minutes");
        sc.close();
    }
}
