package basics;

import java.util.Scanner;

public class Restaurant_bill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalBill = scan.nextInt();
        float servicePercentage = scan.nextFloat();
        float gstPercentage = scan.nextFloat();
        int numberOfPeople = scan.nextInt();
        float serviceCharge = (totalBill * servicePercentage) / 100;
        float bill = totalBill + serviceCharge;
        float gst = (bill * gstPercentage) / 100;
        float finalBill = gst + bill;
        float personPay = finalBill / numberOfPeople;
        System.out.println("Amount Per Person=" + personPay);
        scan.close();
    }
}
