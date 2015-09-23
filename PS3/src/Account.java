// Sehar Khan 
// CISC 181- Professor Gibbons 
// PS2- 9/17/15

import java.sql.Date;

public class Account {
	
	private int id = 0; //set this equal to 0 in the instance
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date datecreated;
	
	// Empty constructor
	public Account () {
		
	}
	
	//Constructor 
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	//Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDatecreated() {
		return datecreated;
	}
	
	// Method to get the monthly interest rate
	public double getMonthlyInterestRate(double annualInterestRate) {
		double monthlyInterestRate = annualInterestRate/12;
		return monthlyInterestRate;
	}
	
	// Method that withdraws from the current balance
	// and then returns the new balance.
	public double Withdraw (double withdraw) throws InsufficientFundsException {
		if(withdraw <= balance) {
			balance -= withdraw;
		}	
		else {
			double need = withdraw - balance;
			throw new InsufficientFundsException();
			
		}
		return balance;
		
	}
	
	// Method that makes deposits and then returns 
	// the new balance.
	public double Deposit (double deposit) {
		balance = balance + deposit;
		return balance;

	}
	

}
