package com.input;

import java.util.Scanner;

public class do_while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number=new Scanner(System.in);
		int value;
		do {
			value=number.nextInt();
			System.out.println(value);
			
		} while(value!=5);

	}

}
