//EXAMPLE ON DYNAMIC BINDING BY USING FACTORY METHODS
import java.util.Calendar;							//GIVING ADDRESS OF PRE DEFINED CALENDAR CLASS TO JVM
interface TEST										//INTERFACE-1
{
	public abstract void greet();
}
class DEMO implements TEST							//CLASS-1
{
	public void greet()
	{
		System.out.println("GREET");
	}
	public void wish()
	{
		System.out.println("WISH");
	}
}
public class EX7									//MAIN CLASS
{
	public static void main(String[]arg)
	{
		DEMO ob=new DEMO();							//OBJECT CREATION WITH REFERENCE OF SAME CLASS
		ob.greet();
		ob.wish();
		TEST ob1=new DEMO();						//OBJECT CREATION WITH REFERENCE OF INTERFACE
		ob1.greet();
		/*ob1.wish();*/								//INVALID WITH INTERFACE REFERENCE IT IS CLASS METHOD
		Calendar c=Calendar.getInstance();			//FACTORY METHOD OF CREATING<INTIALIZING AND RETURNING OBJECT
		System.out.println(c.getTime());
	}
}