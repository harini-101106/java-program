package basics;

import java.util.Scanner;

public class Mobile_data {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int baseCost = scan.nextInt();
        int extraGB = scan.nextInt();
        int ratePerGB = scan.nextInt();
        float tax = scan.nextFloat();
        int extra = extraGB * ratePerGB;
        float total = extra + baseCost;
        float bill = total + (total * tax / 100);
        System.out.println("Total Bill=" + bill);
        scan.close();
    }
}
