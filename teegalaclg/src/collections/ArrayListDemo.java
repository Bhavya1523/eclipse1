package collections;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer>arr=new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		System.out.println(arr);
		System.out.println(arr.size());
		arr.remove(1);
		System.out.println(arr);
		
		
		
	}

}
