
public class constructor {
	String brand;int price;
	
	constructor (String a ,int b){
		
		brand=a;price =b;
		System.out.printf("%s "
+"is brand and price is %d lack\n",brand,price);
		
		
	}
	
	public static void main(String[] args) {
		
		constructor c=new constructor ("tata",2);
		constructor c1=new constructor ("toyota",5);
		
		
		
		System.out.println();
	}

}
