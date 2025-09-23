package com.tns.exceptionhandler;

public class Nestedtry{
	public static void main(String[]args) {
try {
    // Initializing array
    int a[] = { 1, 2, 3, 4, 5 };

    // Trying to print element at index 5
    System.out.println(a[5]); 

    // Inner try block (try-block2)
    try {
        // Performing division by zero
        int x = a[2] / 0; // This will throw ArithmeticException
    } catch (ArithmeticException e2) {
        System.out.println("Division by zero is not possible");
    }
} catch (ArrayIndexOutOfBoundsException e1) {
    System.out.println("ArrayIndexOutOfBoundsException");
    System.out.println("Element at such index does not exist");
}
}
}