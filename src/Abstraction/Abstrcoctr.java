package Abstraction;
class tata extends abstr2{

	@Override
	public void fuel() {
		System.out.println("we tata use diesel as a fuel");
		}

	@Override
	public void emmission() {
		System.out.println("some amount of monoxide");
	}

	@Override
	public void origine(String c) {
		System.out.println(c+" is origine contry\n");
		}

	@Override
	public void h() {
		// TODO Auto-generated method stub
		
	}
		
}
class bmw extends abstr2{

	@Override
	void fuel() {
		System.out.println("this car uses petrol");
		
	}

	@Override
	void emmission() {
	System.out.println("low  hydrocarbon");
		}

	@Override
	void origine(String c) {
		System.out.println(c+" is origine contry");
		}

	@Override
	public void h() {
		// TODO Auto-generated method stub
		
	}
	
}

class Abstrcoctr {
	public static void main(String[] args) {
		tata t=new tata();
		bmw b=new bmw();
		t.carW("punch");t.emmission();t.fuel();t.origine("india");
		
		b.carW("Q7");b.emmission();b.fuel();b.origine("germany");
		
	}
	
}
