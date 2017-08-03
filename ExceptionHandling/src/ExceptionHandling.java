import java.util.*;
class ExceptionHandling {

	public static void main(String[] args) {
	
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		try {
		System.out.println("Enetr a first number");
		a=scan.nextInt();
		System.out.println("Enetr a Sceond number");
		b=scan.nextInt();
		c=a/b;
		System.out.println("Output is = "+c);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		/*catch(ArithmeticException e)
		{
			e.printStackTrace();
		}*/
		finally {
			scan.close();
		}
		
		
	}

}
