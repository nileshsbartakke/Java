package com.collection;

import java.util.LinkedList;

public class list2_linklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> technology=new LinkedList<String>();
		technology.add("Python");
		technology.add("JAVA");
		technology.add("Corona");
		technology.add("Python3");
		
		for(String temp:technology)
		{
			System.out.println(temp);
		}
		System.out.println("#####################");
		
		LinkedList<Integer> technology1=new LinkedList<Integer>();
		technology1.add(1);
		technology1.add(3);
		technology1.add(2);
		technology1.add(4);
	
		
		for(int temp1:technology1)
		{
			System.out.println(temp1);
		}
	}

}
