package stringMethods;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class String1 {
	public static void main(String[] args) {
		String s = " SANKET"; // string with literals//con shift f for clean systematic
		String s1 = " SANKET";

		String s3 = new String("SANKET"); // String with object
		String s4 = new String("SANKET");

		String s5 = " good morning";
		String s6 = " JAVA IS 1 OF THE BEST LANGUAGES";
		String s7 = "sanket";

		// strings are immutable
		System.out.println(s3.equals(s4));// true
		System.out.println(s3 == s4);// false
		System.out.println(s.equals(s1));
		System.out.println(s == s1);// true, because refer SCPA
		System.out.println(s1 == s4); // heap ads !=scpa ads

		// methods of strings

		s3 = s3.concat(s5);
		System.out.println(s3); // concat

		System.out.println(s5.toUpperCase());
		System.out.println(s6.toLowerCase());// LOWER AND UPPER CASE

		System.out.println(s6.charAt(3)); // charAt
		Scanner ss = new Scanner(System.in);
		// char t;
		// t=ss.next().charAt(0);
		// System.out.println(t);

		System.out.println(s.equalsIgnoreCase(s7));
		// .equalsIgnoreCase

		System.out.println(" length is " + s6.length());// length of string

		System.out.println(s.compareTo(s7)); // //compare in int
		System.out.println(s1.contentEquals(s)); // checking equals

		System.out.println();

		String d = "     hehe   ";
		System.out.println(d);
		System.out.println(d.trim()); /// trims the spaces that are present bn string

		System.out.println("index values is " + d.indexOf("he")); // shows the index value of first char
		System.out.println("index from last is " + d.lastIndexOf('h'));// shows index from last

		System.out.println("replace nd trim " + (d.replace('e', 'i')).trim());
		// replace values of ee int ii and trim simultaneously

		System.out.println(" all the" + d.replaceAll(s5, s7));
		String fff = "";

		System.out.println(s);
		System.out.println(s6.contains("BEst")); // false
		char[] c = s6.toCharArray();
		System.out.println(c[3]);
		for (char f : c) {
			System.out.println(f);
		}
		String[] se = s6.split(" ");
		// System.out.println(se[0]); // String arrays
		for (String g : se) {
			System.out.println(g);
		}

		System.out.println(s6.startsWith("JAVA"));
		System.out.println(s6.endsWith("S"));
		System.out.println(s6.substring(0, 2));// divide string

		// Replace all method...............regular rexpression
		String s8 = "wrwvi%$*YDJKGL&^(s87vs87(*KHGJH^v6878023874";
		System.out.println(s7.replaceFirst("k", "kh"));
		System.out.println(s8.replaceAll("[^0-9]", "kk")); // consider only 0-9
		System.out.println(s8.replaceAll("[^0-9]", ""));// wont consider 0-9
		System.out.println(s8.replaceAll("[^a-zA-Z]", ""));
		System.out.println(s8.replaceAll("[a-z]", ""));
		System.out.println(s8.replaceAll("[0-9!@#$%^&*()_+-]", ""));

		String de = "sankete";
		int co = 0;
		char f[] = de.toCharArray();
		for (int i = f.length - 1; i >= 0; i--) {
			if (f[i] == 'e') {
				co++;
			}
			System.out.print(f[i] + "");
		}
		System.out.println();
		System.out.println(co + " is co nuber");

		String jd = "";
		String sw = de;
		for (int j = sw.length() - 1; j >= 0; j--) // reverse and palimdrome

		{
			jd = jd + sw.charAt(j);
		}
		if (sw.equalsIgnoreCase(de))
			System.out.println("\n" + jd);
		else {
			System.out.println("\nnot equal");
		}
//
//		int[] sd = new int[2];
//
//		for (int i = 0; i <= sd.length - 1; i++) {
//			sd[i] = ss.nextInt();
//		}
//		for (int i = 0; i <= sd.length - 1; i++) {
//			System.out.println(sd[i]);
//		}

		String s2 = "anket";// first and last capital

		char d1[] = s2.toCharArray();

		for (int i = 0; i < d1.length; i++) {

			if (d1[0] >= 'a' && d1[0] <= 'z') {
				d1[0] = Character.toUpperCase(d1[0]);

			}
			if (d1[d1.length - 1] > 'a' && d1[d1.length - 1] < 'z') {
				d1[d1.length - 1] = Character.toUpperCase(d1[d1.length - 1]);

			}
			System.out.print(d1[i]);

		}
		System.out.println(); // first capital
		String f1f = "hello sanket";
		String s9 = f1f.substring(0, 1).toUpperCase() + f1f.substring(1);
		System.out.println(s9);

		// 000000000000000000000000000000

		// which char reapeted in string
		String sm = "sankets anketdjydfkfxkhck";
		for (int i = 0; i < sm.length(); i++) {
			char cm = sm.charAt(i);
			for (int j = i + 1; j < sm.length(); j++) {
				char cm1 = sm.charAt(j);
				if (cm1 == cm) {
					System.out.println("duplicate character is: " + cm1);
				}

			}

		}

//		
//	       String s1=" ",s3,f="";
//	       s3=s.nextLine();
//	       String s4=s1+s3;

		// first capital of sentence

		String s11 = " i am here";

		String f1 = "";

		for (int i = 0; i <= s11.length() - 1; i++) {
			char c1 = s11.charAt(i);
			if (c1 == ' ') {
				f1 = f1 + c1;
				i++;
				c1 = s11.charAt(i);
				f1 = f1 + Character.toUpperCase(c1);
			} else {
				f1 = f1 + c1;
			}

		}
		System.out.println(f1);

		int c1o = 0;//// character reapeated number of times
		String sss = "sanaket jhefv";
		for (int i = 0; i < sss.length(); i++) {
			char wwd = sss.charAt(i);
			if (wwd == 'a') {
				c1o++;
			}

		}
		System.out.println(" a repeated " + c1o + "times ");

	}

	public static void mm1() {

		String[] a = { "ert", "sdfs", "sdc", "sdc", "wdf", "ert" };

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (String s : a)

			if (hm.containsKey(s))
				hm.put(s, hm.get(s) + 1);
			else
				hm.put(s, 1);
		Set<String> ss = hm.keySet();
		for (String h : ss)

			if (hm.get(h) > 1)
				System.out.println(h + " " + hm.get(h) + " times repeated");
	}

	public static void mm2() {

		String s = "hfvijenijenfivnvijnvirnvihnrivn";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] c = s.toCharArray();
		for (char c1 : c)
			if (hm.containsKey(c1))
				hm.put(c1, hm.get(c1) + 1);
			else
				hm.put(c1, 1);
		Set<Character> set = hm.keySet();
		for (char c2 : set)
			if (hm.get(c2) > 1)
				System.out.println(c2 + " " + hm.get(c2));

	}
}
