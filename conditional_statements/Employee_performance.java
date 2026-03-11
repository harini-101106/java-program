package conditional_statements;

import java.util.Scanner;

public class Employee_performance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int performance = sc.nextInt();
        int yearsOfService = sc.nextInt();
        String departmentType = sc.next();
        double baseSalary = sc.nextDouble();
        int bonusPercentage = 0;
        String status = "Not eligible";
        if (performance >= 3) {
            status = "Eligible";
            if (departmentType.equals("Critical")) {
                if (performance == 5 && yearsOfService >= 5) {
                    bonusPercentage = 25;
                } else if (performance == 4 && yearsOfService >= 10) {
                    bonusPercentage = 22;
                } else if (performance == 4) {
                    bonusPercentage = 15;
                } else if (performance == 3) {
                    bonusPercentage = 10;
                }
            } else if (departmentType.equals("Non-Critical")) {
                if (performance == 5) {
                    bonusPercentage = 18;
                } else if (performance == 4) {
                    bonusPercentage = 12;
                } else if (performance == 3) {
                    bonusPercentage = 8;
                }
            }
        }
        double bonus = baseSalary * bonusPercentage / 100;
        System.out.println("Performance Rating:" + performance);
        System.out.println("Years of servive:" + yearsOfService);
        System.out.println("Department:" + departmentType);
        System.out.println("Bonus Percentage:" + bonusPercentage + "%");
        System.out.println("Bonus Amount:$" + bonus);
        System.out.println("Status:" + status);
        sc.close();
    }
}
