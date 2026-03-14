package conditional_statements;

import java.util.Scanner;

public class University_course {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentStatus = sc.nextLine();
        int creditHours = sc.nextInt();
        sc.nextLine();
        String programType = sc.nextLine();
        String residency = sc.nextLine();
        double baseTuitionPerCredit = 0;
        double residencyMultiplier = 0;
        double programFee = 0;
        double activityFee = 0;
        String category = "";
        if (programType.equals("Undergraduate")) {
            baseTuitionPerCredit = 350;
        } else if (programType.equals("Graduate")) {
            baseTuitionPerCredit = 550;
        } else if (programType.equals("Professional")) {
            baseTuitionPerCredit = 800;
        }
        if (residency.equals("In-State")) {
            residencyMultiplier = 1.0;
        } else if (residency.equals("Out-of-State")) {
            residencyMultiplier = 2.5;
        } else if (residency.equals("International")) {
            residencyMultiplier = 3.0;
        }
        if (studentStatus.equals("Full-Time")) {
            if (programType.equals("Undergraduate")) {
                programFee = 500;
            } else if (programType.equals("Graduate")) {
                programFee = 750;
            } else if (programType.equals("Professional")) {
                programFee = 1200;
            }
        } else if (studentStatus.equals("Part-Time")) {
            if (programType.equals("Undergraduate")) {
                programFee = 300;
            } else if (programType.equals("Graduate")) {
                programFee = 750;
            } else if (programType.equals("Professional")) {
                programFee = 900;
            }
        } else if (studentStatus.equals("Continuing-Education")) {
            programFee = 150;
        }
        if (studentStatus.equals("Full-Time")) {
            activityFee = 200;
        } else if (studentStatus.equals("Part-Time")) {
            activityFee = 100;
        } else if (studentStatus.equals("Continuing-Education")) {
            activityFee = 50;
        }
        double tuitionCost = creditHours * baseTuitionPerCredit * residencyMultiplier;
        double totalFee = tuitionCost + programFee + activityFee;
        if (studentStatus.equals("Full-Time") && (residency.equals("In-State"))) {
            category = "Standard";
        } else if (studentStatus.equals("Continuing-Education")) {
            category = "Reduced";
        } else if (residency.equals("Out-of-State") || (residency.equals("International"))) {
            category = "Premium";
        }
        System.out.println("Student Status:" + studentStatus);
        System.out.println("Credit Hours:" + creditHours);
        System.out.println("Program Type:" + programType);
        System.out.println("Residency:" + residency);
        System.out.println("Base Tuition Per Credit: $" + baseTuitionPerCredit);
        System.out.println("Residency Multiplier:" + residencyMultiplier + "x");
        System.out.println("Program Fee: $" + programFee);
        System.out.println("Student Activity Fee: $" + activityFee);
        System.out.println("Total Rgistration Fee: $" + totalFee);
        System.out.println("Fee Category:" + category);
        sc.close();

    }
}
