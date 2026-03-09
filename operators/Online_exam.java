package operators;

import java.util.Scanner;

public class Online_exam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int theoryMarks = s.nextInt();
        int practical = s.nextInt();
        int average = (theoryMarks + practical) / 2;
        String result = (theoryMarks >= 50 && practical >= 50 && average >= 60) ? "pass" : "fail";
        System.out.println("Result=" + result);
        s.close();
    }
}
