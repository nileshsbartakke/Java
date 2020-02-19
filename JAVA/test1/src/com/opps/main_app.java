package com.opps;

public class main_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App1 ob1=new App1(1000,"Sam", 22);
		App1 ob2=new App1(2000,"Tom",26);
		App1 ob3=new App1(500,"John",30);
		ob1.display();
		ob2.display();
		//System.out.println(ob1);
		
		ob2.display();
		ob2.Withdrawal(3000);
		
		ob1.deposite(5000);
		ob1.toString();
		

	}

}
