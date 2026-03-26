package looping_for;

import java.util.Scanner;

public class product_price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int discount = 0;
        double finaltotal = 0;
        int totalItems = 0;
        double originaltotal = 0;
        double savingsPercentage = 0;
        double totalDiscount = 0;
        for (int i = 0; i < n; i++) {
            String productName = sc.next();
            double unitPrice = sc.nextDouble();
            int quantity = sc.nextInt();
            if (quantity == 1) {
                discount = 0;
            } else if (quantity >= 2 && quantity <= 4) {
                discount = 10;
            } else if (quantity >= 5 && quantity <= 9) {
                discount = 15;
            } else if (quantity >= 10) {
                discount = 20;
            }
            double subtotal = unitPrice * quantity * (1 - discount / 100.0);
            originaltotal += unitPrice * quantity;
            finaltotal += subtotal;
            // totalDiscount = originaltotal - finaltotal;
            // savingsPercentage = (totalDiscount / originaltotal) * 100.0;
            totalItems += quantity;
            System.out.println("Product:" + productName);
            System.out.println("Unit Price:$" + unitPrice);
            System.out.println("Quantity:" + quantity);
            System.out.println("Discount:" + discount + "%");
            System.out.println("Subtotal:$" + subtotal);
            if (i != n - 1) {
                System.out.println();
            }
        }
        totalDiscount = originaltotal - finaltotal;
        savingsPercentage = (totalDiscount / originaltotal) * 100.0;
        System.out.println("Total Items:" + totalItems);
        System.out.println("Original Total:$" + originaltotal);
        System.out.println("Total Discount:$" + totalDiscount);
        System.out.println("Final Total:$" + finaltotal);
        System.out.printf("Savings:%.2f%%", savingsPercentage);
        sc.close();
    }
}
