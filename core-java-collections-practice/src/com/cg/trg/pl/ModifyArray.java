package com.cg.trg.pl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ModifyArray {

	public static void main(String[] args) {
		char[] num = {'a','b','a','d','a','c','c'};
		Modifyarray(num);
	}

	private static void Modifyarray(char[] num) {
		String[] s = String.valueOf(num).split("");
		Set<String> set = new TreeSet<>();
		for(String i : s) {
			set.add(i);
		}
		ArrayList<String> al = new ArrayList<>();
		al.addAll(set);
		Collections.reverse(al);
		System.out.println(al);

	}

}
