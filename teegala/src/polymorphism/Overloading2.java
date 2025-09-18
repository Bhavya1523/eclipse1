package polymorphism;

public class Overloading2 {
	void show(int a) {
	System.out.println("The value is:"+a );
	
	}
	void show(char a) {
		System.out.println("The character is:"+a );
	}

	public static void main(String[] args) {
		Overloading2 ob=new Overloading2();
		ob.show(10);
		ob.show('A');
	}

}

