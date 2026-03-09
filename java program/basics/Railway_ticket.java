package basics;

import java.util.Scanner;

public class Railway_ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int genPass = sc.nextInt();
        int genFare = sc.nextInt();
        int acpass = sc.nextInt();
        int acFare = sc.nextInt();
        int platform = sc.nextInt();
        int maintenance = sc.nextInt();
        int fuel = sc.nextInt();
        int NetRevenue = (genPass * genFare) + (acpass * acFare) + platform - maintenance - fuel;
        System.out.println("Net Railway Revenue=" + NetRevenue);
        sc.close();
    }
}
