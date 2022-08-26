package week3day1;

public class LearnStringMethods {
	
	public static void main(String[] args) {
		
		
		String word="Testleaf#12";
		
		//length of string
		
		int length = word.length();
		System.out.println(length);
		
		char[] charArray = word.toCharArray();
		for (int i =0; i< charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		
		System.out.println();
		
		char charAtIndex = word.charAt(2);
		System.out.println("To find the particular character based on index "+charAtIndex);
		
		String upperCase = word.toUpperCase();
		System.out.println(upperCase);
		
		
		String lowerCase = word.toLowerCase();
		System.out.println(lowerCase);
		
		
		
		
		
	}

}
