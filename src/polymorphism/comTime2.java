package polymorphism;
class comp{
	public void co()
	{
		System.out.println("first parent in polymorpsm");
	
	}
	public void co(int a)
	{
		System.out.println(a);
	}
	
}

public class comTime2 extends comp {
	public void co() 
	{super.co();
		System.out.println(" after without para because "
				+ "we used super ");
	}
public void co(int a) {
	    super.co(68);
		System.out.println("para with int "+a);
	}
public void co(String s) {
	System.out.println("string para "+s);
}
public static void main(String[] args) {
	comTime2 com =new comTime2 ();
	com.co();
	com.co(54);
	com.co("in polymorphism");
}
	

}

