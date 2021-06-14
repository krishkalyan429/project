package com.cg.trg.pl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment_3_check_perfect_couple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> a = new HashMap<>();
		a.put(1,"aie-eia");
		a.put(2,"qed-deq");
		a.put(5,"fn-fr");
		System.out.println(perfect(a).toString());
		
		
	}

	public static List<Integer> perfect(HashMap<Integer,String> a)
	{
		String s;
		String s1;
		String s2;
		List<Integer> m = new ArrayList<Integer>();
		 for (Map.Entry<Integer,String> entry : a.entrySet()) {
	            s=entry.getValue();
	            s1=s.split("-")[0];
	            s2=s.split("-")[1];
	            char[] chars = s1.toCharArray();
	            Arrays.sort(chars);
	            s1 = new String(chars);
	            System.out.println(s1);
	            char[] charss = s2.toCharArray();
	            Arrays.sort(charss);
	            s2 = new String(charss);
	            System.out.println(s2);
	            if(s1.equals(s2))
	            {
	            	 m.add(entry.getKey());
	            }
	            
	        }
		
		return m;
	}

}