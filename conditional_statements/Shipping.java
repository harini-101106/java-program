package conditional_statements;

import java.util.Scanner;

public class Shipping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double packageWeight = sc.nextDouble();
        sc.nextLine();
        String destinationZone = sc.nextLine();
        String shippingSpeed = sc.nextLine();
        String packageSize = sc.nextLine();
        double baseRate = 0;
        double zoneMultiplier = 0;
        double sizeSurcharge = 0;
        int deliveryTime = 0;
        String serviceLevel = "";
        if (shippingSpeed.equals("Economy")) {
            baseRate = 5;
        } else if (shippingSpeed.equals("Standard")) {
            baseRate = 10;
        } else if (shippingSpeed.equals("Express")) {
            baseRate = 25;
        } else if (shippingSpeed.equals("Overnight")) {
            baseRate = 50;
        }
        double weightSurcharge = packageWeight * 1;
        if (destinationZone.equals("Local")) {
            zoneMultiplier = 1.0;
        } else if (destinationZone.equals("Regional")) {
            zoneMultiplier = 1.2;
        } else if (destinationZone.equals("National")) {
            zoneMultiplier = 1.5;
        } else if (destinationZone.equals("International")) {
            zoneMultiplier = 3.0;
        }
        if (packageSize.equals("Small")) {
            sizeSurcharge = 0;
        } else if (packageSize.equals("Medium")) {
            sizeSurcharge = 5;
        } else if (packageSize.equals("Large")) {
            sizeSurcharge = 15;
        } else if (packageSize.equals("Oversized")) {
            sizeSurcharge = 30;
        }
        double baseCost = (baseRate + weightSurcharge) * zoneMultiplier;
        double totalCost = baseCost + sizeSurcharge;
        if (shippingSpeed.equals("Economy")) {
            if (destinationZone.equals("Local"))
                deliveryTime = 7;
            else if (destinationZone.equals("Regional"))
                deliveryTime = 7;
            else if (destinationZone.equals("National"))
                deliveryTime = 7;
            else
                deliveryTime = 14;
        } else if (shippingSpeed.equals("Standard")) {
            if (destinationZone.equals("Local"))
                deliveryTime = 3;
            else if (destinationZone.equals("Regional"))
                deliveryTime = 5;
            else if (destinationZone.equals("National"))
                deliveryTime = 7;
            else
                deliveryTime = 10;
        } else if (shippingSpeed.equals("Express")) {
            if (destinationZone.equals("Local"))
                deliveryTime = 1;
            else if (destinationZone.equals("Regional"))
                deliveryTime = 2;
            else if (destinationZone.equals("National"))
                deliveryTime = 2;
            else
                deliveryTime = 3;
        } else if (shippingSpeed.equals("Overnight")) {
            deliveryTime = 1;
        }
        if (shippingSpeed.equals("Economy")) {
            serviceLevel = "Budget";
        } else if (shippingSpeed.equals("Standard")) {
            serviceLevel = "Standard";
        } else if (shippingSpeed.equals("Express")) {
            serviceLevel = "Priority";
        } else if (shippingSpeed.equals("Overnight")) {
            serviceLevel = "Premium";
        }
        System.out.println("Package Weight:" + packageWeight + "lbs");
        System.out.println("Destination Zone:" + destinationZone);
        System.out.println("Shipping Speed:" + shippingSpeed);
        System.out.println("Package Size:" + packageSize);
        System.out.println("Base Shipping Rate: $" + baseRate);
        System.out.println("Weight Surcharge: $" + weightSurcharge);
        System.out.println("Zone Multiplier:" + zoneMultiplier + "x");
        System.out.println("Size Surcharge:" + sizeSurcharge);
        System.out.println("Total Shipping Cost: $" + totalCost);
        System.out.println("Estimated Delivery:" + deliveryTime + "business days");
        System.out.println("Service Level:" + serviceLevel);
        sc.close();
    }
}
