package inheritance;
class Base{
	int a=20;
}
class Derived extends Base{
	int a=30;
	void show() {
		System.out.println(super.a);
	}
}


public class Superclass {
	public static void main(String []args) {
	Derived ob=new Derived();
	ob.show();
}
}
