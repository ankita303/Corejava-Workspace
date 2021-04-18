package com.capg.ram.bank.application3;

public class BankRBI {
	
	static {
		System.out.println("Welcome to Employee Details..");
     	}
    BankRBI()
    {
    	System.out.println("RBI Bank Home Loan and Personal Loan Details");
    }
    
    BankRBI(double p,double r)
    {
    	System.out.println(p*r/100);
    }
    
    public final static void getBankDetails() 
    {
    	System.out.println("Home Loan in 8%");
    	System.out.println("Personal Loan in 10%");
    }
}
