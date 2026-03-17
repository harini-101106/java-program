package conditional_statements;

import java.util.Scanner;

public class Food_delivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceMiles = sc.nextDouble();
        double orderValue = sc.nextDouble();
        sc.nextLine();
        String timeSlot = sc.nextLine();
        String weatherCondition = sc.nextLine();
        double peakTimeSurcharge = 0;
        double baseDelivery = 3.00;
        double distanceSurcharge = distanceMiles * 1.0;
        double weatherSurcharge = 0;
        double orderValueDiscount = 0;
        String priority = "";
        if (timeSlot.equals("Breakfast")) {
            peakTimeSurcharge = 0;
        } else if (timeSlot.equals("Lunch")) {
            peakTimeSurcharge = 2.50;
        } else if (timeSlot.equals("Dinner")) {
            peakTimeSurcharge = 2.00;
        } else if (timeSlot.equals("Late-Night")) {
            peakTimeSurcharge = 1.50;
        }
        if (weatherCondition.equals("Clear")) {
            weatherSurcharge = 0;
        } else if (weatherCondition.equals("Rain")) {
            weatherSurcharge = 2;
        } else if (weatherCondition.equals("Snow")) {
            weatherSurcharge = 3;
        } else if (weatherCondition.equals("Storm")) {
            weatherSurcharge = 5;
        }
        if (orderValue >= 30 && orderValue <= 49.99) {
            orderValueDiscount = 1;
        } else if (orderValue >= 50 && orderValue <= 74.99) {
            orderValueDiscount = 3;
        } else if (orderValue >= 75) {
            orderValueDiscount = 5;
        }
        double finalFee = baseDelivery + distanceSurcharge + peakTimeSurcharge + weatherSurcharge - orderValueDiscount;
        int deliveryTime = (int) (distanceMiles * 8);
        if (timeSlot.equals("Lunch") || (timeSlot.equals("Dinner"))) {
            deliveryTime += 10;
        }
        if (weatherCondition.equals("Rain")) {
            deliveryTime += 5;
        } else if (weatherCondition.equals("Snow")) {
            deliveryTime += 10;
        } else if (weatherCondition.equals("Storm")) {
            deliveryTime += 15;
        }
        if (orderValue > 60) {
            priority = "Express";
        } else if (timeSlot.equals("Dinner") || (timeSlot.equals("Lunch"))) {
            priority = "High";
        } else {
            priority = "Standard";
        }
        System.out.println("Delivery Distance:" + distanceMiles + "miles");
        System.out.println("Order Value:$" + orderValue);
        System.out.println("Time Slot:" + timeSlot);
        System.out.println("Weather Condition:" + weatherCondition);
        System.out.println("Base Delivery Fee: $" + baseDelivery);
        System.out.println("Distance Surcharge: $" + distanceSurcharge);
        System.out.println("Peak Time Surcharge: $" + peakTimeSurcharge);
        System.out.println("Weather Surcharge: $" + weatherSurcharge);
        System.out.println("Order Value Discount: $" + orderValueDiscount);
        System.out.println("Final Delivery Fee: $" + finalFee);
        System.out.println("Estimated Delivery Time:" + deliveryTime + "minutes");
        System.out.println("Service Priority:" + priority);
        sc.close();

    }
}
