package inheritance;

public class thisM {
	public void m1(int a) {
		System.out.println("first"+a);
	}
	
	public void m2() {
		this.m1(56);
		System.out.println("hi");
	}
	public void m3(char c) {
		this.m2();
		System.out.println(c);
	}
	public void m4(String g) {
		this.m1(56);
		this.m3('S');
		System.out.println("last ");
	}
	public static void main(String[] args) {
		thisM h=new thisM();
		h.m4("hehe");
	}

}
