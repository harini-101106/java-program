package operators;

import java.util.Scanner;

public class Smart_home {
    public static void main(String[] args) {
        Scanner alert = new Scanner(System.in);
        int unitsConsumed = alert.nextInt();
        int voltageFlutuation = alert.nextInt();
        String result = (unitsConsumed > 500 || voltageFlutuation == 1) ? "Alert" : "Normal";
        System.out.println(result);
        alert.close();
    }
}
