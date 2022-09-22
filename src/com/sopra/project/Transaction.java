package com.sopra.project;

public class Transaction 

{
	static int balance=10000;
	 
	        
	        
	 
	public static int deposit() 
	{
		
		System.out.println("current balance:" +balance);
		int deposit1=(balance+5000);
		return deposit1;
	}
	public static int withdraw() 
	{
		System.out.println("current balance:" +balance);
		int withdraw1= (balance-2000);
		return withdraw1;
	}
	public static void main(String[] args) 
	{
		System.out.println("Name of account holder:raju ");  
        System.out.println("Account no.:8888888 " );  
        System.out.println("bankid is: 0987 " );  
        System.out.println("Balance: " +balance);
		Transaction t=new Transaction();
		System.out.println("after deposit:" + t.deposit());
		System.out.println("after withdrawal:" +t.withdraw());
		
		
		
	}

}
