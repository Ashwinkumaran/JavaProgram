import java.util.Scanner;

public class Factorial {
	public static void main(String arg[]) {
		int n, i, f = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N value");
		n = s.nextInt();
		if (n <= 0) 
			System.out.println("number is non-negative");
		 else {

			for (i = 1; i <= n; i++) 
				f = f * i;
				System.out.println("Factorial of" + n + "is=" + f);
			
		}
	}
}
