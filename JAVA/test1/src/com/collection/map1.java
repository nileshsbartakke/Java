package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> mapHttpErrors = new HashMap<>();
		 
		mapHttpErrors.put(200, "OK");
		mapHttpErrors.put(303, "See Other");
		mapHttpErrors.put(404, "Not Found");
		mapHttpErrors.put(500, "Internal Server Error");
		
		System.out.println("HashMap Collection");
		System.out.println(mapHttpErrors);
		
		System.out.println("#####################");
		for(Map.Entry<Integer, String> tmp1 : mapHttpErrors.entrySet())
		{
			System.out.println("Key "+tmp1.getKey()+" Value "+tmp1.getValue());
		}
	}

}
