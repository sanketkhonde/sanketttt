package interfaces;


class sparrow implements inter1{

	@Override
	
	public void sound(String g) {
		System.out.println("for sparrow sound is "+g);
	}
    @Override
	public void fly() {
		System.out.println("sparro can fly at low level");
	}
    @Override
	public void colour() {
		System.out.println("colour grey and black\n\n");
	}
	
	
}
class ostrich implements inter1{

	@Override
	public void sound(String s) {
		System.out.println(s+"is sound");
		
	}

	@Override
	public void fly() {
		System.out.println("can not fly ");
		
	}

	@Override
	public void colour() 
	{ System.out.println("colour black and white combination");
		
	}
	
	
}
public class interabstract {

	public static void main(String[] args) {
		sparrow sp=new sparrow();
		ostrich os=new ostrich();
		inter1.bird();
		sp.sound("chiu chiu");
		sp.fly();
		sp.colour();
		
		os.sound("for ostrich boom low deep ");
		os.fly();
		os.colour();
	}
	}


