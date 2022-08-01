
public class non {
	int a=87;int b=45;
	public void m1() {
		
		System.out.println("stsatic method");
	}
	public void m2(double a,double  b) {
		
		System.out.println(this.a+this.b);
		System.out.println(b);
	
		System.out.println(a/b);
	}
	public void m3() {
		
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		non s=new non();
		s.m1();
		s.m2(10.654,102.65);
		
		
	}

}
