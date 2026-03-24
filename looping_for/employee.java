package looping_for;

import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        double totalPayroll = 0;

        for (int i = 1; i <= n; i++) {

            String employeeName = sc.next();
            double baseSalary = sc.nextDouble();
            int performanceRating = sc.nextInt();
            sc.nextLine();

            int incrementPercentage = 0;

            if (performanceRating == 5) {
                incrementPercentage = 15;
            } else if (performanceRating == 4) {
                incrementPercentage = 10;
            } else if (performanceRating == 3) {
                incrementPercentage = 5;
            } else if (performanceRating == 2) {
                incrementPercentage = 2;
            } else {
                incrementPercentage = 0;
            }

            double finalSalary = baseSalary * (1 + incrementPercentage / 100.0);

            totalPayroll += finalSalary;

            System.out.println("Employee: " + employeeName);
            System.out.println("Base Salary: $" + baseSalary);
            System.out.println("Performance Rating: " + performanceRating);
            System.out.println("Increment: " + incrementPercentage + "%");
            System.out.println("Final Salary: $" + finalSalary);

            // if (i != n) {
            // System.out.println();
            // }
        }

        double average = totalPayroll / n;

        System.out.println();
        System.out.println("Total Employees Processed: " + n);
        System.out.println("Total Payroll: $" + totalPayroll);
        System.out.println("Average Salary: $" + String.format("%.2f", average));

        sc.close();
    }
}
