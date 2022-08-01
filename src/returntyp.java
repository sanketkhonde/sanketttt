
public class returntyp {
	
	public int m(int a) {
		
		System.out.println(a*a*a);
		return a;
	}
	public String m2(String s) {
		
		
		return s;
	}
	public static void main(String[] args) {
		
		
		returntyp r=new returntyp();
		int i=r.m(4);
		System.out.println(i*i*i);
		
		returntyp r1=new returntyp();
		returntyp sr=new returntyp();
		
		System.out.println(i+sr.m2(" is cube root"));
		
	}

}
