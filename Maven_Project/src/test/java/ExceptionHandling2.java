import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		System.out.println("program strats from here :");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size ");
		int size=sc.nextInt();
		int empIds[]=new int [size];
		
		try {
			System.out.println("inside try block");
			System.out.println(empIds[3]);
		}
		catch (ArithmeticException e) {
			System.out.println("catch block ");
			System.out.println("Exception object "+e);
			System.out.println("Exception detail ");
			e.printStackTrace();
			System.out.println("with getmsg "+e.getMessage());
		}
		System.out.println("program ends");
	}

}
