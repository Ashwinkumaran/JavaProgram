import java.util.Scanner;

public class ReverseNo {
	public static void main(String[] args) {
		int n, rev = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		n = s.nextInt();
		while (n != 0) {
			rev = rev * 10;
			rev = rev + n % 10;
			n = n / 10;
		}
		System.out.println("Reverse Number is" + rev);

	}

}
