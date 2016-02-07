package comp303.mod2;
import java.util.*;


import comp303.mod2.Country;

/**
 * Anonymous classes are useful when we need a class only once for technical reasons
 * We make a class anonymous by defining it inside a method
 * and using it to make a single object
 * 
 * 
 * */
public class AnonymousClassTesting 
{
	public static void main(String[] args) 
	{
		/** creating an anonymous class, which is an inner class = a class
		 * that is defined inside another class */
		Comparator<Country> comp = new 
				Comparator<Country>() 
		        {
			      public int compare(Country c1, Country c2) 
			      {
				    return c1.getName().compareTo(c2.getName());
			     }
		        };
		ArrayList<Country> list = new ArrayList<>();
		list.add(new Country("Uruguay", 400));
		list.add(new Country("Egypt",300));
		list.add(new Country("Ethiopia",100));
		
		Collections.sort(list, comp);
		for(Country con : list) {
			System.out.println(con.getName() );
		}
	}

}
