package com.collection;

import java.util.ArrayList;
import java.util.List;


public class list_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> Technology=new ArrayList<String>();
		
		Technology.add("Java");
		Technology.add("Python");
		Technology.add("Hadoop");
		Technology.add("Scala");
		
		System.out.println(Technology);
		for(int i=0;i<Technology.size();i++)
		{
			System.out.println(Technology.get(i));
		}
		
		List<Integer> Technology1=new ArrayList<Integer>();
		
		Technology1.add(22);
		Technology1.add(33);
		Technology1.add(44);
		Technology1.add(55);
		
		System.out.println(Technology1);
		for(int i=0;i<Technology1.size();i++)
		{
			System.out.println(Technology1.get(i));
		}
	}

}
