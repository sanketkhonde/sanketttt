package inheritance;

public class inheritance3 extends inheritance2{
void m2(char f) {
super.m2('k');
	System.out.println("this is grandchild");
	System.out.println("wecan create object of  this method only\n"+f);
}
public static void main(String[] args) {
	inheritance3 p=new 	inheritance3();
	p.m();
	//p.m2();
    p.m2('l');
    p.m1();

}}
