package com.cg.trg.pl;

import java.util.*;  
import java.util.List;

public class Assignment_1_find_string_inlist {
	public static void main(String[] args) {
		
	
	 List<String> list=new ArrayList<String>();  
	 list.add("Mango");  
	 list.add("Appleddd");  
	 list.add("Banana");  
	 list.add("Grapes");
	 String s = "Appleddd";
	 ListIterator<String> sIterator = list.listIterator();
     while (sIterator.hasNext()) {
         System.out.println(sIterator.next());
	 
	}
     for(int i=0;i<list.size();i++)
     {
    	 if(list.get(i).equals(s))
    	 {
    		 int half = s.length() % 2 == 0 ? s.length()/2 : s.length()/2 + 1;
    		 list.set(i,s.substring(0, half));
    		
    	 }
     }
     for(int i=0;i<list.size();i++)
     {
    	System.out.println(list.get(i));
     }
	}

}