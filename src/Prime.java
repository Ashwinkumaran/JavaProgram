import java.util.Scanner;

public class Prime {
	public static void main(String arg[]) {
		int n, m = 0, f = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		n = s.nextInt();
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (int i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					f = 1;
					break;
				}
			}
			if (f == 0) {
				System.out.println(n + " is prime number");
			}
		} 
	}
}
