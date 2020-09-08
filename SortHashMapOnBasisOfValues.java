package com.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingValueInHashMap {

	public static void main(String[] args) {
		
	Integer[] input = {3,3,3,3,3,4,4,4,5,5,5,6,4,1,2,6};
  
  //key shuld in a order where values are sorted based on number of occurances of key...largest being first....output should be :: {3,4,5,6,1,2}
	
	List<Integer> inputList = Arrays.asList(input);
	
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	
	for (Integer integer : inputList) {
		if(!map.containsKey(integer)) 
			map.put(integer, 1);
		else
			map.put(integer, map.get(integer)+1);
	}
	
	List<Entry<Integer,Integer>> linkedList = 
			new LinkedList<Entry<Integer,Integer>>(map.entrySet());
	
	Collections.sort(linkedList, new Comparator<Entry<Integer, Integer>>() {

		@Override
		public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				
			return o2.getValue().compareTo(o1.getValue());
		}
	});
	
	Map<Integer,Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
	
	for (Entry<Integer, Integer> entry : linkedList) {
		linkedHashMap.put(entry.getKey(), entry.getValue());
	}
	
	for (Entry<Integer, Integer> entry : linkedHashMap.entrySet()) {
  	//for understanding	System.out.println(entry.getKey() +"      "+entry.getValue());
    
    System.out.println(entry.getKey());
	}
					
					
	}

}
