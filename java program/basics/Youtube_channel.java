package basics;

import java.util.Scanner;

public class Youtube_channel {
    public static void main(String[] args) {
        Scanner channel = new Scanner(System.in);
        int ads = channel.nextInt();
        int sponsor = channel.nextInt();
        int affiliate = channel.nextInt();
        int tax = channel.nextInt();
        int production = channel.nextInt();
        int income = ads + sponsor + affiliate - tax - production;
        System.out.println("Final Youtube Income=" + income);
        channel.close();
    }
}
