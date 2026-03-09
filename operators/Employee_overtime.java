package operators;

import java.util.Scanner;

public class Employee_overtime {
    public static void main(String[] args) {
        Scanner bonus = new Scanner(System.in);
        int workingHours = bonus.nextInt();
        int attendencePercentage = bonus.nextInt();
        String result = (workingHours > 40 && attendencePercentage >= 90) ? "Eligible" : "Not eligible";
        System.out.println(result);
        bonus.close();
    }
}
