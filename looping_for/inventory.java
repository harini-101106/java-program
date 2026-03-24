package looping_for;

import java.util.Scanner;

public class inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String status = "";
        double total = 0;
        double reorderQuantity = 0;
        int lowStock = 0;
        int critical = 0;
        for (int i = 0; i < n; i++) {
            String productName = sc.next();
            int currentStock = sc.nextInt();
            int minimumStock = sc.nextInt();
            if (currentStock >= minimumStock) {
                status = "Adequate";
            } else if (currentStock < minimumStock && currentStock >= (minimumStock / 2)) {
                status = "Low Stock";
            } else if (currentStock < (minimumStock / 2)) {
                status = "Critical";
            }
            if (status.equals("Adequate")) {
                reorderQuantity = 0;
            } else if (status.equals("Low Stock")) {
                reorderQuantity = (minimumStock - currentStock) + minimumStock / 2;
                lowStock++;
            } else if (status.equals("Critical")) {
                reorderQuantity = (minimumStock - currentStock) + minimumStock;
                critical++;
            }
            total = total + reorderQuantity;
            System.out.println("Product:" + productName);
            System.out.println("Current Stock:" + currentStock);
            System.out.println("Minimum Stock:" + minimumStock);
            System.out.println("Status:" + status);
            System.out.println("Reorder Quantity:" + (int) reorderQuantity);
            // total = total + reorderQuantity;
            if (i != n - 1) {
                System.out.println();
            }
        }
        // total = total + reorderQuantity;
        System.out.println("Total Products:" + n);
        System.out.println("Low Stock items:" + lowStock);
        System.out.println("Critical items:" + critical);
        System.out.println("Total Recorder quantity:" + (int) total);
        sc.close();
    }
}
