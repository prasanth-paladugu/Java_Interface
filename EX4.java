//EXAMPLE ON IMPLEMENTING MULTIPLE INTERFACE IN SAME CLASS
interface One										//INTERFACE-1
{
	public abstract void m1();
}
interface Two										//INTERFACE-2
{
	public abstract void m2();
}

class Test implements One,Two						//CLASS IMPLEMENTING INTERFACE-1,INTERFACE-2
{
	public void m1()
	{
		System.out.println("M1");
	}
	public void m2()
	{
		System.out.println("M2");
	}
}
public class EX4									//MAIN CLASS
{
	public static void main(String[]arg)
	{
		Test ob=new Test();
		ob.m1();
		ob.m2();
	}
}