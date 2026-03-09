package basics;

import java.util.Scanner;

public class Sports {
    public static void main(String[] args) {
        Scanner prize = new Scanner(System.in);
        int registration = prize.nextInt();
        int broadcast = prize.nextInt();
        int sponsor = prize.nextInt();
        int prizes = prize.nextInt();
        int rent = prize.nextInt();
        int advertising = prize.nextInt();
        int RemainingFund = registration + broadcast + sponsor - prizes - rent - advertising;
        System.out.println("Remaining Tournament Fund=" + RemainingFund);
        prize.close();
    }
}
