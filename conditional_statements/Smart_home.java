package conditional_statements;

import java.util.Scanner;

public class Smart_home {
    public static void main(String[] args) {
        Scanner energy = new Scanner(System.in);
        String timeOfDay = energy.nextLine();
        double powerConsumption = energy.nextDouble();
        double renewablePercentage = energy.nextDouble();
        energy.nextLine();
        String rateTier = energy.nextLine();
        double baseRate = 0;
        double rateMultiplier = 0;
        String recommendation = "";
        double potentialSavings = 0;
        if (rateTier.equals("Basic")) {
            baseRate = 0.18;
        } else if (rateTier.equals("Time-of-Use")) {
            baseRate = 0.15;
        } else if (rateTier.equals("Premium-Green")) {
            baseRate = 0.12;
        }
        if (timeOfDay.equals("Peak")) {
            rateMultiplier = 1.8;
        } else if (timeOfDay.equals("Off-Peak")) {
            rateMultiplier = 0.8;
        } else if (timeOfDay.equals("Super-Off-Peak")) {
            rateMultiplier = 0.6;
        }
        double renewableCredit = (powerConsumption * renewablePercentage / 100) * baseRate;
        double cost = (powerConsumption * baseRate * rateMultiplier) - renewableCredit;
        if (timeOfDay.equals("Peak") && renewablePercentage < 20) {
            recommendation = "Shift to Off-Peak";
        } else if (renewablePercentage >= 50) {
            recommendation = "Excellent! Continue";
        } else if (rateTier.equals("Basic") && powerConsumption > 500) {
            recommendation = "Upgrade to Time-of-Use";
        } else {
            recommendation = "Usage is Normal";
        }
        if (timeOfDay.equals("Peak")) {
            double peakCost = powerConsumption * baseRate * 1.6;
            double offPeakCost = powerConsumption * baseRate * 0.8;
            potentialSavings = peakCost - offPeakCost;
        }
        System.out.println("Time of Day:" + timeOfDay);
        System.out.println("Power Consumption:" + powerConsumption + "KWh");
        System.out.println("Renewable Energy:" + renewablePercentage + "%");
        System.out.println("Rate Tier:" + rateTier);
        System.out.println("Base Rate: $" + baseRate + "KWh");
        System.out.println("Rate Multiplier:" + rateMultiplier + "x");
        System.out.printf("Renewable Credit: $%.2f\n", renewableCredit);
        System.out.printf("Total Cost: $%.2f\n", cost);
        System.out.println("Optimization Recommendation:" + recommendation);
        System.out.println("Potential Savings: $" + potentialSavings);
        energy.close();
    }
}
