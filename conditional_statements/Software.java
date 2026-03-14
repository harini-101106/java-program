package conditional_statements;

import java.util.Scanner;

public class Software {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userCount = sc.nextInt();
        sc.nextLine();
        String licenseType = sc.nextLine();
        String supportLevel = sc.nextLine();
        int contractYears = sc.nextInt();
        double basePrice = 0;
        int volumeDiscount = 0;
        double supportFeePerUser = 0;
        int multiyearDiscount = 0;
        String pricingTier = "";
        if (licenseType.equals("Standard")) {
            basePrice = 60;
        } else if (licenseType.equals("Professional")) {
            basePrice = 120;
        } else if (licenseType.equals("Enterprise")) {
            basePrice = 200;
        }
        if (userCount >= 1 && userCount <= 50) {
            volumeDiscount = 0;
        } else if (userCount >= 51 && userCount <= 200) {
            volumeDiscount = 15;
        } else if (userCount >= 201 && userCount <= 500) {
            volumeDiscount = 20;
        } else if (userCount >= 501 && userCount <= 1000) {
            volumeDiscount = 25;
        } else if (userCount >= 1001) {
            volumeDiscount = 35;
        }
        if (supportLevel.equals("Basic")) {
            supportFeePerUser = 10;
        } else if (supportLevel.equals("Priority")) {
            supportFeePerUser = 30;
        } else if (supportLevel.equals("Premium")) {
            supportFeePerUser = 80;
        }
        if (contractYears == 1) {
            multiyearDiscount = 0;
        } else if (contractYears == 2) {
            multiyearDiscount = 5;
        } else if (contractYears == 3) {
            multiyearDiscount = 10;
        } else if (contractYears == 5) {
            multiyearDiscount = 20;
        }
        double discountedBase = basePrice * (1 - volumeDiscount / 100.0);
        double annualPerUser = (discountedBase + supportFeePerUser) * (1 - multiyearDiscount / 100.0);
        double totalAnnual = annualPerUser * userCount;
        double contractValue = totalAnnual * contractYears;
        if (userCount < 200) {
            pricingTier = "Small Business";
        } else if (userCount >= 200 && userCount <= 1000) {
            pricingTier = "Mid-Market";
        } else {
            pricingTier = "Enterprise";
        }
        System.out.println("User Count:" + userCount);
        System.out.println("License Type:" + licenseType);
        System.out.println("Support Level:" + supportLevel);
        System.out.println("Contract Duration:" + contractYears + " years");
        System.out.println("Base Price Per User: $" + basePrice);
        System.out.println("Volume Discount:" + volumeDiscount + "%");
        System.out.println("Support Fee Per User: $" + supportFeePerUser);
        System.out.println("Multi-year Discount:" + multiyearDiscount + "%");
        System.out.println("Annual Cost Per User: $" + annualPerUser);
        System.out.println("Total Annual Cost: $" + totalAnnual);
        System.out.println("Total Contract Value: $" + contractValue);
        System.out.println("Pricing Tier:" + pricingTier);
        sc.close();

    }
}
