package com.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tables {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		int number=1;
	/*	while(number<=10)
		{
			System.out.println(number);
			number++;
		} */
	/*	while(number<=10)
		{
			System.out.println(number*2);
			number++;
		}
		*/
		System.out.println("Enter Which table you want ");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		int table=Integer.parseInt(br1.readLine());
		while(number<=10)
		{
			System.out.print(" "+number*table);
			number++;
		}

	}

}
