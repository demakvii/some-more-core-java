package com.techlabs.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class TestArray {

	public static void main(String[] args) {
		//int [] nos = {10,20,30,40,50};
		
		 List<Integer> nos = new ArrayList<Integer>();
		 nos.add(10);
		 nos.add(20);
		 
		
		Iterator<Integer> i = nos.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		
	}

}
