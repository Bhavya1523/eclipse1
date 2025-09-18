package polymorphism;

public class Overloading3 {
	void display(int a,float b){
		System.out.println("the integervalue is :"+a +",floatvalue is"+b);
	}
	void display(float a,int b) {
		System.out.println("the floatvalue is:"+a+ ",integervalue is"+b);
	}


public static void main(String[]args) {
	Overloading3 ob=new Overloading3();
	ob.display(10,40f);
	ob.display(30f,20);
	
}
}