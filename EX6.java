//EXAMPLE ON CLASS IMPLEMENTING INHERITANCE AND INTERFACE
interface One										//INTERFACE-1
{
	public abstract void showData();
}
class Two											//CLASS-1
{
	int x;
	public void setX(int a)
	{
		x=a;
	}
}
class Test extends Two implements One				//CLASS IMPLEMENTING INTERFACE-1 AMD EXTENDING CLASS-1
{
	int y;
	public void setY(int a)
	{
		y=a;
	}
	public void showData()							//OVERRIDING INTERFACE METHOD
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(x+y);
	}
}
public class EX6									//MAIN CLASS
{
	public static void main(String[]arg)
	{
		Test ob=new Test();
		ob.setX(101);
		ob.setY(202);
		ob.showData();
	}
}