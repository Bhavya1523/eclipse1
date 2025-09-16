package inheritance;
//single inheritance
public class Hybridinh {
 void display1() {
	System.out.println("this is parent class"); 
 }	
}
class Child1 extends Hybridinh{
	void display2() {
		System.out.println("this is class B");
	}
}
//multilevel inheritance
class Child2 extends Hybridinh{
	void display3(){
		System.out.println("this is class C");
	}
}
class Child3 extends Child2{
	void display4() {
		System.out.println("this is class D");
	}
}

	


