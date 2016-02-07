package comp303.mod2;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
/**
 * What happens if I call pass in a copy of my deck to the foreach loop
 * why does it not get sorted? 
 * */

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
  
  /**
   * @return Iterator<CardF> is returned that iterates
   * over a sorted deck
   * */
 public Iterator<Card> createSortedIterator()
 {
	 ArrayList<Card> foo = new ArrayList<Card>(aCards);
	 Collections.sort(foo);
	 return foo.iterator();
 }
 
 /**
  * @return Iterator<CardF> is returned that iterates
  * over the deck
  * */
 public Iterator<Card> createIterator() 
 {
	 return aCards.iterator();
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
  
  /** Sorting by Rank and Suit 
   * Order of Suits (in ascending): Clubs, Diamonds, Hearts, Spades
   * Order of Rank (in ascending): Ace, Two, Three, ...., King 
   * @return a sorted Deck*/
  
  public void sort(Comparator<Card> comp) {
	  
	  Collections.sort(aCards, comp);
			  
	
	 //Collections.sort(aCards, CardF.compareByRank());
	//Collections.sort(aCards, CardF.compareBySuit());
	 
  } 
  
  /**using Comparable interface to make Deck sortable */
  public void sortable() {
	  Collections.sort(aCards);
  }
  public static void main(String[] args) {
	Deck cards = new Deck();
	cards.shuffle();
	List<Card> deck = cards.getCards1();
	System.out.println(deck.toString());
	for(Card aCard : cards) {
		System.out.println(aCard);
	}
	
	System.out.println(deck);
	
  }
	
/*	Iterator<CardF> iterator = cards.createIterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
	
	*/


@Override
public Iterator<Card> iterator() {
	ArrayList<Card> cards = new ArrayList<Card>(aCards);
	Collections.sort(cards, Card.compareByRank());
	
	return cards.iterator();
}  

}