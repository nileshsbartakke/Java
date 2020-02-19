package com.collection;

import java.util.Iterator;
import java.util.Vector;

public class list3_vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v1=new Vector<String>();
		v1.add("Test1");
		v1.add("Test2");
		v1.add("Test3");
		v1.add("Test4");
		v1.add("Test5");

		/*for(String temp1: v1)
		{
			System.out.println(temp1);
		}
		*/
		System.out.println("#####################");
		Iterator<String> t1=v1.iterator();
		while (t1.hasNext()) {
			System.out.println(t1.next());
			
		}	
		System.out.println("#####################");
		for(int i=0;i<v1.size();i++)
		{
			System.out.println(v1.get(i));
		}
		System.out.println("#####################");
	}

}
