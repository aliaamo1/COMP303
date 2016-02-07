package comp303.mod2;
import java.util.*;

public class CountryAnonymousClasses {
	private double area;
	private String name;
	
	public String getName() {
		return name;
	}
	
	public double getArea() {
		return area;
	}
	
	public CountryAnonymousClasses(String aName, double anArea) {
		area = anArea;
		name = aName;	
	}
	
	public static Comparator<Country> comparatorByName() {
		return new
				Comparator<Country>()
				{
			      public int compare(Country c1, Country c2) {
			    	  return c1.getName().compareTo(c2.getName());
			      }
				};
	}
	
	public static Comparator<Country> comparatorByArea() {
		return new
				Comparator<Country>()
		       {
			    public int compare(Country c1, Country c2)
			    {
			    	Double d1 = c1.getArea();
			    	Double d2 = c2.getArea();
			    	return d1.compareTo(d2);
			    }
		       
	           };
	}
	
    public static void main(String[] args) {
    	ArrayList<Country> list = new ArrayList<>();
    	list.add(new Country("Uruguay", 400));
    	list.add(new Country("Egypt",300));
    	list.add(new Country("Ethiopia",100));
    	
    	Collections.sort(list, CountryAnonymousClasses.comparatorByName());
    	for(Country ctr : list) {
    		System.out.println(ctr.getName());
    	}
    	
    	Collections.sort(list, CountryAnonymousClasses.comparatorByArea());
    	for(Country ctr : list) {
    		System.out.println(ctr.getArea());
    	}
  }
}
