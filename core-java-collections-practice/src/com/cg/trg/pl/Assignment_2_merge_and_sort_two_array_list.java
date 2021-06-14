package com.cg.trg.pl;
import java.util.*;

public class Assignment_2_merge_and_sort_two_array_list {

	public static void main(String[] args) {
		List<Character> l1 = new ArrayList<Character>(); 
		List<Character> l2 = new ArrayList<Character>(); 
	//	System.out.println(l1.toString());
		l1.add('a');
		l1.add('f');
		l1.add('d');
		l2.add('r');
	//	System.out.println(l1.toString());
		l2.add('t');
	//	l1.addAll(l2);
		
	//	System.out.println(l1.toString());
	
		// TODO Auto-generated method stub
//		public String addMessages(List<Object> l2,List<Object> l1) {
//			l1.Addall(l2);
//		
//		   return "fsas";
		
//	}
		char c[] = addd(l1,l2);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(" ,"+c[i]);
		}
	}
	public static char[] addd(List<Character> a,List<Character> b)
	{
		a.addAll(b);
		char c[] = new char[a.size()];
		for(int i=0;i<a.size();i++)
		{
			c[i]=a.get(i);
		}
		Arrays.sort(c);
		return c;
	}
	
}