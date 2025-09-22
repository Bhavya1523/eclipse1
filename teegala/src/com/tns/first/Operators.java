package com.tns.first;

public class Operators {
	
	    public static void main(String[] args) {
	        int a = 10, b = 3;

	        // 1. Arithmetic Operators
	        System.out.println("== Arithmetic Operators ==");
	        System.out.println("a + b = " + (a + b));
	        System.out.println("a - b = " + (a - b));
	        System.out.println("a * b = " + (a * b));
	        System.out.println("a / b = " + (a / b));  // Integer division
	        System.out.println("a % b = " + (a % b));  // Modulus

	        // 2. Unary Operators
	        System.out.println("\n== Unary Operators ==");
	        System.out.println("++a = " + (++a));  // Pre-increment
	        System.out.println("--b = " + (--b));  // Pre-decrement
	        System.out.println("a++ = " + (a++));  // Post-increment
	        System.out.println("b-- = " + (b--));  // Post-decrement
	        System.out.println("After post operations, a = " + a + ", b = " + b);
	        System.out.println("-a = " + (-a));    // Unary minus

	        // 3. Relational (Comparison) Operators
	        System.out.println("\n== Relational Operators ==");
	        System.out.println("a == b: " + (a == b));
	        System.out.println("a != b: " + (a != b));
	        System.out.println("a > b: " + (a > b));
	        System.out.println("a < b: " + (a < b));
	        System.out.println("a >= b: " + (a >= b));
	        System.out.println("a <= b: " + (a <= b));

	        // 4. Logical Operators
	        boolean x = true, y = false;
	        System.out.println("\n== Logical Operators ==");
	        System.out.println("x && y: " + (x && y));
	        System.out.println("x || y: " + (x || y));
	        System.out.println("!x: " + (!x));

	        // 5. Bitwise Operators
	        int p = 5, q = 3;  // 5 = 0101, 3 = 0011
	        System.out.println("\n== Bitwise Operators ==");
	        System.out.println("p & q: " + (p & q)); // AND
	        System.out.println("p | q: " + (p | q)); // OR
	        System.out.println("p ^ q: " + (p ^ q)); // XOR
	        System.out.println("~p: " + (~p));       // NOT
	        System.out.println("p << 1: " + (p << 1)); // Left shift
	        System.out.println("p >> 1: " + (p >> 1)); // Right shift

	        // 6. Assignment Operators
	        int num = 10;
	        System.out.println("\n== Assignment Operators ==");
	        System.out.println("num = " + num);
	        num += 5;  // num = num + 5
	        System.out.println("num += 5: " + num);
	        num -= 3;
	        System.out.println("num -= 3: " + num);
	        num *= 2;
	        System.out.println("num *= 2: " + num);
	        num /= 4;
	        System.out.println("num /= 4: " + num);
	        num %= 3;
	        System.out.println("num %= 3: " + num);

	        // 7. Ternary Operator
	        int max = (a > b) ? a : b;
	        System.out.println("\n== Ternary Operator ==");
	        System.out.println("Max of a and b is: " + max);
	    }
	


}
