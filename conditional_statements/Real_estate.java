package conditional_statements;

import java.util.Scanner;

public class Real_estate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String locationTier = scan.nextLine();
        int squareFootage = scan.nextInt();
        int propertyAge = scan.nextInt();
        int amenityScore = scan.nextInt();
        double setBasePricePersqft = 0;
        int ageAdjustment = 0;
        double amenityBonus = 0;
        double baseValue = 0;
        String marketCategory = "";
        if (locationTier.equals("Prime")) {
            setBasePricePersqft = 400;
        } else if (locationTier.equals("Urban")) {
            setBasePricePersqft = 300;
        } else if (locationTier.equals("Suburban")) {
            setBasePricePersqft = 180;
        } else if (locationTier.equals("Rural")) {
            setBasePricePersqft = 100;
        }
        if (propertyAge >= 0 && propertyAge <= 5) {
            ageAdjustment = 0;
        } else if (propertyAge >= 6 && propertyAge <= 15) {
            ageAdjustment = -5;
        } else if (propertyAge >= 16 && propertyAge <= 30) {
            ageAdjustment = -15;
        } else if (propertyAge >= 31) {
            ageAdjustment = -25;
        } else {
            ageAdjustment = -25;
        }
        baseValue = squareFootage * setBasePricePersqft;
        if (amenityScore >= 80 && amenityScore <= 100) {
            amenityBonus = 0.10 * baseValue;
        } else if (amenityScore >= 60 && amenityScore <= 79) {
            amenityBonus = 0.05 * baseValue;
        } else if (amenityScore >= 40 && amenityScore <= 59) {
            amenityBonus = 0.02 * baseValue;
        } else if (amenityScore < 40) {
            amenityBonus = 0;
        }
        double adjustedValue = baseValue * (1 + ageAdjustment / 100.0);
        double finalValue = adjustedValue + amenityBonus;
        if (locationTier.equals("Prime") || (locationTier.equals("Urban")) && (propertyAge < 15)) {
            marketCategory = "Hot";
        } else if (locationTier.equals("Suburban")) {
            marketCategory = "Stable";
        } else if (locationTier.equals("Rural") || (propertyAge > 30)) {
            marketCategory = "Slow";
        }
        System.out.println("Location Tier:" + locationTier);
        System.out.println("Square Footage:" + squareFootage + "sq ft");
        System.out.println("Property Age:" + propertyAge + "years");
        System.out.println("Amenity Score:" + amenityScore);
        System.out.println("Base Price Per Sq Ft: $" + setBasePricePersqft);
        System.out.println("Age Adjustment:" + ageAdjustment);
        System.out.println("Amenity Bonus: $" + amenityBonus);
        System.out.println("Estimated Property Value: $" + finalValue);
        System.out.println("Market Category:" + marketCategory);
        scan.close();
    }
}
