package com.tns.lamda;

public class WithparaDemo {

	public static void main(String[] args) {
		Withpara w =(int a)->{
			System.out.println("the value of a is " +a);
			return a;
		};
		w.show(2);

	}

}
