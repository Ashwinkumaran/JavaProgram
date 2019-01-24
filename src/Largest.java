import java.util.Scanner;

public class Largest {
	public static void main(String args[]) {
		int x, y, z;
		System.out.println("Enter three integers");
		Scanner s = new Scanner(System.in);

		x = s.nextInt();
		y = s.nextInt();
		z = s.nextInt();

		if (x > y && x > z)
			System.out.println("largest is" + x);
		else if (y > x && y > z)
			System.out.println(" largest is" + y);
		else if (z > x && z > y)
			System.out.println("largest is" + z);
		else
			System.out.println("The numbers are not distinct.");
	}
}
