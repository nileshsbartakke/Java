package com.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arith_operation {

	public static void main(String[] args) throws Exception, IOException  {
		// TODO Auto-generated method stub
		System.out.println("Enter No 1");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		int number1=Integer.parseInt(br1.readLine());
		
		System.out.println("Enter No 2");
		BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
		int number2=Integer.parseInt(br2.readLine());
		
				
		System.out.println("Addition "+(number2+number1));
		System.out.println("Subtraction "+ (number1-number2));
		System.out.println("Multiplication "+number1*number2);
		try {
			
				System.out.println("Divide "+number1/number2);
		}
		catch(Exception e)
		{
			System.out.println("You cant Divide by 0");
		}



	}

}
