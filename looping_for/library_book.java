package looping_for;

import java.util.Scanner;

public class library_book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double dailyFineRates = 0;
        int fineCaps = 0;
        int count = 0;
        double actualFine = 0;
        double totalFines = 0;
        String capApplied = "";
        for (int i = 1; i <= n; i++) {
            String bookType = sc.next();
            int daysLate = sc.nextInt();
            if (bookType.equals("Regular")) {
                dailyFineRates = 0.50;
            } else if (bookType.equals("Reference")) {
                dailyFineRates = 1.00;
            } else if (bookType.equals("Magazine")) {
                dailyFineRates = 0.25;
            }
            double fine = daysLate * dailyFineRates;
            if (bookType.equals("Regular")) {
                fineCaps = 10;
            } else if (bookType.equals("Reference")) {
                fineCaps = 20;
            } else if (bookType.equals("Magazine")) {
                fineCaps = 5;
            }
            if (fineCaps < fine) {
                actualFine = fineCaps;
                capApplied = "yes";
            } else {
                actualFine = fine;
                capApplied = "no";
            }
            if (daysLate > 0) {
                count++;
            }
            totalFines += actualFine;
            System.out.println("Book" + i + ":" + bookType);
            System.out.println("Days Late:" + daysLate);
            System.out.println("Daily Fine:$" + dailyFineRates);
            System.out.println("Calculated Fine:$" + fine);
            System.out.println("Actual Fine:$" + actualFine);
            System.out.println("Cap Applied:" + capApplied);
            System.out.println();
        }
        double averageFine = totalFines / n;
        System.out.println("Total Books:" + n);
        System.out.println("Total Fines Collected:$" + totalFines);
        System.out.println("Books Overdue:" + count);
        System.out.printf("Average Fine:$%.2f", averageFine);
        sc.close();
    }
}
