package logicProgram;

import java.util.Arrays;
import java.util.Scanner;

public class numbers {
	public static void main(String[] args) throws InterruptedException {
		double i = 34;
		double b = 84;

		System.out.println("two numbers without using * symbol is : " + i / (1 / b));
		m5();
		m7();

	}

	static void m() {
		System.out.println("aaray");
		int s[] = { 1, 2 };
		int s1[] = { 1, 2 };
		if (s1.equals(s)) {
			System.out.println("equal");// check if equal

		} else {
			System.out.println("not ");
		}

	}

	static void m2() {
		int a[] = { 2, 9, 5, 95, 54};
		Arrays.sort(a);
		System.out.println(a[a.length - 2]);

	}

	static void m3() {
		System.out.println("fibbonaacci");
		int x = 0, y = 1, z;
		System.out.print("0 1 ");
		for (z = 1; z <= 100; z = x + y) {

			System.out.print(" " + z);
			x = y;
			y = z;
		}
	}

	static void m4() {
		Scanner s = new Scanner(System.in);
		System.out.println("Prime number");
		int a;
		int count = 0;
		int c;
		c = s.nextInt();
		for (a = 1; a <= c; a++) {
			if (c % a == 0) {

				count++;

			}
			// if(count==2) {System.out.println(a);}
		}
		if (count == 2) {
			System.out.println("entered integer is prime number");
		} else {
			System.out.println("not prime ");
		}
	}

	static void m5() {
		System.out.println("armstrong");

		int a = 1634, temp, b, n = 0;
		temp = a;
		// 153
		while (temp > 0) {
			b = temp % 10; // 153 3 5 0.1 ( 1 + 125 +27 )
			n = b * b * b*b + n; // 27 152 153
			temp = temp / 10; // 15 1
		}
		if (n == a) {
			System.out.println("entered is armstrong number");
		} else {
			System.out.println("not armstrong");
		}

	}

	static void m6() { // triangle of charecter
		for (int i = 4; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print("" + ((char) (j + 64)));
			}
			System.out.println();
		}

	}

	public static void m7() {
		System.out.println("prime series");
		int a, b, i, j;
		a = 12;
		b = 50;
		for (i = a; i <= b; i++) {

			for (j = 2; j <= i; j++) {

				if (i % j == 0) {
					break;
				}

			}
			if (i == j) {
				System.out.println(i);
				// Thread.sleep(1000);
			}

		}

	}

	public static void m9() {
		int a = 12321;  
		System.out.println("palimdrome program check " + a);
		int b, c, re = 0;

		b = a;
		while (b > 0) {
			c = b % 10;
			re = re * 10 + c;
			b = b / 10;
		}
		String A = (re == a) ? " is palimdrome" : "not palimdromw";
		System.out.println(A);

	}

	static void m0() { // FOR REVERSE STRING ANYTHING
		StringBuilder s = new StringBuilder("teknas si eman ym");
		System.out.println(s.reverse());

	}

	static void m12() { /// missing number in arrays

		int n = 5; // last number of series

		n = n * (n + 1) / 2; // formula for sum of numberr

		int a[] = { 1, 2, 4, 5 };

		for (int i = 0; i < a.length; i++) {
			n = n - a[i];
		}
		System.out.println("missing number is" + n);

	}

	public void m(int a) {

		if (a < 100) {
			System.out.println(a);
			a++;
			m(a + 1);

		}
		

	}
	static void m13() {
		
		int digit;
		int sum=0;
		for(int i=100;i<=10000;i++)
		{
			int num = i;    //100         153
			int cn=num;     //100          153
			int count=0;                    //0
		
			while(cn>0)
			{
				cn/=10;           //100/10==10       153%10    3  
				count++;          //1                 1
			}
			while(num>0)                             //153
			{
				digit=num%10;      //100%10==0       //3
				sum+=Math.pow(digit,count);       //sum =sum +0^1         3,1  =3
				num/=10;                          //10       //15
			} 
			if(i==sum)              //100==1              153==
			{
				System.out.println(i+" is armstrong number");
			}
			sum=0;			
		}

		
	}

}
