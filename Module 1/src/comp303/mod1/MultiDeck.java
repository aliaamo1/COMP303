package comp303.mod1;
import java.util.*;

import comp303.mod1.*;


/*
 * Must make the class copyable through a copy constructor
 * A copy constructor is an alternative to the clone method of copying objects
 * A copy constructor is required for mutable objects
 * */

public class MultiDeck implements Iterable<Card>{
	
	/**@param decks List of decks */
	private List<Deck> decks = new ArrayList<Deck>();
	private List<Card> allCards = new ArrayList<Card>();

	
	/* Regular constructor*/
	public MultiDeck() {
		
	}
	
	/* Shallow copy constructor */
	public MultiDeck(MultiDeck oldDecks) {
		this.decks = oldDecks.decks;
	}
	
	public void addDeck(Deck aDeck) {
		decks.add(aDeck);
		for(Deck pDeck : decks) {
			for(Card card : pDeck) {
				allCards.add(card);
			}
			
		}
	}
	
	
	/* Deep copy */
	public List<Deck> getDecks() {
		 ArrayList<Deck> deckCopies = new ArrayList<>();
		 for(Deck aDeck : decks) {
			 deckCopies.add(new Deck(aDeck));
		 }
		return Collections.unmodifiableList(deckCopies);
	}
	
	/* Shallow copy*/
	public List<Deck> getDecksModi() {
		return Collections.unmodifiableList(decks);
	}
/**
 * @return Returns an card Iterator to iterate
 * over the master list of all cards in the all of the decks
 * */
	@Override
	public Iterator<Card> iterator() {
		
		return allCards.iterator();
	}

	public static void main(String[] args) {
		Deck one = new Deck();
		one.shuffle();
		MultiDeck decka = new MultiDeck();
		decka.addDeck(one);
		
		for(Card aCard : decka.allCards) {
			System.out.println(aCard.toString());
		}
		
		
		
	}
	
	
	

}
