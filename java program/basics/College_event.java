package basics;

import java.util.Scanner;

public class College_event {
    public static void main(String[] args) {
        Scanner culture = new Scanner(System.in);
        int registration = culture.nextInt();
        int sponsorship = culture.nextInt();
        int stall = culture.nextInt();
        int stage = culture.nextInt();
        int celebrity = culture.nextInt();
        int marketing = culture.nextInt();
        int RemainingFund = registration + sponsorship + stall - stage - celebrity - marketing;
        System.out.println("Remaining Fund=" + RemainingFund);
        culture.close();
    }
}
