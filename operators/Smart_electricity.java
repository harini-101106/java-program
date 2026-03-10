package operators;

import java.util.Scanner;

public class Smart_electricity {
    public static void main(String[] args) {
        Scanner monitor = new Scanner(System.in);
        int connectionValue = monitor.nextInt();
        int applianceMask = monitor.nextInt();
        String result = (connectionValue & applianceMask) != 0 ? "Active" : "Inactive";
        System.out.println(result);
        monitor.close();
    }
}
