package conditional_statements;

import java.util.Scanner;

public class Healthcare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine();
        String smokingStatus = sc.nextLine();
        String preExistingConditions = sc.nextLine();
        String coverageTier = sc.nextLine();
        double basePremium = 0;
        double risksurcharge = 0;
        if (age >= 18 && age <= 30) {
            if (coverageTier.equals("Basic")) {
                basePremium = 200;
            } else if (coverageTier.equals("Standard")) {
                basePremium = 300;
            } else if (coverageTier.equals("Premium")) {
                basePremium = 500;
            }
        } else if (age >= 31 && age <= 50) {
            if (coverageTier.equals("Basic")) {
                basePremium = 250;
            } else if (coverageTier.equals("Standard")) {
                basePremium = 350;
            } else if (coverageTier.equals("Premium")) {
                basePremium = 600;
            }
        } else if (age >= 51 && age <= 65) {
            if (coverageTier.equals("Basic")) {
                basePremium = 350;
            } else if (coverageTier.equals("Standard")) {
                basePremium = 450;
            } else if (coverageTier.equals("Premium")) {
                basePremium = 700;
            }
        } else if (age >= 66) {
            if (coverageTier.equals("Basic")) {
                basePremium = 400;
            } else if (coverageTier.equals("Standard")) {
                basePremium = 550;
            } else if (coverageTier.equals("Premium")) {
                basePremium = 800;
            }
        }
        if (smokingStatus.equals("Smoker") && (preExistingConditions.equals("Yes"))) {
            risksurcharge = basePremium * 70 / 100;
        } else if (smokingStatus.equals("Smoker")) {
            risksurcharge = basePremium * 40 / 100;
        } else if (preExistingConditions.equals("Yes")) {
            risksurcharge = basePremium * 30 / 100;
        } else {
            risksurcharge = 0;
        }
        double totalPremium = basePremium + risksurcharge;
        System.out.println("Age:" + age);
        System.out.println("Smoking Status:" + smokingStatus);
        System.out.println("Pre-existing Conditions:" + preExistingConditions);
        System.out.println("Coverage Tier:" + coverageTier);
        System.out.println("Base Premium:$" + basePremium);
        System.out.println("Risk Surcharge:$" + risksurcharge);
        System.out.println("Total Monthly Premium:" + totalPremium);
        sc.close();
    }
}
