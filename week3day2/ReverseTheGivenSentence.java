package week3day2;

public class ReverseTheGivenSentence {
	
	public static void main(String[] args) {
		
		String word="I am Learning Java OOPs Concept";
		//Expected output=String rev="I ma gninrael avaj sPOO tpecnoC";
		//step:1 Break the sentence into words->string array->split
		 
		    String[] split = word.split(" ");//[i, am, learning,java,oops,concept]
		    
		//step:2 ->travel to each word array
		    
		    for(int i=0;i<split.length;i++) {
		    	
		    	if(i%2==0)
		    	{
		    	
		//step:3->convert each word array into char array
		    //split[0]=i
		    	//split[1]=[am]=[a,m]
		    	//split[2]=[Learning]=[L,e,a,r,n,i,n,g]
		    	
		    	char[] charArray = split[i].toCharArray();
		    	for(int j=charArray.length-1;j>=0;j--) {
		    		
		    		//rev the charArray
		    		
		    		System.out.print(charArray[j]);
		    	}
		    	
		    	System.out.print(" "); 
		    	}
		    	else 
		    	{
		    		System.out.println(split[i]);
		    	}
		    	}
		    	
		    }
		    
		    }
	


