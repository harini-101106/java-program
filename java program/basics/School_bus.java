package basics;

import java.util.Scanner;

public class School_bus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int distance = scan.nextInt();
        int rate = scan.nextInt();
        int maintenance = scan.nextInt();
        int allowance = scan.nextInt();
        int subsidy = scan.nextInt();
        int transportFee = (distance * rate) + maintenance + allowance - subsidy;
        System.out.println("Total Transport Fee=" + transportFee);
        scan.close();
    }
}
