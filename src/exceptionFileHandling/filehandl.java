package exceptionFileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class filehandl 
{
public static void main(String[] args) throws Exception
{
	System.out.println();
	System.err.println();

File s=new File("C:\\Users\\sanket\\Desktop\\helloeclips.txt");
if(s.createNewFile())
{
	System.out.println("file created");
}
else
{
	System.out.println("allredy  present");
}




try 
{
	 FileWriter w=new FileWriter("C:\\Users\\sanket\\Desktop\\helloeclips.txt");
	try 
	{
       
       w.write("new msg from me welcome");
   }
	finally 
	{
		
		w.close();
	}
	System.out.println("data wrote");

}
catch(Exception w)
{
	System.out.println("handled "+w);
	}

/////file reader



try
{
	FileReader fr=new FileReader("C:\\Users\\sanket\\Desktop\\hs.txt");
	try
	{
		
	
		
		int k=fr.read();
		while(k!=-1) 
		{
			System.out.print((char)k);
		}
	}
	finally 
	{
		fr.close();
	}
	
	System.out.println("\nabove is msg");
}
catch(Exception wd)
{
	System.out.println(wd);
}




   int []d= {3,33};

   try {
	   System.err.println("error");
	   System.out.println(d[0]);
	   
   }
   catch(Exception ec) {
	   System.out.println(ec);
   }
   finally {
	   System.out.println("app closing program exwcured successfuly");
	   
   }
   
}}
