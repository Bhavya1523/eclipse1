package collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String>ll=new LinkedList<String>();
		ll.add("Apple");
		ll.add("Banana");
		ll.add("Mango");
		ll.add("Grapes");
		System.out.println("fruits in linkedlist : "+ll);
		ll.addFirst("Orange");
		ll.addLast("Pineapple");
		System.out.println("fruits in linkedlist : "+ll);

		System.out.println("fruit in linkedlist at first : "+ll.getFirst());
		System.out.println("fruit in linkedlist at last : "+ll.getLast());
		ll.removeFirst();
		ll.removeLast();
		System.out.println("finall fruits in linkedlist: "+ll);
		}

}
