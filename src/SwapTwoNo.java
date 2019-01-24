import java.util.Scanner;

public class SwapTwoNo {
	public static void main(String[] args) {
		int x, y;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the x value");
		x = s.nextInt();
		System.out.println("Enter the y value");
		y = s.nextInt();
		System.out.println("Before Swapping\nx = " + x + "\ny = " + y);

		x = x + y;  // temp = x;
		y = x - y; // x = y;
		x = x - y ;// y = temp;
		System.out.println("After Swapping\nx = " + x + "\ny = " + y);

	}

}
