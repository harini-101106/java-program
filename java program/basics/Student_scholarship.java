package basics;

import java.util.Scanner;

public class Student_scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tuitionFees = sc.nextInt();
        int scholarship = sc.nextInt();
        int examFee = sc.nextInt();
        int libraryFee = sc.nextInt();
        int scholarshipPercentage = (tuitionFees * scholarship) / 100;
        int remainingFees = tuitionFees - scholarshipPercentage;
        int finalFees = remainingFees + examFee + libraryFee;
        System.out.println("Final Payable Fee=" + finalFees);
        sc.close();
    }
}
