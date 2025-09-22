package wrapperclass;

public class Autoboxing1 {

	public static void main(String[] args) {
		int a=1;
		char b='A';
		float c=20;
		
		Integer aobj=a; 
		Character bobj=b;
		Float cobj=c;
		System.out.println("int a = "+ a + "-> Integer aobj="+aobj);
		System.out.println("char b = "+ b + "-> Character aobj="+bobj);
		System.out.println("float c = "+ c + "-> Float aobj="+cobj);
	}

}
