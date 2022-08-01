package polymorphism;

public class comTime {
	public void m() {
		System.out.println("hi");
		
	}
	public void m(int a) {
		this.m();
		System.out.println("hihi"+a);
		
	}
	public void m(String f) {
		this.m(6);
		System.out.println("helloe");
		System.out.println(f);
		
		
	}
	public static void main(String[] args) {
		comTime n=new comTime();
//		n.m();
//		n.m(5);
		n.m("hahaha");
	}
	

}
