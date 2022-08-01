package castingImplisit;

public class child extends parent {
	public void age() {
	System.out.println("now i am 25 years old\n");
}
public void height() {
	System.out.println("now my height is 5,9 inch\n");
}
public void std(String s) {
	System.out.println("now i am "+s);
}
public void adr() {
	System.out.println("iam still living in maharashtra\n");
}

   public static void main(String[] args) {
	parent p=new child(); //Reference parent object of child	              
	p.age();
	p.color();
	p.height();
	p.std("working in it industry\n");
	((child) p).adr();
	
	
	
	child od=(child)p; //explicit 
	
	od.age();
	od.adr();

	
	

}

}
