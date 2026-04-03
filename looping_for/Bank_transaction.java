package looping_for;

import java.util.Scanner;

public class Bank_transaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String category = "";
        double totalDeposits = 0;
        double totalWithdrawals = 0;
        double totalTransfer = 0;
        double totalPayments = 0;
        for (int i = 1; i <= n; i++) {
            String transactionType = sc.next();
            double amount = sc.nextDouble();
            if (transactionType.equals("Deposit")) {
                category = "Credit";
                totalDeposits += amount;
            } else {
                category = "Depit";
                if (transactionType.equals("Withdrawals")) {
                    totalWithdrawals += amount;
                } else if (transactionType.equals("Transfer")) {
                    totalTransfer += amount;
                } else if (transactionType.equals("Payment")) {
                    totalPayments += amount;
                }
            }
            System.out.println("Transaction" + i + ":" + transactionType);
            System.out.println("Amount:$" + amount);
            System.out.println("Category:" + category);
            System.out.println();
        }
        double netBalance = totalDeposits - (totalWithdrawals + totalTransfer + totalPayments);
        System.out.println("Total Transaction:" + n);
        System.out.println("Total Deposits:$" + totalDeposits);
        System.out.println("Total Withdrawals:$" + totalWithdrawals);
        System.out.println("Total Transfer:$" + totalTransfer);
        System.out.println("Total Payments:$" + totalPayments);
        System.out.println("Net Balance Change:$" + netBalance);
        sc.close();
    }
}
