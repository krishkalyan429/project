package com.cg.trg.pl;

import java.util.*;

public class CollectionExercise2 {

	public static void main(String[] args) {
	   String[] myList = {"Kalyan","Krish","Dhoni","Virat"};
	   List<String> list = modifyElement(myList,"Kalyan");
	   
}
private static List<String> modifyElement(String[] myList, String string) {
	List<String> ele =new ArrayList<>();
	ListIterator<String> iterator = (ListIterator<String>) ele.iterator();
	ele.set(0, "kal");
	System.out.println(ele);
			 
			
		 
		 
			 
		 
		return null;
	}

}
