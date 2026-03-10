package operators;

import java.util.Scanner;

public class Bank_loan {
    public static void main(String[] args) {
        Scanner loan = new Scanner(System.in);
        int salary = loan.nextInt();
        int creditScore = loan.nextInt();
        String result = (salary > 25000 && creditScore > 700) ? "Approved" : "Rejected";
        System.out.println(result);
        loan.close();
    }
}
