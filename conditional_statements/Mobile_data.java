package conditional_statements;

import java.util.Scanner;

public class Mobile_data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dataGB = sc.nextDouble();
        int callMinutes = sc.nextInt();
        sc.nextLine();
        String internationalUsage = sc.nextLine();
        String deviceType = sc.nextLine();

        String planName = "";
        String category = "";
        double baseCost = 0;
        double dataOverage = 0;
        double callOverage = 0;
        double intlFee = 0;
        double deviceFee = 0;
        double savings = 0;
        if (dataGB <= 2 && callMinutes <= 500) {
            planName = "Basic 2GB";
            baseCost = 25;
            category = "Budget";
        } else if (dataGB <= 5 && callMinutes <= 1000) {
            planName = "Standard 5GB";
            baseCost = 40;
            category = "Standard";

            if (dataGB > 5) {
                dataOverage = (dataGB - 5) * 10;
            }
        } else if (dataGB <= 25 && callMinutes <= 2000) {
            planName = "Premium Unlimited";
            baseCost = 70;
            category = "Premium";
        } else {
            planName = "Unlimited Max";
            baseCost = 90;
            category = "Unlimited";
        }
        if (planName.equals("Standard 5GB")) {
            if (dataGB > 5) {
                dataOverage = (dataGB - 5) * 10;
                savings = 5;
            }
        }
        if (planName.equals("Basic 2GB")) {
            if (callMinutes > 500) {
                callOverage = (callMinutes - 500) * 0.1;
            }
        }
        if (internationalUsage.equals("None")) {
            intlFee = 0;
        } else if (internationalUsage.equals("Light")) {
            intlFee = 5;
        } else if (internationalUsage.equals("Moderate")) {
            intlFee = 15;
        } else if (internationalUsage.equals("Heavy")) {
            intlFee = 30;
        }
        if (deviceType.equals("Basic")) {
            deviceFee = 0;
        } else if (deviceType.equals("Smartphone")) {
            deviceFee = 10;
        } else if (deviceType.equals("Tablet")) {
            deviceFee = 10;
        } else if (deviceType.equals("Hotspot")) {
            deviceFee = 20;
        }

        double totalCost = baseCost + dataOverage + callOverage + intlFee + deviceFee;
        System.out.println("Data Usage: " + dataGB + " GB");
        System.out.println("Call Minutes: " + callMinutes + " minutes");
        System.out.println("International Usage: " + internationalUsage);
        System.out.println("Device Type: " + deviceType);
        System.out.println("Recommended Plan: " + planName);
        System.out.println("Base Plan Cost: $" + baseCost);
        System.out.println("Data Overage: $" + dataOverage);
        System.out.println("Call Overage: $" + callOverage);
        System.out.println("International Fee: $" + intlFee);
        System.out.println("Device Fee: $" + deviceFee);
        System.out.println("Total Monthly Cost: $" + totalCost);
        System.out.println("Potential Savings: $" + savings);
        System.out.println("Plan Category: " + category);
        sc.close();
    }
}
