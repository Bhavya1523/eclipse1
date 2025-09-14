package loop;
import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		

		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();

		        int originalNum = num;
		        int result = 0;
		        int digits = 0;

		        // count number of digits
		        int temp = num;
		        while (temp != 0) {
		            digits++;
		            temp /= 10;
		        }

		        // calculate sum of powers of digits
		        temp = num;
		        while (temp != 0) {
		            int remainder = temp % 10;
		            result += Math.pow(remainder, digits);
		            temp /= 10;
		        }

		        // check Armstrong condition
		        if (result == originalNum) {
		            System.out.println(originalNum + " is an Armstrong number.");
		        } else {
		            System.out.println(originalNum + " is not an Armstrong number.");
		        }

		        sc.close();
		    }
		}

	


