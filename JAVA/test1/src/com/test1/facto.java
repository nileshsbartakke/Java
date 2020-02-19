package com.test1;

public class facto {

	public static int fact1(int a)
	{
		if(a==1)
			return 1;
		else
			return fact1(a-1)*a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Factorial of Number 5 is "+fact1(5));

	}

}
