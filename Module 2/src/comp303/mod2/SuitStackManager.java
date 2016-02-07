package comp303.mod2;
import java.util.*;

public class SuitStackManager {
	public enum SuitStackIndex {
		FIRST, SECOND, THIRD, FOURTH
	}
	

	private ArrayList<Stack<Card>> suitStacks = new ArrayList<Stack<Card>>();
  
	public SuitStackManager(){}
	
	public void initialize() {
		suitStacks.add(new Stack<Card>());
		suitStacks.add(new Stack<Card>());
		suitStacks.add(new Stack<Card>());
		suitStacks.add(new Stack<Card>());
	}

	/**
	 * @param pCard card that is added to identified stack
	 * @param suitStackIndex index of suitSuit of interest
	 * @post suit stack identified by suitStackIndex has pCard added to it
	 * */
	public void push(Card pCard, SuitStackIndex index) {
		suitStacks.get(index.ordinal()).push(pCard);
	}
	
	/**
	 * @return top card from identified stack is returned
	 * */
	public Card pop(SuitStackIndex index) {
		return suitStacks.get(index.ordinal()).pop();		
	}
	
	public boolean isEmpty(SuitStackIndex index) {
		return suitStacks.get(index.ordinal()).isEmpty();
		
	}
	
	public Card peek(int suitStackIndex) {
		Stack<Card> suitSt = suitStacks.get(suitStackIndex);
		Iterator<Card> iterator = suitSt.iterator();
		return iterator.next();
		
	}
}
