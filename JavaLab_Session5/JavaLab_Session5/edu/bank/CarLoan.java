package edu.bank;

// CarLoan class implementing Loan interface
public class CarLoan implements Loan {
    double rateOfInterest = 9.2; // annual interest rate

    @Override
    public void calculateEMI(double amount, int tenure) {
        double emi = (amount * rateOfInterest * tenure) / 100;
        System.out.println("🚗 Car Loan EMI for " + tenure + " years: ₹" + emi);
    }

    @Override
    public void displayLoanDetails() {
        System.out.println("🚘 Car Loan with interest rate: " + rateOfInterest + "% per annum");
    }
}
