package comp303.mod1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import comp303.mod1.*;

public class Deck implements Iterable<Card> {
  private final Stack<Card> aCards = new Stack<>();
  
  public Deck() {}
  
  public List<Card> getCards()
  {
	  return Collections.unmodifiableList(aCards);
  }
  
  //Now any changes to the contents of the list are not visible to the client
  public List<Card> getCards1(){
	  ArrayList<Card> nDeck = new ArrayList<>();
	  
	  for(Card card : aCards) {
		  nDeck.add(new Card(card)); //using copy constructor
	  }
	  
	  //nDeck.addAll(0, aCards);
	  return Collections.unmodifiableList(nDeck);
  }
  
  public Deck(Deck pDeck) {
	  for( Card card : pDeck.aCards) {
		  aCards.add(new Card(card));
	  }
  }
  
  public void shuffle() 
  {
	  aCards.clear();
	  for( Card.Suit suit : Card.Suit.values()) 
	  {
		  for( Card.Rank rank : Card.Rank.values()) 
		  {
			  aCards.push(new Card(rank,suit));
		  }
	  }
	  Collections.shuffle(aCards);
  }
  
  public boolean isEmpty() {
	  return aCards.isEmpty();
  }
  
  public Card draw() {
	  return aCards.pop();
  }

@Override
public Iterator<Card> iterator() {
	
	return aCards.iterator();
}
}
