package week3day2Listset;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
	
	public static void main(String[] args) {
		
		List<Integer> listvalues=new ArrayList<Integer>();
	//to add datas into the list
		
		listvalues.add(10);
		listvalues.add(11);
		listvalues.add(12);
		listvalues.add(13);
		listvalues.add(14);
		
		System.out.println(listvalues);
		
		//get the values from the list
		Integer integer = listvalues.get(0);
		System.out.println(integer);
		//add values to the particular index
		listvalues.add(0,15);
		System.out.println(listvalues);
		
		//remove data from the particular index
		listvalues.remove(3);
		System.out.println(listvalues);
		
		/*//clear all the values in the list
		listvalues.clear();
		System.out.println(listvalues);
		*/
		
		boolean contains=listvalues.contains(13);
		System.out.println(contains);
		
		//get the list size
		int size = listvalues.size();
		System.out.println(size);
	}

}
