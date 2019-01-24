import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		int x;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the x value");
		x = s.nextInt();
		if (x % 2 == 0) {
			System.out.println("Given number is odd" + x);
		} else {
			System.out.println("Given number is Even" + x);
		}

	}
}
