package comp303.mod1;
import java.util.*;



public class Flock {
	

}
class Sheep {
	private Date aBirth;
	public Object clone()
	{
		try
		{
			Sheep dolly = (Sheep) super.clone();
			dolly.aBirth = new Date();
			return dolly;
			
		}
		catch (CloneNotSupportedException e)
		{
			return null;
		}
	}
}