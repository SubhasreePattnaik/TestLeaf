package week3day2Listset;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class LearnList2 {
	
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(3);
		numbers.add(2);
		numbers.add(6);
		
		int size=numbers.size();
		System.out.println("Size of the list" +size);
		int count=0;
		for(int i=0;i<size;i++);
		int i=0;
		System.out.println(numbers.get(i));
		if(numbers.get(i)==3) {
			//arr[i]==arr[i+1]
			count++;
		}
		System.out.println(count);	
	}


}



	



