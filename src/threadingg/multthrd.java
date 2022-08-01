package threadingg;

class t extends Thread //for interface implements Runnable
{
	public void run() 
	{
		try {
      for(int i=0;i<=10;i++) 
{
	System.out.printf("Num is : %d\n",i);
	Thread.sleep(1000);
	
	
}
      }
		catch(Exception fdc) {
			System.out.println("handeled");
		}
	}
	
}

public class multthrd {
	public static void main(String[] args) throws Exception 
	{
	

	t s=new t();
	s.start();
 char ce[]= {'a','b','c','d','e','f','g','h','i'};
 for(char ef:ce) 
 {
	System.out.println("charecter is :"+ef);
	Thread.sleep(1000);
 }

}
}
