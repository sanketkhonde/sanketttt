package exceptionFileHandling;

public class trycatch {public static void main(String[] args) {
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
}

}
