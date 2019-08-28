package pratice;

import java.util.Scanner;

public class bankapp {
	
	String customernm;
	String customerid;
	int balance;
	int amount;
	
	public bankapp(String cname,String cid) {
	// TODO Auto-generated constructor stub
		customernm=cname;
		customerid=cid;
	
	}
	
	void deposite(int amount)
	{
		if(amount!=0)
		{
			balance+=amount;
			System.out.println("your balance is "+balance);
		}
		else
			System.out.println("Amount can not be zero");
	}
	
	void withdrawal(int amount)
	{
		if(amount < balance)
		{
			balance-=amount;
			System.out.println("available balance is "+balance);
		}
		else
			System.out.println("you have no balance in your account");
	}
	
	void display()
	{
		
		System.out.println("Welcome to Bank");
		System.out.println("A.Deposite Money");
		System.out.println("B.Withdrawal Money");
		System.out.println("C.Check Balance");
		System.out.println("D.Exit");
		
		
		char option='\0';
		Scanner scanner=new Scanner(System.in);
		do
		{
			System.out.println("Please Enter your choice");
			option=scanner.next().charAt(0);
			
		switch (option) {
		case 'A':
			System.out.println("======================================================");
			System.out.println("Please Enter amount:");
			amount=scanner.nextInt();
			deposite(amount);
			System.out.println("======================================================");

			break;
		case 'B':
			System.out.println("======================================================");
			System.out.println("Please Enter amount:");
			amount=scanner.nextInt();
			withdrawal(amount);
			System.out.println("======================================================");

			break;


		default:
			System.out.println("Get back Soon");
			break;
		}
		}while (option!='D');
		
		
		
		
		
	}
	
	
	

}
