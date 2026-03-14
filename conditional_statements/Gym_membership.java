package conditional_statements;

import java.util.Scanner;

public class Gym_membership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String membershipTier = sc.nextLine();
        int contractMonths = sc.nextInt();
        sc.nextLine();
        String accessLevel = sc.nextLine();
        String addOns = sc.nextLine();
        double baseMonthlyFee = 0;
        int contractDiscount = 0;
        double accessFee = 0;
        double addonFee = 0;
        String category = "";
        if (membershipTier.equals("Basic")) {
            baseMonthlyFee = 40;
        } else if (membershipTier.equals("Premium")) {
            baseMonthlyFee = 80;
        } else if (membershipTier.equals("Elite")) {
            baseMonthlyFee = 120;
        } else if (membershipTier.equals("VIP")) {
            baseMonthlyFee = 150;
        }
        if (contractMonths == 1) {
            contractDiscount = 0;
        } else if (contractMonths == 6) {
            contractDiscount = 10;
        } else if (contractMonths == 12) {
            contractDiscount = 15;
        } else if (contractMonths == 24) {
            contractDiscount = 25;
        }
        if (accessLevel.equals("Single-Location")) {
            accessFee = 0;
        } else if (accessLevel.equals("Regional")) {
            accessFee = 20;
        } else if (accessLevel.equals("Nationwide")) {
            accessFee = 50;
        }
        if (addOns.equals("None")) {
            addonFee = 0;
        } else if (addOns.equals("Personal-Training")) {
            addonFee = 100;
        } else if (addOns.equals("Classes")) {
            addonFee = 50;
        } else if (addOns.equals("Full-Package")) {
            addonFee = 200;
        }
        double discountedBase = baseMonthlyFee * (1 - contractDiscount / 100.0);
        double monthlyTotal = discountedBase + accessFee + addonFee;
        double contractTotal = monthlyTotal * contractMonths;
        double savings = (baseMonthlyFee + accessFee + addonFee) * contractMonths - contractTotal;
        if (((membershipTier.equals("Premium")) || (membershipTier.equals("Elite")))
                && (monthlyTotal >= 160 && monthlyTotal < 1000)) {
            category = "Premium";
        } else if (membershipTier.equals("VIP") && (monthlyTotal >= 1000)) {
            category = "Luxury";
        } else if (membershipTier.equals("Premium") && (monthlyTotal < 160)) {
            category = "Standard";
        } else {
            category = "Budget";
        }
        System.out.println("Membership Tier:" + membershipTier);
        System.out.println("Contract Length:" + contractMonths + "months");
        System.out.println("Access Level:" + accessLevel);
        System.out.println("Add-Ons:" + addOns);
        System.out.println("Base Monthly Fee:$" + baseMonthlyFee);
        System.out.println("Contract Discount:" + contractDiscount + "%");
        System.out.println("Access Fee:$" + accessFee);
        System.out.println("Add-OnFee:$" + addonFee);
        System.out.println("Monthly Total: $" + monthlyTotal);
        System.out.println("Contract Total:$" + contractTotal);
        System.out.println("Savings vs Month-to-month: $" + savings);
        System.out.println("Membership Category:" + category);
        sc.close();

    }
}
