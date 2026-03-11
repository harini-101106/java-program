package conditional_statements;

import java.util.Scanner;

public class Bank_loan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int creditScore = sc.nextInt();
        double annualIncome = sc.nextDouble();
        double deptToIncomeRatio = sc.nextDouble();
        String loanType = sc.next();
        String decision = "Rejected";
        double maximumLoanAmount = 0;
        if (creditScore >= 750) {
            if (deptToIncomeRatio <= 30) {
                if (loanType.equals("Home")) {
                    decision = "Approved";
                    maximumLoanAmount = 4 * annualIncome;
                } else if (loanType.equals("Personal")) {
                    decision = "Approved";
                    maximumLoanAmount = 1 * annualIncome;
                } else if (loanType.equals("Business")) {
                    decision = "Aproved";
                    maximumLoanAmount = 3 * annualIncome;
                }
            }
        } else if (creditScore >= 700 && creditScore <= 749) {
            if (deptToIncomeRatio >= 31 && deptToIncomeRatio <= 40) {
                if (loanType.equals("Home")) {
                    decision = "Needs Review";
                    maximumLoanAmount = 3 * annualIncome;
                } else if (loanType.equals("Business")) {
                    decision = "Approved";
                    maximumLoanAmount = 3 * annualIncome;
                }
            }
        } else if (creditScore >= 650 && creditScore <= 699) {
            if (loanType.equals("Personal")) {
                decision = "Needs Review";
                maximumLoanAmount = 0.5 * annualIncome;
            }
        } else if (creditScore < 650) {
            decision = "Rejected";
            maximumLoanAmount = 0;
        } else {
            if (creditScore < 600 || deptToIncomeRatio > 50) {
                decision = "Rejected";
                maximumLoanAmount = 0;
            }
        }
        System.out.println("Credit Score:" + creditScore);
        System.out.println("Annual Income:$" + annualIncome);
        System.out.println("Dept-to-Income Ratio:" + deptToIncomeRatio + "%");
        System.out.println("Loan Type:" + loanType);
        System.out.println("Decision:" + decision);
        System.out.println("Maximum Loan Amount:$" + maximumLoanAmount);
        sc.close();
    }
}
