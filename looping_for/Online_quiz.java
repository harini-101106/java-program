package looping_for;

import java.util.Scanner;

public class Online_quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pass = 0;
        int fail = 0;
        double highestScore = 0;
        String result = "";
        int score = 0;
        double totalScore = 0;
        for (int i = 1; i <= n; i++) {
            String studentName = sc.next();
            int correctAnswers = sc.nextInt();
            int wrongAnswers = sc.nextInt();
            int unattempted = sc.nextInt();
            score = (correctAnswers * 4) - (wrongAnswers * 3) + (unattempted * 0);
            if (score >= 32) {
                result = "Pass";
                pass++;
            } else {
                result = "Fail";
                fail++;
            }
            if (score > highestScore) {
                highestScore = score;
            }
            totalScore += score;
            System.out.println("Student:" + studentName);
            System.out.println("Correct:" + correctAnswers);
            System.out.println("Wrong:" + wrongAnswers);
            System.out.println("Unattempted:" + unattempted);
            System.out.println("Score:" + score);
            System.out.println("Result:" + result);
            System.out.println();
        }
        double classAverage = totalScore / n;
        System.out.println("Total Students:" + n);
        System.out.println("Pass Count:" + pass);
        System.out.println("Fail Count:" + fail);
        System.out.println("Class Average:" + classAverage);
        System.out.println("Highest Score:" + (int) highestScore);
        sc.close();

    }
}
