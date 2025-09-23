package exception;
class Sample{
	int a=10,b=0,c=a/b;
	public void cal() {
		System.out.println(c);
	}
}

public class Arithmetic {

	public static void main(String[] args) {
		Sample s=new Sample();
		s.cal();

	}

}
