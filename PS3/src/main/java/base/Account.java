package base;

//Garrett LaCurts

import java.util.Date;

public class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	
	/**
	 * Default account
	 */
	public Account() {
		
	}
	
	/**
	 * Creates new Account with specified id and balance
	 * @param id
	 * @param balance
	 */
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}

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

	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	/**
	 * Returns the monthly interest rate based on the annual interest rate
	 * @param rate
	 * @return
	 */
	public double getMonthlyInterestRate(double rate){
		
		this.annualInterestRate = rate;
		double monthRate = rate / 12;
		
		return monthRate;
	}
	
	/**
	 * Returns the balance after withdrawing money
	 * Throws an exception if the user attempts to draw too much
	 * @param withdrawAmount
	 * @return
	 * @throws InsufficientFundsException
	 */
	public double withdraw(double withdrawAmount) throws InsufficientFundsException {
		
		double bal = this.balance;
		bal -= withdrawAmount;
		
		return bal;
		
	}
	
	/**
	 * Returns the balance after depositing money
	 * @param depositAmount
	 * @return
	 */
	public double deposit(double depositAmount) {
		
		double bal = this.balance;
		bal += depositAmount;
		
		return bal;
		
	}
	
	/**
	 * Returns a String with the account statement, informing the user of
	 * their balance, id, and the date the account was created
	 * @param bal
	 * @param monthRate
	 * @param date
	 * @return
	 */
	public String accountStatement(double bal, double monthRate, Date date){
		balance = bal;
		dateCreated = date;
		monthRate = getMonthlyInterestRate(annualInterestRate);
		
		return "Balance: " + bal + 
			   "\nMonthly Rate: " + monthRate + 
			   "\nAccount Date: " + date;
	}

}
