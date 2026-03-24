package looping_for;

import java.util.Scanner;

public class student_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String letterGrade = "";
        String status = "";
        double totalScore = 0;
        int highestScore = 0;
        int pass = 0;
        int fail = 0;
        for (int i = 0; i < n; i++) {
            String studentName = sc.next();
            int score = sc.nextInt();
            sc.nextLine();
            if (score >= 85 && score <= 100) {
                letterGrade = "A";
            } else if (score >= 70 && score <= 84) {
                letterGrade = "B";
            } else if (score >= 60 && score <= 69) {
                letterGrade = "C";
            } else if (score >= 50 && score <= 59) {
                letterGrade = "D";
            } else if (score >= 0 && score <= 49) {
                letterGrade = "F";
            }
            if (score >= 60) {
                status = "Pass";
                pass++;
            } else {
                status = "Fail";
                fail++;
            }
            totalScore += score;
            if (score > highestScore) {
                highestScore = score;
            }
            System.out.println("Student:" + studentName);
            System.out.println("Score:" + score);
            System.out.println("Letter Grade:" + letterGrade);
            System.out.println("Status:" + status);
            if (i != n - 1) {
                System.out.println();
            }
        }
        double average = totalScore / n;
        System.out.println();
        System.out.println("Total Students:" + n);
        System.out.println("Class Average:" + average);
        System.out.println("Highest Score:" + highestScore);
        System.out.println("Students Passed:" + pass);
        System.out.println("Students Failed:" + fail);
        sc.close();
    }
}
