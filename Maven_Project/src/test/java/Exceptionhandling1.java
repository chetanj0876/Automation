import java.util.Scanner;

public class Exceptionhandling1 {

	public static void main(String[] args) {
		System.out.println("program starts from here...");
		int i,j,k;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no 1: ");
		i=scn.nextInt();
		System.out.println("Enter no 2: ");
		j=scn.nextInt();
		
		try {
			System.out.println("Your inside try block ");
			k=i/j;
			System.out.println("res "+k);
		}
		catch (ArithmeticException obj) {
			System.out.println("You are inside catch");
			//System.out.println("Exception handled, exception msg"+obj.getMessage());
			//System.out.println("Exception handled, exception name and msg "+obj);
			obj.printStackTrace();
			System.out.println("exception handeled");
		}
		System.out.println("program ends");
	}

}
