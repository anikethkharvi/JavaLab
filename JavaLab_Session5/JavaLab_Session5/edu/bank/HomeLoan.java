package edu.bank;

// HomeLoan class implementing Loan interface
public class HomeLoan implements Loan {
    double rateOfInterest = 8.5; // annual interest rate

    @Override
    public void calculateEMI(double amount, int tenure) {
        double emi = (amount * rateOfInterest * tenure) / 100;
        System.out.println("🏡 Home Loan EMI for " + tenure + " years: ₹" + emi);
    }

    @Override
    public void displayLoanDetails() {
        System.out.println("🏠 Home Loan with interest rate: " + rateOfInterest + "% per annum");
    }
}
