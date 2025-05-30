package TEST;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  String input="rt";
	  Boolean hasVowel=false;
	  
	  for(int i=0;i<input.length();i++)
	  {
		  char ch= Character.toLowerCase(input.charAt(i));
		  if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
		  {
			  
			   hasVowel = true;
			  
			  
		  }
	  }
	  if(hasVowel)
		  System.out.print("The String has Vowels");
	  else
		  System.out.print("The String doesn't has Vowels"); 
			 
}}