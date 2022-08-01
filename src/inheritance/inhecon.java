package inheritance;

public class inhecon {int b1;
  inhecon (){
	      System.out.println("this is super class ");
	      System.out.println("no arguments ");
	
}
   inhecon(int a){
	   this();
	      System.out.println(" \nsuper with para ");
	      System.out.println(" super  globle int parameter ;"+b1);
	
}
  inhecon(double d,int i){
	  this(54);
	      System.out.println("\nsuper wirh two para ");
	      System.out.println(" para of super class "+d+" "+i);
	
}
  inhecon(String c ,float u,char v){
	  
	  this(65.65,2);
	      System.out.println(" \nsuper with 3 para");
	      System.out.printf("para are %s %f %c ",c,u,v);
	
}
  public static void main(String[] args) {
	  inhecon hu=new   inhecon("hello",5.5f,'A');
}

}
