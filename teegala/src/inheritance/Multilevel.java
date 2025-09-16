package inheritance;

public class Multilevel {
	int a=20;
	void show1() {
		System.out.println("this is parent class");
		}
}
class B extends Multilevel{
	void show2() {
		System.out.println("Class B extends from class multilevel");
	}
}
class C extends B{
	void show3() {
	System.out.println("Class C entends from Class B");
}
}