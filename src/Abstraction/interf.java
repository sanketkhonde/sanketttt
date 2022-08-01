package Abstraction;

public class interf implements interf1,interf2{

	@Override
	public void m4() {
System.out.println("from 2 inter");	
	}

	@Override
	public void m5() {
		System.out.println("from 2 inter");			
	}

	@Override
	public void m6() {
		System.out.println("from 2 inter");			
	}

	@Override
	public void m1() {
		System.out.println("from 1 inter");			
	}

	@Override
	public void m2() {
		System.out.println("from 1 inter");			
	}

	@Override
	public void m3() {
		System.out.println("from 1 inter");			
	}
	public static void main(String[] args) {
		System.out.println("this sub class calling interfaces\n");
		 interf h=new  interf();
		 h.m1();h.m2();h.m3();h.m4();h.m5();h.m6();
	}


}
