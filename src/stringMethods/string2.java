package stringMethods;

public class string2 {
	public static void main(String[] args) {

		// duplicates char in string

		String s = "dufgsdtsaeeplicate characters find";
		int c = 0;
		System.out.println("duplicates are");
		char[] a = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			c = 1;

			for (int j = i + 1; j < s.length(); j++) {

				if (a[i] == a[j] && a[i] != ' ') {
					c++;
					a[j] = '0';

				}

			}
			if (c > 1 && a[i] != '0') {
				System.out.println(a[i] + " ");
			}

		}

		//every char first upper
		String str="sanket raju khnde sfvd hf euhfr uehr uher s hb f ";
		String s1[]=s.split(" ");
		for(String e:s1) {
			String w=e.substring(0,1).toUpperCase()+e.substring(1);
			System.out.println(w+" ");

	}
		
		String ss1="hi";
		String s2="by";
		ss1=ss1+s2;     // hiby

		s2=ss1.substring(0,ss1.length()-s2.length());//hiby-by     
		ss1=ss1.substring(s2.length());
		System.out.println(ss1+" \n"+s2);



	
	
	
	
	
	}
	public static void m1() {
		//reapeat evry word in string 
		
		String s="sanket john india",s4="";
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
	}
	

}


