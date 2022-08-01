package practice;

import java.util.Arrays;

public class practice1{ public static void main(String[] args) {

	String s="sanket rajkumar hnde",s4="";
	String s5="";
	
	String[] s1=s.split(" ");
	
	for(int i=0;i<s1.length;i++) 
	{
		String s3=s1[i];    //sanket 
		for(int j=s3.length()-1;j>=0;j--) 
		{
			s4=s4+s3.charAt(j);
			
		}
       s4=s4+" ";
	}
	System.out.println(s4);
	
}}
	






	




	
		
	
		
		


        
      
	
		

			
			
			
		
			
		
		
	
	
	



