package looping_for;

import java.util.Scanner;

public class hotel_room {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String status = "";
        sc.nextLine();
        double totalRate = 0;
        double maxRate = 0;
        int peakday = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int dayNumber = sc.nextInt();
            double roomsOccupied = sc.nextInt();
            double totalRooms = sc.nextInt();
            double occupancyRate = (roomsOccupied / totalRooms) * 100.0;
            if (occupancyRate < 60) {
                status = "Low";
            } else if (occupancyRate >= 60 && occupancyRate <= 79) {
                status = "Moderate";
            } else if (occupancyRate >= 80 && occupancyRate <= 99) {
                status = "High";
            } else if (occupancyRate >= 100) {
                status = "Full";
                count++;
            }
            if (occupancyRate > maxRate) {
                maxRate = occupancyRate;
                peakday = dayNumber;
            }
            totalRate += occupancyRate;
            System.out.println("Rooms Occupied:" + roomsOccupied);
            System.out.println("Total Rooms:" + totalRooms);
            System.out.println("Occupancy Rate:" + occupancyRate + "%");
            System.out.println("Status:" + status);
            if (i != n - 1) {
                System.out.println();
            }
        }
        double averageOccupancyRate = totalRate / n;
        System.out.println("Total Days Analysed:" + n);
        System.out.printf("Average Occupancy Rate:%.2f %%\n", averageOccupancyRate);
        System.out.println("Peak Occupancy Day:" + "Day" + peakday);
        System.out.println("Days at Full Capacity:" + count);
        sc.close();
    }
}
