package comp303.mod3;

public class FlyweightString {
	public static void main(String[] args) {
		String string1 = "A test";
		String string2 = "A test";
		
		String author = "Naguib Mahfouz";
		String author2 = "Naguib Mahfouz";
		
		System.out.println("author: " + ( author == author2));
		
		System.out.println(string1 == string2);
	}

}
