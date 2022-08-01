package Abstraction;

public class ex3 implements ex,ex1{
	public void instrument() {
		System.out.println("working");
	}
	public void aa() {System.out.println("sdjba");}
public static void main(String[] args) {
	ex3 n=new ex3();
	n.instrument();
	n.aa();
}
}
