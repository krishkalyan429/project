package com.cg.trg.pl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Assignment_4_descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> o = new ArrayList<Integer>();
		o.add(2);
		o.add(2);
		o.add(89);
		o.add(100);
		o.add(5);
		System.out.println(k(o).toString());

	}
	public static List<Integer> k(List<Integer> a)
	{
		 TreeSet<Integer> u
         = new TreeSet<Integer>(a);
		 List<Integer> k = new ArrayList<Integer> (u);
		   Collections.sort(k, Collections.reverseOrder());
		   
		return k;
	
	}
}
