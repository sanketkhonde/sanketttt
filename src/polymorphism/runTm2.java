package polymorphism;

public class runTm2 extends runTm {
public void runTm1(int y,String s) 
{
	super.runTm1(4,"parent");
	System.out.println(y+" "+s);
}
public void runTm1(String o) {
	super.runTm1("parent");
	System.out.println(" sub"+o);
}
public static void main(String[] args) {
	runTm2 hi=new runTm2();
	
	hi.runTm1(5," year");
	hi.runTm1(" year");
}
}
