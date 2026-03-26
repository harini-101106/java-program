package looping_for;

import java.util.Scanner;

public class fitness_tracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String intensity = "";
        int calories = 0;
        double totalCalories = 0;
        int totalDuration = 0;
        String fitness = "";
        for (int i = 1; i <= n; i++) {
            String exerciseType = sc.next();
            int duration = sc.nextInt();
            if (exerciseType.equals("Running")) {
                calories = 10 * duration;
                intensity = "High";
            } else if (exerciseType.equals("Swimming")) {
                calories = 12 * duration;
                intensity = "High";
            } else if (exerciseType.equals("Cycling")) {
                calories = 8 * duration;
                intensity = "Moderate";
            } else if (exerciseType.equals("Gym")) {
                calories = 7 * duration;
                intensity = "Moderate";
            } else if (exerciseType.equals("Walking")) {
                calories = 4 * duration;
                intensity = "Low";
            }
            totalDuration += duration;
            totalCalories += calories;
            System.out.println("Session" + i + ":" + exerciseType);
            System.out.println("Duration:" + duration + "minutes");
            System.out.println("Calories Burned: " + calories);
            System.out.println("Intensity:" + intensity);
            if (i != n - 1) {
                System.out.println();
            }
        }
        double averageCalories = totalCalories / n;
        if (totalCalories < 300) {
            fitness = "Beginner";
        } else if (totalCalories >= 300 && totalCalories <= 1000) {
            fitness = "Intermediate";
        } else if (totalCalories > 1000) {
            fitness = "Advanced";
        }
        System.out.println("Total Workouts:" + n);
        System.out.println("Total Duration:" + totalDuration + "minutes");
        System.out.println("Total Calories Burned:" + (int) totalCalories);
        System.out.printf("Average Calories Per Seesion:%.2f\n", averageCalories);
        System.out.println("Fitness Level:" + fitness);
        sc.close();
    }
}
