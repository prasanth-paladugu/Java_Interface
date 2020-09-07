//EXAMPLE ON CREATING ANONYMOUS CLASS
interface One										//INTERFACE-1
{
	public abstract void greet();
	public abstract void wish();
}
abstract class Two									//CLASS-1
{
	public abstract void display();
}
public class EX8									//MAIN CLASS
{
	public static void main(String[]arg)
	{
		/*One ob=new One();*/						//NOT VALID CANNOT CREATE CLASS FOR INTERFACE
		One ob=new One()							//==>ONE OB=new EX8$1();IMPLICITLY CONVERTED LIKE THIS EX8$1 IS ANONYMOUS CLASS
		{
			public void greet()
			{
				System.out.println("GREET");
			}
			public void wish()
			{
				System.out.println("WISH");
			}
		};
		/*Two ob1=new Two();*/						//NOT VALID CANNOT CREATE CLASS FOR ABSTRACT CLASS
		Two ob1=new Two()							//==>TWO OB=new EX8$2();IMPLICITLY CONVERTED LIKE THIS EX8$2 IS ANONYMOUS CLASS
		{
			public void display()
			{
				System.out.println("DISPLAY");
			}
		};
		ob.greet();
		ob.wish();
		ob1.display();
	}
}