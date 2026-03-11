package conditional_statements;

import java.util.Scanner;

public class University_scholarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double gpa = scan.nextDouble();

        double familyIncome = scan.nextDouble();
        int extracurricularScore = scan.nextInt();
        String scholarshipType = scan.next();
        String eligibility = "not Eligible";
        double awardAmount = 0;
        String awardCategory = "None";
        if (gpa >= 2.5) {
            if (scholarshipType.equals("Merit")) {
                if (gpa >= 3.8 && extracurricularScore >= 80) {
                    eligibility = "Eligible";
                    awardAmount = 25000;
                    awardCategory = "Full";
                } else if (gpa >= 3.5 && extracurricularScore >= 70) {
                    eligibility = "Eligibility";
                    awardAmount = 15000;
                    awardCategory = "Partial";
                } else if (gpa >= 3.0 && extracurricularScore >= 60) {
                    eligibility = "Eligible";
                    awardAmount = 8000;
                    awardCategory = "Minimal";
                }
            } else if (scholarshipType.equals("Need-Based")) {
                if (familyIncome <= 30000 && gpa >= 3.5) {
                    eligibility = "Eligible";
                    awardAmount = 30000;
                    awardCategory = "Full";
                } else if (familyIncome <= 50000 && gpa >= 3.0) {
                    eligibility = "Eligible";
                    awardAmount = 18000;
                    awardCategory = "Partial";
                } else if (familyIncome <= 70000 && gpa >= 2.8) {
                    eligibility = "Eligible";
                    awardAmount = 10000;
                    awardCategory = "Minimal";
                } else if (scholarshipType.equals("Sports")) {
                    if (extracurricularScore >= 85 && gpa >= 3.0) {
                        eligibility = "Eligible";
                        awardAmount = 22000;
                        awardCategory = "Full";
                    } else if (extracurricularScore >= 75 && gpa >= 2.8) {
                        eligibility = "Eligible";
                        awardAmount = 20000;
                        awardCategory = "Partial";
                    } else if (extracurricularScore >= 65 && gpa >= 2.5) {
                        eligibility = "Eligible";
                        awardAmount = 12000;
                        awardCategory = "Minimal";
                    }
                }
            }
        }
        System.out.println("GPA:" + gpa);
        System.out.println("Family Income: $" + familyIncome);
        System.out.println("Extracurricular Score:" + extracurricularScore);
        System.out.println("Scholarship Type:" + scholarshipType);
        System.out.println("Eligibility:" + eligibility);
        System.out.println("Award Amount:$" + awardAmount);
        System.out.println("Award Category:" + awardCategory);
        scan.close();
    }
}
