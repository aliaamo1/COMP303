package comp303.mod2;

import java.util.Comparator;

public class Card implements Comparable<Card> {
	
	@Override
	public int compareTo(Card pCard)
	{
		return this.getRank().ordinal() - pCard.getRank().ordinal();
	}
	
	public static Comparator<Card> compareByRank(){
		return new
				Comparator<Card>()
				{
			      public int compare(Card c1, Card c2) {
			    	  if(c1.aRank == c2.aRank) {
			    		  return c1.aSuit.ordinal() - c2.aSuit.ordinal();
			    	  }
			    	  return c1.aRank.ordinal() - c2.aRank.ordinal();
			      }
				};
				
	}
	
	public static Comparator<Card> compareBySuit(){
		return new
				Comparator<Card>()
				{
			      public int compare(Card c1, Card c2) {
			    	  if(c1.aSuit == c2.aSuit) {
			    		  return c1.aRank.ordinal() - c2.aRank.ordinal();
			    	  }
			    	  return c1.aSuit.ordinal() - c2.aSuit.ordinal();
			      }
				};
	}
	
	public enum Rank {
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,
		TEN, JACK, QUEEN, KING
	}
	
	public enum Joker {
		JOKERHI, JOKERLO
	}
	
	public enum Suit {
	CLUBS, DIAMONDS, SPADES, HEARTS
	}
	
	
	public static final String [] RANKS = {"Ace", "Two", "Three",
			"Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Jack", "Queen", "King"};

	public static String [] SUITS = {
			"Clubs", "Diamonds", "Spades",
				"Hearts"};
	
	private Rank aRank;
	private Suit aSuit;
	private Joker aJoker;
	/**
	 * @param pRank enum value of Rank
	 * @param pSuit enum value of Suit
	 * @pre pRank !=null && pSuit !=null 
	 */
	
	/** Regular constructor*/
	public Card(Rank rank, Suit suit) {
		assert rank != null && suit !=null : "Cannot have null value card" ;
		aRank = rank;
		aSuit = suit;
	}
	
	/** Copy constructor*/
	public Card(Card oldCard) {
		this.aRank = oldCard.aRank;
  		this.aSuit = oldCard.aSuit;
	}
	
	/**
	 * @param pJoker Value of Joker*/
	public Card(Joker pJoker) {
		aRank = null;
		aSuit = null;
		aJoker = pJoker;
	}
	
	/**
	 * @return The enum RANK value of the card 
	 * @post return!= null 
	 * post condition asserts the precondition
	 */
	public Rank getRank(){
		
		return aRank;
	}
	public Suit getSuit() {
		
		return aSuit;
	}
	
	/**
	 * Assigns a new Rank to the card
	 * @param pRank the new Rank
	 * @pre pRank != null*/
	
	/*public void setRank (Rank pRank) {
		assert pRank != null : "Rank cannot be NULL";
		aRank = pRank;
	} */
	
	/**
	 * Assigns a new suit to the card
	 * @param pSuit the new Suit
	 * @pre pSuit != null 
	 * */
	
/*	public void setSuit (Suit pSuit) {
		assert pSuit != null;
		aSuit = pSuit;
		
		TF, FT, FF (test cases for compound conditions lecture test cases)
	} */
	
	@Override
	public String toString() 
    {
		if (aJoker != null) return aJoker.toString();
		else 
       return aRank + " of " + aSuit;
   }

	
}
