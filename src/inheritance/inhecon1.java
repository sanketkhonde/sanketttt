package inheritance;

public class inhecon1 extends inhecon {
	
inhecon1(){
		System.out.println("this is sub without para\n");
	}

inhecon1(int sa){
	super(54);
	
		System.out.println("sub with single para is "+sa);
	}
inhecon1(String a1,float a2,char a3)
    {
	super(47);
	
System.out.println(" \nsub with para "+a1+a2+a3);
	}
inhecon1(double d1,int d2){
	super(465.65,58);
	
		System.out.println("sub with 2 para "+d1+"  "+d2);
	}

public static void main(String[] args) {
		inhecon1 i=new inhecon1();
		inhecon1 i0=new inhecon1(123);
		inhecon1 i1=new inhecon1(" sub ",45.6f,'s');
		inhecon1 i2=new inhecon1(45.6,55);
	}
}
