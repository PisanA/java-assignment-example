import java.util.Scanner;

public class FizzBuzz {
	public static void fizzbuzz(int n) {
		if (n % 15 == 0) {
			System.out.println("FizzBuzz");
		} else if (n % 5 == 0) {
			System.out.println("Buzz");
		} else if (n % 3 == 0) {
			System.out.println("Fizz");
		} else {
			System.out.println(n);
		}
	}
	
	public static void fizzbuzzScanner() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		fizzbuzz(n);
	}
}
