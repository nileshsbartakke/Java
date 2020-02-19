package com.collection;


public class list4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1= {55,33,44,11,22};
		
		for(int i=0;i<arr1.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[j]<arr1[min])
				{
					min=i;
				}
			
				int temp=arr1[min];
				arr1[min]=arr1[i];
				arr1[i]=temp;
			
		}
		}
		for(int i=0;i<arr1.length;i++)
		{
				System.out.println(arr1[i]);
		}

	}

}

