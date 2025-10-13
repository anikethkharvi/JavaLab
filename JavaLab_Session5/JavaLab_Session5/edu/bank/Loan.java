// Package declaration
package edu.bank;

// Interface for Loan
public interface Loan {
    void calculateEMI(double amount, int tenure);
    void displayLoanDetails();
}
