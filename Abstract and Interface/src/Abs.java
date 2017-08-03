interface abc
{
	void a();
	void b();
	void c();
	void d();
}
abstract class xyz implements abc
{
	public void c()
	{
		System.out.println("Declare in Abstract class");
	}
}
class lmn extends xyz
{
public void a() {System.out.println("Declare in derived class");}
public void b() {System.out.println("Declare in derived class");}
public void d() {System.out.println("Declare in derived class");}
}
public class Abs {

	public static void main(String[] args) {
	lmn lm=new lmn();
	lm.a();
	lm.b();
	lm.c();
	lm.d();

	}

}
