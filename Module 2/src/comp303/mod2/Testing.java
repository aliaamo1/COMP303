package comp303.mod2;

import java.util.List;

public class Testing  {
	public static void main(String[] args) {
		Deck cards = new Deck();
		cards.shuffle();
		
		Card[] car = new Card[cards.getCards1().size()];
		int i = 0;
		for(Card card: cards) {
			car[i] = card;
			i++;
		}
		System.out.println(car[1]);
		Card[] filtered = filter(car, filterByOddness());
		for(Card c :filtered) {
			System.out.println(c);
		}
		/*List<CardF> deck = cards.getCards1();
		System.out.println(deck.toString());
		cards.sort(CardF.compareByRank());
		System.out.println(cards.getCards1().toString()); */
		
		
	}
	
	public static Card[] filter(Card[] pCards, Filter pFilter) {
		Card[] filteredCards = new Card[pCards.length];
		int i = 0;
		for(Card card: pCards) {
			
			if(pFilter.accept(card)) {
				filteredCards[i] = card;
				i++;
			}
		}
		return filteredCards;
	}
	
	public static Filter filterByOddness() {
		return new Filter() {
			public boolean accept(Card card) {
				return (card.getRank().ordinal()+1) % 2 !=0 ;
			}
		};
	}
    
	public static Filter filterByEvenness() {
		return new Filter() {
			public boolean accept(Card card) {
				return (card.getRank().ordinal()+1) %2 == 0;
			}
		};
	}
	

	

}
