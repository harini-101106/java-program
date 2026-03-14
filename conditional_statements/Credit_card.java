package conditional_statements;

import java.util.Scanner;

public class Credit_card {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cardTier = sc.nextLine();
        String purchaseCategory = sc.nextLine();
        double transactionAmount = sc.nextDouble();
        sc.nextLine();
        String promotionalStatus = sc.nextLine();
        double baseRate = 1.0;
        double categoryBonus = 1.0;
        double tierMultiplier = 1.0;
        double promoMultiplier = 1.0;
        String rewardsTier = "";
        if (purchaseCategory.equals("Groceries")) {
            categoryBonus = 2.0;
        } else if (purchaseCategory.equals("Dining")) {
            categoryBonus = 2.5;
        } else if (purchaseCategory.equals("Travel")) {
            categoryBonus = 3.0;
        } else if (purchaseCategory.equals("Gas")) {
            categoryBonus = 2.0;
        } else if (purchaseCategory.equals("Other")) {
            categoryBonus = 1.0;
        }
        if (cardTier.equals("Basic")) {
            tierMultiplier = 1.0;
            rewardsTier = "Standard";
        } else if (cardTier.equals("Gold")) {
            tierMultiplier = 1.25;
            rewardsTier = "Enhanced";
        } else if (cardTier.equals("Platinum")) {
            tierMultiplier = 1.5;
            rewardsTier = "Premium";
        } else if (cardTier.equals("Black")) {
            tierMultiplier = 2.0;
            rewardsTier = "Elite";
        }
        if (promotionalStatus.equals("None")) {
            promoMultiplier = 1.0;
        } else if (promotionalStatus.equals("Double-Points")) {
            promoMultiplier = 2.0;
        } else if (promotionalStatus.equals("Triple-Points")) {
            promoMultiplier = 3.0;
        }
        double pointsEarned = transactionAmount * baseRate * categoryBonus * tierMultiplier * promoMultiplier;
        double cashValue = pointsEarned * 0.01;
        System.out.println("Card Tier: " + cardTier);
        System.out.println("Purchase Category: " + purchaseCategory);
        System.out.println("Transaction Amount: $" + transactionAmount);
        System.out.println("Promotional Status: " + promotionalStatus);
        System.out.println("Base Points Rate: " + baseRate + " points per dollar");
        System.out.println("Category Bonus: " + categoryBonus + "x");
        System.out.println("Tier Multiplier: " + tierMultiplier + "x");
        System.out.println("Promotional Multiplier: " + promoMultiplier + "x");
        System.out.println("Points Earned: " + pointsEarned);
        System.out.println("Equivalent Cash Value: $" + cashValue);
        System.out.println("Rewards Tier: " + rewardsTier);
        sc.close();
    }
}
