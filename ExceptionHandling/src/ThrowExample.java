import java.util.Scanner;

public class ThrowExample {
	private static Scanner sc;

	public static void addStudent(int rollno)
	{
		if(rollno>100)
		{
			throw new ArithmeticException("Invalid Rollno");
		}
		else
		{
			System.out.println("Rollno is Valid");
		}
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter a rollno");
		int Rollno=sc.nextInt();
		addStudent(Rollno);	
	}

}
