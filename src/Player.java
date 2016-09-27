import java.util.*;


public class Player {
	private int money;
	private List<Card> hand;
	private int typeofhand;
	private char highcard;
	
	
	public Player(){
		this.money= 1000;		
	}
	public Player(int value){
		this.money = value;
	}
	public char gethighcard(){
		return this.highcard;
	}
	
	public int gettypeofhand(){
		return this.typeofhand;
	}
	public int getmoney(){
		return this.money;		
	}
	public boolean addcard(Card e){
		if(hand.size()>=5) return false;
		hand.add(e);
		return true;
	}
	
	private void decide_Hand(){
		//decide_hand 
		//is a simulation of a decision making process
		//to simulate the player thinking of his hand
		//this function will set the private Player variables
		//into the designated hands that he get 
		//the number that he gotten is based on the numbering system
		//that was used in the video 	
		if(checkforflush() && checkforstraight()) this.typeofhand=8;
		
		
	}
	
	private boolean checkforflush(){
		char previouscard;
		previouscard = hand.get(0).gettype();
		for(Card c:hand){
			if(c.gettype() != previouscard) return false;
		}
		return true;
	}
	private boolean checkforstraight(){
		int previouscard;
		previouscard = hand.get(0).getvalue();
		previouscard--;
		for(Card c:hand){
			if(c.getvalue() == previouscard+1){
				previouscard++;
			}
			else return false;
		}
		return true;
	}
	private boolean check_fourofakind(Card starting_card){
		//def: offcard is the card that is not like the others
		int result=0;
		for(Card c:hand){
			if(c.getvalue() == hand.get(0).getvalue()) result++;			
		}
		if (result == 4) return true; //check if the first and any of the rest of cards are the same type
		if(result>1 && result<4){ //if there is somewhere between ]1-4[ that are equal then there is no 4 of a kind
			return false;
		}
		if (result ==1){	//this deals with the possibility if the first card is the off-card
			result=0;
			for(Card c:hand){
				if(c.getvalue() == hand.get(1).getvalue()) result++;			
			}
			if(result ==4) return true;
		}
		return false;
	}
	
	
	
	
}
