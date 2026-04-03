package looping_for;

import java.util.Scanner;

public class blood_donation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String status = "";
        String reason = "";
        int eligible = 0;
        int rejected = 0;
        for (int i = 1; i <= n; i++) {
            String donarName = sc.next();
            int age = sc.nextInt();
            double weight = sc.nextDouble();
            double hemoglobin = sc.nextDouble();
            if ((age >= 18 && age <= 65) && (weight >= 50) && (hemoglobin >= 12.5)) {
                status = "Eligible";
                eligible++;
            } else {
                status = "Not Eligible";
                rejected++;
                if (age < 18) {
                    reason = "Age below 18 years";
                } else if (hemoglobin < 12.5) {
                    reason = "Hemoglobin below 12.5 g/dL";
                } else if (age > 65) {
                    reason = "Age above 65 years";
                }
            }
            System.out.println("Donor:" + donarName);
            System.out.println("Age" + age + "years");
            System.out.println("Weight:" + weight + "kg");
            System.out.println("Hemoglobin:" + hemoglobin + "g/dL");
            System.out.println("Status:" + status);
            if (status.equals("Not Eligible")) {
                System.out.println("Reason:" + reason);
            }
            System.out.println();
        }

        double eligibilityRate = ((double) eligible / n) * 100.0;
        System.out.println("Total Donar:" + n);
        System.out.println("Eligible Donars:" + eligible);
        System.out.println("Rejected Donors:" + rejected);
        System.out.printf("Eligibility Rate:%.2f%%", eligibilityRate);
        sc.close();
    }
}
