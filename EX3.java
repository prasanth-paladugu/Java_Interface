//EXA  MPLE ON INTERFACE BY MULTIPLE CLASSES
interface Shape											//INTERFACE
{
	public static final double PI=3.14;
	void area();
	public abstract void volume();
}
class Triangle implements Shape							//CLASS IMPLEMENTING INTERFACE
{
	double b,h,area;
	public Triangle(double b,double h)					//PARAMETERIZED CONSTRUCTER
	{
		this.b=b;
		this.h=h;
	}
	public void area()
	{
		area=0.5*b*b;
		System.out.println("AREA :"+area);
	}
	public void volume()								//EMPTY METHOD FOR IMPLIMENTING EVERY METHOD OF INTERFACE BUT NOT UTILISING
	{
	}
}
class Cube implements Shape								//CLASS IMPLEMENTING INTERFACE
{
	double b,volume,area;
	public Cube(double b)								//PARAMETERIZED CONSTRUCTER
	{
		this.b=b;
	}
	public void area()
	{
		area=6*Math.pow(b,2);
		System.out.println("AREA :"+area);
	}
	public void volume()
	{
		volume=Math.pow(b,3);
		System.out.println("VOLUME :"+volume);
	}
}
class Circle implements Shape							//CLASS IMPLEMENTING INTERFACE
{
	double r,area;
	public Circle(double r)								//PARAMETERIZED CONSTRUCTER
	{
		this.r=r;
	}
	public void area()
	{
		area=PI*r*r;
		System.out.println("AREA :"+area);
	}
	public void volume()								//EMPTY METHOD
	{
	}
}

public class EX3										//MAIN CLASS
{
	public static void main(String[]arg)
	{
		Triangle t=new Triangle(4,3);
		t.area();
		Cube c=new Cube(5);
		c.area();
		c.volume();
		Circle o=new Circle(2);
		o.area();
	}
}