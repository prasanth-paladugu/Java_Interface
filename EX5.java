//EXAMPLE ON IMPLEMENTING MULTIPLE INHERITANCE USING INTERFACE
interface One										//INTERFACE-1
{
	public abstract void m1();
}
interface Two										//INTERFACE-2
{
	public abstract void m2();
}
interface Three extends One,Two						//INTERFACE-3 EXTENDS FROM INTERFACE-1,INTERFACE-2 MULTIPLE INHERITANCE
{
	public abstract void m3();
}
class Test implements Three							//CLASS IMPLEMENTING INTERFACE-3
{
	public void m1()
	{
		System.out.println("M1");
	}
	public void m2()
	{
		System.out.println("M2");
	}
	public void m3()
	{
		System.out.println("M3");
	}
}
public class EX5									//MAIN CLASS
{
	public static void main(String[]arg)
	{
		Test ob=new Test();
		ob.m1();
		ob.m2();
		ob.m3();
	}
}