package com.test1;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=3,num2=2;
		System.out.println("Addition :"+(num1+num2));
		System.out.println("Subtraction:"+(num1-num2));
		
		try {
			System.out.println("Divide "+(num1/num2));
		}
		catch(Exception e){
			System.out.println("Cant not divide by 0");
		}
		System.out.println("Multiplication:"+(num1*num2));
		
		
	}

}
