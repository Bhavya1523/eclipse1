package com.tns.exceptionhandler;

public class Trycatch {

	public static void main(String[] args) {
		int a=10,b=0,c=a/b
;		try {
			System.out.println(c);
		}catch(ArithmeticException e){
			System.out.println("Error: "+e);
		}

	}

}

