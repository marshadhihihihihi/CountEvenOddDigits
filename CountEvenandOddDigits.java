import java.util.Scanner;
public class CountEvenandOddDigits {
	
	//method to count even numbers in a single digit
	public static int countEvenNumbers(int number) {

		if (number < 0) {

			number = Math.abs(number); // handles negative input

		}

		int evenNumberCount = 0;

		while (number != 0) {

			int lastDigit = number % 10; //extarct last digit
			
			if (lastDigit == 0) { //if lastDigit == 0 ignore that iteration 

				continue;
			}

			if (lastDigit % 2 == 0) {

				evenNumberCount++; //if lastdigit % 2 == 0 so its even 

			}

			number /= 10; // remove the lastdigit

		}

 
		return evenNumberCount; // return final output 

	}
	
	//method to count odd numbers in a single digit
	public static int countOddNumbers(int number) {

		if (number < 0) {

			number = Math.abs(number); //handle negative input

		}

		int oddNumberCount = 0;

		while (number != 0) {

			int lastDigit = number % 10; //extract the last digit
			
			if (lastDigit == 0) { //if last igit is == 0 ignore that iteration 

				continue;
			}

			if (lastDigit % 2 == 1) {

				oddNumberCount++; // if last digit find as a odd oddNumberCount increment by 1;

			}

			number /= 10;

		}


		return oddNumberCount; //final value

	}

public static void main (String...args) {

	Scanner sc = new Scanner (System.in) ;

	System.out.print ("\nEnter a number : ");
	int input = sc.nextInt ();
	System.out.println ();
	
	System.out.println ("Even numbers in "+input+" is : "+countEvenNumbers(input));
	System.out.println ("Odd numbers in "+input+" is : "+countOddNumbers(input));

 }
}

