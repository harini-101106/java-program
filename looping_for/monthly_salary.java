package looping_for;

import java.util.Scanner;

public class monthly_salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int commissionRate = 0;
        int highest = 0;
        // int bonus = 0;
        String topPerformer = "";
        double totalSales = 0;
        double totalCommision = 0;
        for (int i = 0; i < n; i++) {
            double bonus = 0;
            String repName = sc.next();
            int salesAmount = sc.nextInt();
            if (salesAmount >= 0 && salesAmount <= 40000) {
                commissionRate = 5;
            } else if (salesAmount >= 40001 && salesAmount <= 80000) {
                commissionRate = 10;
            } else if (salesAmount >= 80001 && salesAmount <= 100000) {
                commissionRate = 10;
            } else if (salesAmount >= 100001 && salesAmount <= 150000) {
                commissionRate = 12;
            } else if (salesAmount >= 150000) {
                commissionRate = 15;
            }
            double commission = salesAmount * (commissionRate / 100.0);
            if (salesAmount >= 100000) {
                bonus = 2000;
            } else if (salesAmount >= 150000) {
                bonus = 3000;
            }
            double totalPayout = commission + bonus;
            if (salesAmount > highest) {
                highest = salesAmount;
                topPerformer = repName;
            }
            totalSales = totalSales + salesAmount;
            totalCommision += totalPayout;
            System.out.println("Sales Rep:" + repName);
            System.out.println("Sales Amount: $" + salesAmount);
            System.out.println("Commission Rate:" + commissionRate + "%");
            System.out.println("Commission Earned: $" + commission);
            System.out.println("Bonus:$" + bonus);
            System.out.println("Total Payout:$" + totalPayout);
            if (i != n - 1) {
                System.out.println();
            }
        }
        System.out.println("Total Sales Reps:" + n);
        System.out.println("Total Sales:$" + totalSales);
        System.out.println("Total Commissions:$" + totalCommision);
        System.out.println("Top Performer:" + topPerformer);
        sc.close();
    }
}
