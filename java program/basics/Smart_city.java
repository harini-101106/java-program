package basics;

import java.util.Scanner;

public class Smart_city {
    public static void main(String[] args) {
        Scanner water = new Scanner(System.in);
        int resUsage = water.nextInt();
        int resRate = water.nextInt();
        int comUsage = water.nextInt();
        int comRate = water.nextInt();
        int connection = water.nextInt();
        int penalty = water.nextInt();
        int maintenance = water.nextInt();
        int treatment = water.nextInt();
        int NetRevenue = (resUsage * resRate) + (comUsage * comRate) + connection + penalty + maintenance - treatment;
        System.out.println("Net Water Revenue=" + NetRevenue);
        water.close();

    }
}
