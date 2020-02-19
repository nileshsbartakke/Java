package com.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class add_2arr {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		int[] arr1=new int[4];
		int[] arr2=new int[4];
		int[] Result=new int[4];
		
		System.out.println("Please Enter Element of Array1");
		for(int i=0;i<4;i++)
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int number1=Integer.parseInt(br.readLine());
			arr1[i]=number1;
		}
		System.out.println("Please Enter Element of Array2");
		for(int i=0;i<4;i++)
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int number2=Integer.parseInt(br.readLine());
			arr2[i]=number2;
		}
		System.out.println("Addition Of Array is ::");
		for(int i=0;i<4;i++)
		{
			Result[i]=arr1[i]+arr2[i];
		}
		for(int i=0;i<4;i++)
		{
			System.out.println(Result[i]);
		}
		
	}

}
