package operators;

import java.util.Scanner;

public class Atm_withdrawal {
    public static void main(String[] args) {
        Scanner bank = new Scanner(System.in);
        int accountBalance = bank.nextInt();
        int withdrawalAmount = bank.nextInt();
        int dailyLimit = bank.nextInt();
        String result = (withdrawalAmount <= accountBalance && withdrawalAmount <= dailyLimit) ? "Approved"
                : "Declined";
        System.out.println(result);
        bank.close();
    }
}
