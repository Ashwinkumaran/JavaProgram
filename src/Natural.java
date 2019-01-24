import java.util.Scanner;

public class Natural {
   public static void main(String[] args)
   {
	   int n,sum = 0;
	   Scanner s= new Scanner(System.in);
	   System.out.println("Enter the N value");
	   n=s.nextInt();
	   for(int i=1;i<=n;i++)
	   {
		   sum=sum+i;
		   
	   }
	   System.out.println("Sum Of The Given Natural Nuber is" +sum);
   }
}
