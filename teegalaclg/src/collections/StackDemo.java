package collections;
import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(30);
		s.push(60);
		s.push(90);
		System.out.println("Stack Elements: "+s);
		s.pop();
		System.out.println("Stack Elements: "+s);
		System.out.println("Stack peek Element "+s.peek());
		
		
		

	}

}