package loop;
import java.util.Scanner;

public class Palindrome{
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();

		        int originalNum = num;
		        int reversedNum = 0;

		        // reverse the number
		        while (num != 0) {
		            int digit = num % 10;
		            reversedNum = reversedNum * 10 + digit;
		            num /= 10;
		        }

		        // check palindrome
		        if (originalNum == reversedNum) {
		            System.out.println(originalNum + " is a Palindrome number.");
		        } else {
		            System.out.println(originalNum + " is not a Palindrome number.");
		        }

		        sc.close();
		    }
		}


