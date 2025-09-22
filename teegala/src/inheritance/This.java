package inheritance;
class A{
	int b=10;
	void show() {
		int b=20;
		System.out.println(b);
		System.out.println(this.b);
	}
}

public class This {
	public static void main(String[]args) {
		A a=new A();
		a.show();
		
		
	}

}
