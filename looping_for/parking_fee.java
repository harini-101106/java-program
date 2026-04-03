package looping_for;

import java.util.Scanner;

public class parking_fee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String capApplied = "";
        double hourlyRates = 0;
        int count = 0;
        double totalRevenue = 0;
        int cap = 0;
        for (int i = 1; i <= n; i++) {
            String vehicleType = sc.next();
            double hoursParked = sc.nextDouble();
            if (vehicleType.equals("Car")) {
                hourlyRates = 3;
            } else if (vehicleType.equals("Motorcycle")) {
                hourlyRates = 2;
            } else if (vehicleType.equals("Truck")) {
                hourlyRates = 5;
            } else if (vehicleType.equals("Bus")) {
                hourlyRates = 7;
            }
            double fee = hoursParked * hourlyRates;
            if (vehicleType.equals("Car")) {
                cap = 30;
            } else if (vehicleType.equals("Motorcycle")) {
                cap = 20;
            } else if (vehicleType.equals("Truck")) {
                cap = 60;
            } else if (vehicleType.equals("Bus")) {
                cap = 100;
            }
            if (cap < fee) {
                fee = cap;
                capApplied = "Yes";
            } else {
                capApplied = "No";
            }
            if (hoursParked > 8) {
                count++;
            }
            totalRevenue += fee;
            System.out.println("Vehicle" + i + ":" + vehicleType);
            System.out.println("Hours Parked:" + hoursParked);
            System.out.println("Hourly Rate:$" + hourlyRates);
            System.out.println("Parking Fee:$" + fee);
            System.out.println("Cap Applied:" + capApplied);
            System.out.println();
        }
        double averageFee = totalRevenue / n;
        System.out.println("Total Vhicles:" + n);
        System.out.println("Total Revenue:$" + totalRevenue);
        System.out.println("Average Fee:$" + averageFee);
        System.out.println("Peak Hour Vehicles (>8 hours):" + count);
        sc.close();
    }
}
