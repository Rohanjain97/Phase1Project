package simlilearn;

public class AccessModifier1 {


	
	public int a ;
	
	public static void main(String[]args)
	{}
	
	protected void fun()
	{
		System.out.println("protected access modifier");
	}
	
	void golu()
	{
		System.out.println("package access modifier");
	}
	
	private void hide()
	{
		System.out.println("Private access Modifier");
	
	}
}
class Good
{
	void demo()
	{
		AccessModifier1 b=new AccessModifier1();
		b.a=20;
		System.out.println(b.a);
		b.fun();
		b.golu();
	}
	}
	