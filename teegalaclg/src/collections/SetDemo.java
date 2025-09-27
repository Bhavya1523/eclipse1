package collections;
import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		HashSet <String>hs=new HashSet<String>();
		hs.add("ammu");
		hs.add("minnu");
		hs.add("chinnu");
		System.out.println(hs);
		hs.remove("ammu");
		System.out.println(hs);
		System.out.println("contains chinnu : "+hs.contains("chinnu"));
		
		
		
		
		

	}

}
