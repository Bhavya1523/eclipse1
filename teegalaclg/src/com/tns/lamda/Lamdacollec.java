package com.tns.lamda;
import java.util.ArrayList;

public class Lamdacollec {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
	   l.add(10);
	   l.add(11);
	   l.add(12);
	   l.add(13);
	   l.add(14);
	  
		l.forEach(n->System.out.println(n));
	}

	
}

