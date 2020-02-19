package com.input;



public class crea_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 =new int[4];
		
		System.out.println("1D Array");
		for(int i=0;i<4;i++)
		{
			arr1[i]=i;
		}
		System.out.println("#####################");
		for(int i=0;i<=arr1.length-1;i++)
		{
		System.out.println(arr1[i]);
		}
	}

}
