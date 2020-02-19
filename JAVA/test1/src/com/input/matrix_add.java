package com.input;

public class matrix_add {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr1= {11,13,14,12,15};
		System.out.println("Before Sorting...");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("#####################");
		for(int i=0;i<arr1.length-1;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if (arr1[i] > arr1[j])
				{
					int temp;
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		
		
		System.out.println("Bubble Sorting...");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
		
		for(int i=0;i<arr1.length-1;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if (arr1[i] < arr1[j])
				{
					int temp;
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		System.out.println("Bubble Sorting... Desending order");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}

}
