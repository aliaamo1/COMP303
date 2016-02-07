package comp303.mod1;

import comp303.mod1.Card;
import comp303.mod1.Card.Rank;
import comp303.mod1.Card.Suit;

public class Reflector {
  private static final String CARD_NAME = "module041.Card";
  
  public static void main(String[] args) throws ClassNotFoundException {
	Card card = new Card(Rank.ACE, Suit.CLUBS);
	Class<?> cardClass1 = Class.forName(CARD_NAME);
	Class<?> cardClass2 = Card.class;
	Class<?> ssuper = cardClass1.getSuperclass();
	
	
}
}
