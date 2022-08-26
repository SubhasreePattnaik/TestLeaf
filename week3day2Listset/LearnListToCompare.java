package week3day2Listset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class LearnListToCompare {
	
	public static void main(String[] args) {
		String[] s= {"apple","orange","pine","guava"};
		List<String> names=new ArrayList<String>();
		for(int i=0;i<s.length;i++) {
			
			names.add(s[i]);
			}
		System.out.println(names);
		
		List<String> fruits = Arrays.asList(s);
		System.out.println(fruits);
		
		//collections-->collection interface
		
		Collections.sort(fruits);
		System.out.println(fruits);
		
		
	}

}
