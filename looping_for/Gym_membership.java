package looping_for;

import java.util.Scanner;

public class Gym_membership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int renewalFees = 0;
        double totalRevenue = 0;
        int discount = 0;
        int count = 0;
        String priority = "";
        for (int i = 1; i <= n; i++) {
            String memberName = sc.next();
            String membershipType = sc.next();
            int daysUntilExpiry = sc.nextInt();
            if (membershipType.equals("Basic")) {
                renewalFees = 50;
            } else if (membershipType.equals("Premium")) {
                renewalFees = 100;
            } else if (membershipType.equals("VIP")) {
                renewalFees = 200;
            }
            if (daysUntilExpiry >= 45) {
                discount = 20;
            } else if (daysUntilExpiry >= 30 && daysUntilExpiry <= 44) {
                discount = 15;
            } else if (daysUntilExpiry >= 15 && daysUntilExpiry <= 29) {
                discount = 10;
            } else if (daysUntilExpiry < 15) {
                discount = 0;
            }
            if (daysUntilExpiry < 10) {
                priority = "Urgent";
            } else if (daysUntilExpiry >= 10 && daysUntilExpiry <= 30) {
                priority = "High";
            } else if (daysUntilExpiry > 30) {
                priority = "Normal";
            }
            double finalFee = renewalFees * (1 - discount / 100.0);
            if (daysUntilExpiry < 10) {
                count++;
            }
            totalRevenue += finalFee;
            System.out.println("Member:" + memberName);
            System.out.println("Membership:" + membershipType);
            System.out.println("Days Until Expiry:" + daysUntilExpiry);
            System.out.println("Renewal Fee:$" + renewalFees);
            System.out.println("Discount:" + discount + "%");
            System.out.println("Final Fee:$" + finalFee);
            System.out.println("Priority:" + priority);
            System.out.println();
        }
        double average = totalRevenue / n;
        System.out.println("Total Members:" + n);
        System.out.println("Urgent Renewals:" + count);
        System.out.println("Total Renewal Revenue:$" + totalRevenue);
        System.out.println("Average Revenue Fee:$" + average);
        sc.close();

    }
}
