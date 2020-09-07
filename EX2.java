//EXAMPLE ON INTERFACE
interface Bike										//INTERFACE
{
	void setColour(String colour);
	public abstract String getColour();
}
class Honda implements Bike							//CLASS IMPLEMENTING INTERFACE
{
	String colour;
	public void setColour(String colour)
	{
		this.colour=colour;
	}
	public String getColour()
	{
		return this.colour;
	}
}
public class EX2									//MAIN CLASS
{
	public static void main(String[]arg)
	{
		Honda Activa=new Honda();
		Activa.setColour("BLACK");
		System.out.println(Activa.getColour());
	}
}