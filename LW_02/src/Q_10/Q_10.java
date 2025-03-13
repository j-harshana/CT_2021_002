package Q_10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double loanAmount, annualInterestRate, monthlyInterestRate, monthlyPayment,totalPayment;
        int loanPeriod,numberOfPayments;

        System.out.println("Enter the loan amount: LKR");
        loanAmount = scan.nextDouble();

        System.out.println("Enter the annual interest rate: ");
        annualInterestRate = scan.nextDouble();

        System.out.println("Enter the loan period in months: ");
        loanPeriod = scan.nextInt();

        monthlyInterestRate = (annualInterestRate / 100) / 12;
        numberOfPayments = loanPeriod;
        monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow((1 / ( 1 + monthlyInterestRate)),numberOfPayments));
        totalPayment = monthlyPayment * numberOfPayments;

        System.out.println("Monthly Payment: LKR "+ df.format(monthlyPayment));
        System.out.println("Total Payment after "+loanPeriod+" months : LKR "+ df.format(totalPayment));
    }
}
