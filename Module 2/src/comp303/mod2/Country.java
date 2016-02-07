package comp303.mod2;
import java.util.*;


public class Country implements Comparable<Country>{

	private String name;
	private double area;
	/** Constructs a Country
	 * @param aName the name of the country
	 * @param anArea the area of the country*/
	
	public Country (String aName, double anArea)
	{
	  name = aName;
	  area = anArea;
	}
	
	/**
	 * Gets the name of the country
	 * @return the name */
	public String getName() 
	{
	 return name; 	
	}
	
	/**
	 * Gets the area of the country
	 * @return the area*/
	public double getArea()
	{
		return area;
	}
	
	/**Compares the countries by area
	 * @param other the other country
	 * @return a negative number if this country has a smaller area
	 * than other country, 0 if the areas are equal,
	 * a positive number otherwise*/
	
	@Override
	public int compareTo(Country other) {
		if(this.area < other.area) {return -1;}
		else if(this.area > other.area) {return 1;}
		return 0;
	}
	
public static void main(String[] args) {
	ArrayList<Country> list = new ArrayList<>();
	list.add(new Country("Uruguay", 400));
	list.add(new Country("Egypt",300));
	list.add(new Country("Ethiopia",100));
	
	Collections.sort(list);
	for(Country country : list) {
		System.out.println(country.getName() + " " + country.getArea());
	}
	
}
}
