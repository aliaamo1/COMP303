package comp303.mod1;
import java.util.*;
import java.util.Calendar;

public class Date {
	public enum Size {SMALL, MEDIUM, LARGE};
	
	public static void main(String [] args) {
		Size img1 = Size.SMALL;
		Size img2 = Size.MEDIUM;
		Size img3 = Size.LARGE;
		
		System.out.println(img2.compareTo(img1));
	}

}
