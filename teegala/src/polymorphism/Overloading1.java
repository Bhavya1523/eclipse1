package polymorphism;

public class Overloading1 {
	void show(int a) {
	System.out.println("The value is:"+a);
	
	}
	void show(int a,int b) {
		System.out.println("The value is:"+b);
	}

	public static void main(String[] args) {
		Overloading1 ob=new Overloading1();
		ob.show(10);
		ob.show(10,30);
	}

}
