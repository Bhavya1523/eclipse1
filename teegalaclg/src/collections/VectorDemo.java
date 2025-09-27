package collections;
import java.util.Vector;
public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.addElement(20);
		v.addElement(40);
		v.addElement(60);
		v.addElement(80);
		System.out.println("vector elements: "+v );
		v.removeElement(60);
		System.out.println("vector elements: "+v );
		System.out.println(" elements at index 1: "+v.get(1) );
		
		
		

	}

}
