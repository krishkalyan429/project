package com.cg.trg.pl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> List1 = new ArrayList<>();
		ArrayList<Integer> List2 = new ArrayList<>();
		List1.add(10);List1.add(1);
		List1.add(15);List1.add(3);
		List1.add(80);
		List2.add(2);List2.add(19);
		List2.add(77);List2.add(4);
		ArrayList<Integer> List3 = MerdgeList(List1,List2);
//		System.out.println(List1 + " " + List2);
		System.out.println(List3);
	}

	private static ArrayList<Integer> MerdgeList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		List<Integer> list = new ArrayList<>();
		list.addAll(list1);
		list.addAll(list2);
		Collections.sort(list);
		return (ArrayList<Integer>) (list) ;
	}

}
