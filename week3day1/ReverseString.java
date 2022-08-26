package week3day1;

public class ReverseString {
	public static void main(String[] args) {
		
	
	
	String word="Testleaf# 12";
	String rev="";
	//length of string
	System.out.println(rev);
	int length = word.length();
	System.out.println(length);
	
	//to convert String into character array
	
	char[] charArray = word.toCharArray();
	for(int j=charArray.length-1;j>=0;j--) {
		rev=rev+charArray[j];
	}
		System.out.println("Original String:"+word);
System.out.println("Reversed String:"+rev);
	
		// TODO Auto-generated method stub

	


}
	
}
		// TODO Auto-generated method stub

	


