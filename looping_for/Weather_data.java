package looping_for;

import java.util.Scanner;

public class Weather_data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hothours = 0;
        int coldhours = 0;
        int highestHour = 0;
        int lowestHour = 0;
        double totalTemperature = 0;
        String status = "";
        double highTemperature = 0;
        double lowTemperature = 0;
        for (int i = 1; i <= n; i++) {
            int hour = sc.nextInt();
            double temperature = sc.nextDouble();
            if (temperature > 40 || temperature < 0) {
                status = "Extreme";
            } else if (temperature >= 32 && temperature <= 40) {
                status = "Hot";
            } else if (temperature >= 0 && temperature <= 10) {
            } else {
                status = "Normal";
            }
            if (temperature > highTemperature) {
                highTemperature = temperature;
                highestHour = hour;
            }
            if (temperature < lowTemperature) {
                lowTemperature = temperature;
                lowestHour = hour;
            }
            if (temperature >= 32) {
                hothours++;
            }
            if (temperature <= 10) {
                coldhours++;
            }
            totalTemperature += temperature;
            System.out.println("Hour" + hour + ":" + temperature + "°C");
            System.out.println("Status: " + status);
            System.out.println();
        }
        double average = totalTemperature / n;
        System.out.println("Total Readings:" + n);
        System.out.printf("Average Temperature:%.2f°C\n", average);
        System.out.println("Highest Temperature:" + highTemperature + "°C at Hour" + highestHour);
        System.out.println("Lowest temperature:" + lowTemperature + "°Cat hour" + lowestHour);
        System.out.println("Hot Hours:" + hothours);
        System.out.println("Cold hours:" + coldhours);
        sc.close();

    }
}
