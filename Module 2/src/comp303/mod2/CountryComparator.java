package comp303.mod2;
import java.util.*;


public class CountryComparator implements Comparator<Country>{
  public static void main(String[] args) {
		ArrayList<Country> list = new ArrayList<>();
		list.add(new Country("Uruguay", 400));
		list.add(new Country("Egypt",300));
		list.add(new Country("Ethiopia",100));
		
	Comparator<Country> comp = new CountryComparator();
	Collections.sort(list, comp);
	for(Country ctr : list) {
		System.out.println(ctr.getName() + " " + ctr.getArea());
	}
  }
  

  public CountryComparator(){
	  
  }
  @Override
  public int compare(Country c1, Country c2) {
	  Double a1 = c1.getArea();
	  Double a2 = c2.getArea();
	return a1.compareTo(a2);
  }
}
