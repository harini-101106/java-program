package basics;

import java.util.Scanner;

public class Fuel_cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int mileage = sc.nextInt();
        int fuelPrice = sc.nextInt();
        int tollCharge = sc.nextInt();
        int total = (distance / mileage) * fuelPrice + tollCharge;
        System.out.println("Total Trip Cost=" + total);
        sc.close();
    }
}
