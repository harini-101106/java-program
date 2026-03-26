package looping_for;

import java.util.Scanner;

public class Atm_cash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double initialBalance = sc.nextDouble();
        int n = sc.nextInt();
        int success = 0;
        int failure = 0;
        String status = "";
        double totalWithdrawnAmount = 0;
        for (int i = 0; i < n; i++) {
            double withdrawalAmount = sc.nextDouble();
            if (withdrawalAmount <= initialBalance) {
                status = "Approved";
                initialBalance -= withdrawalAmount;
                success++;
                totalWithdrawnAmount += withdrawalAmount;
            } else {
                status = "Insufficient funds";
                failure++;
            }
            System.out.println("Transaction" + i + ":$" + withdrawalAmount);
            System.out.println("Status:" + status);
            System.out.println("Remaining Balance:$" + initialBalance);
            if (i != n - 1) {
                System.out.println();
            }
        }
        System.out.println("Total Transaction:" + n);
        System.out.println("Successful withdrawal:" + success);
        System.out.println("Failed Withdrawal:" + failure);
        System.out.println("Final Balance:$" + initialBalance);
        System.out.println("Total Withdrawn:$" + totalWithdrawnAmount);
        sc.close();
    }
}