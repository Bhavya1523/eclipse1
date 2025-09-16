package inheritance;

public class Hirarchiinh {
		void Show1() {
			System.out.println("this is hirarchical inheritance");
		}
	}
	class Student extends Hirarchiinh{
		void show2() {
			System.out.println("iam a student");
		}
	}
	class Faculty extends Hirarchiinh{
		void show3() {
			System.out.println("iam a faculty");
		}
	}
	class principal extends Hirarchiinh{
		void show4() {
			System.out.println("iam a principal");
		}
	}

