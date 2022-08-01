package practice;

 class animal   {
	 
	 
	 public static void main(String[] args) {
//		for (int i=1;i<=3;i++) {
//			
//			
//			for(int j=1;j<=i;j++) {
//				System.out.print(" *");
//			}
//			System.out.println("");
//		
//		}
for (int i=8;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=8;j>=i;j--) {
				System.out.print(" "+j);
			}
			System.out.println("");
		
		}

for (int i=8;i>=1;i--) {
	
	for(int j=9;j>=i;j--) {
		System.out.print(" ");
	}
	for(int j=1;j<=i-1;j++) {
		char iq=(char)(j+64);
		System.out.print(" "+iq);
	}
	System.out.println("");

}

		
		
	}
 }

