package basics;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int mileage = sc.nextInt();
        int fuelPrice = sc.nextInt();
        int tollCharge = sc.nextInt();
        int base = distance * mileage;
        int bonus = base + fuelPrice;
        int total = bonus - tollCharge;
        System.out.println("Final Weekly Wage=" + total);
        sc.close();
    }
}
