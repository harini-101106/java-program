package looping_for;

import java.util.Scanner;

public class movie_ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double basePrice = 0;
        double originalTotal = 0;
        double finalTotal = 0;
        String groupDiscount = "";
        int customerDiscount = 0;
        double ticketPrice = 0;
        for (int i = 1; i <= n; i++) {
            String seatType = sc.next();
            String customerType = sc.next();
            if (seatType.equals("Regular")) {
                basePrice = 12;
            } else if (seatType.equals("Premium")) {
                basePrice = 18;
            } else if (seatType.equals("Recliner")) {
                basePrice = 25;
            }
            if (customerType.equals("Adult")) {
                customerDiscount = 0;
            } else if (customerType.equals("Child")) {
                customerDiscount = 30;
            } else if (customerType.equals("Senior")) {
                customerDiscount = 25;
            }
            ticketPrice = basePrice * (1 - customerDiscount / 100.0);
            System.out.println("Ticket" + i + seatType + "-" + customerType);
            System.out.println("Base Price:$" + basePrice);
            System.out.println("Discount:" + customerDiscount + "%");
            System.out.println("Final Price:$" + ticketPrice);
            if (i != n - 1) {
                System.out.println();
            }
            originalTotal += basePrice;
            finalTotal += ticketPrice;
        }

        if (n >= 5) {
            groupDiscount = "Yes";
            finalTotal *= 0.90;
        } else {
            groupDiscount = "No";
        }
        double totalDiscount = originalTotal - finalTotal;
        System.out.println("Total Tickets:" + n);
        System.out.println("Original Total:$" + originalTotal);
        System.out.printf("Total Discount:$%.1f", totalDiscount);
        System.out.println("Final Total:$" + finalTotal);
        System.out.println("Group Discount Applieed:" + groupDiscount);
        sc.close();
    }
}
