//EXAMPLE ON INTERFACE
interface Test										//INTERFACE
{
	public abstract void m1();
}
class Sample implements Test						//CLASS IMPLEMENTING INTERFACE
{
	public void m1()
	{
		System.out.println("M1");
	}
}
public class EX1									//MAIN CLASS
{
	public static void main(String[]arg)
	{
		Sample ob=new Sample();
		ob.m1();
	}
}