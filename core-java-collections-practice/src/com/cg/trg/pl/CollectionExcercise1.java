package com.cg.trg.pl;

import java.util.HashMap;
import java.util.Map;

public class CollectionExcercise1 {

	public static void main(String[] args) {
		String states[]= {"Goa","kerala","gujarat"};
		Map<String,String> statesMap=
						new CollectionExcercise1().getStatesAsMap(states);
		for(Map.Entry<String,String> m: statesMap.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}

	}
	
	public Map<String,String> getStatesAsMap(String states[]){
		Map<String,String> map = new HashMap<>();
		 for(String s: states) {
	            map.put(s.substring(0,3).toUpperCase(), s);
		 }
		return map;
	}

}

