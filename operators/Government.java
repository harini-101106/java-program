package operators;

import java.util.Scanner;

public class Government {
    public static void main(String[] args) {
        Scanner scholarship = new Scanner(System.in);
        int familyIncome = scholarship.nextInt();
        int percentage = scholarship.nextInt();
        String eligibility = (familyIncome < 200000 && percentage >= 75) ? "Granted" : "Not Granted";
        System.out.println(eligibility);
        scholarship.close();
    }
}
