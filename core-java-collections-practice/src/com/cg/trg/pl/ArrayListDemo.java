package com.cg.trg.pl;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
	    ArrayList<String> langs = new ArrayList<>();
	    langs.add("java");langs.add("java SE");
	    langs.add("java script");langs.add("java EE");
	    Iterator<String> iterator = langs.iterator();
	    while(iterator.hasNext()) {
	    	System.out.println(iterator.next());
	    }
	    String searche = "java script";
	    
	    }
	}


