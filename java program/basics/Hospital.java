package basics;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roomCharge = sc.nextInt();
        int days = sc.nextInt();
        int medicineCost = sc.nextInt();
        int labFees = sc.nextInt();
        int insuranceCoverage = sc.nextInt();
        int finalBill = (roomCharge * days) + medicineCost + labFees - insuranceCoverage;
        System.out.println("Payable Amount=" + finalBill);
        sc.close();
    }
}
