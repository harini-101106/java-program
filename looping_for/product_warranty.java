package looping_for;

import java.util.Scanner;

public class product_warranty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int warrantyPeriod = 0;
        String status = "";
        int expired = 0;
        int total = 0;
        int expiredSoon = 0;
        int active = 0;
        for (int i = 1; i <= n; i++) {
            String productId = sc.next();
            String productType = sc.next();
            int monthsSincePurchase = sc.nextInt();
            if (productType.equals("Electronics")) {
                warrantyPeriod = 12;
            } else if (productType.equals("Appliance")) {
                warrantyPeriod = 24;
            } else if (productType.equals("Computer")) {
                warrantyPeriod = 36;
            }
            int remaining = warrantyPeriod - monthsSincePurchase;
            if (remaining < 0) {
                remaining = 0;
            }
            if (remaining == 0) {
                status = "Expired";
                expired++;
            } else if (remaining >= 1 && remaining <= 3) {
                status = "Expired Soon";
                expiredSoon++;
            } else if (remaining > 3) {
                status = "Active";
                active++;
            }
            System.out.println("Product ID:" + productId);
            System.out.println("Type:" + productType);
            System.out.println("Warranty Period:" + warrantyPeriod + "months");
            System.out.println("Months Used:" + monthsSincePurchase);
            System.out.println("Remaining:" + remaining + "months");
            System.out.println("Status:" + status);
            System.out.println();
            total++;
        }
        // total++;
        System.out.println("Total Products:" + n);
        System.out.println("Active Warranties:" + active);
        System.out.println("Expiring soon:" + expiredSoon);
        System.out.println("Expirede warranties:" + expired);
        sc.close();
    }
}
