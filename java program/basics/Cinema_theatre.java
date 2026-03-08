package basics;

import java.util.Scanner;

public class Cinema_theatre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ticketRevenue = sc.nextInt();
        int snackRevenue = sc.nextInt();
        int maintenance = sc.nextInt();
        int electricity = sc.nextInt();
        int netProfit = ticketRevenue + snackRevenue - maintenance - electricity;
        System.out.println("Net Profit=" + netProfit);
        sc.close();
    }
}
