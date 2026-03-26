package looping_for;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double orderSubtotal = 0;
        int totalitemCount = 0;
        for (int i = 0; i < n; i++) {
            String itemName = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            double itemSubtotal = price * quantity;
            orderSubtotal += itemSubtotal;
            totalitemCount += quantity;
            System.out.println("Item:" + itemName);
            System.out.println("Price:$" + price + "x" + quantity);
            System.out.println("Subtotal:$" + itemSubtotal);
            if (i != n - 1) {
                System.out.println();
            }
        }
        double tax = orderSubtotal * 0.08;
        double serviceCharge = orderSubtotal * 0.10;
        double total = orderSubtotal + tax + serviceCharge;
        System.out.println("Total items:" + totalitemCount);
        System.out.println("Subtotal:$" + orderSubtotal);
        System.out.println("Tax (8%):$" + tax);
        System.out.printf("Service Charge (10%%):$%.1f\n", serviceCharge);
        System.out.println("Grand Total:$" + total);
        sc.close();
    }
}
