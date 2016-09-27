import java.util.*;


public class Table {
	private List<Player> Players;
	
	public Table(){
		Players = new ArrayList<Player>();
	}
	
	
	public void addtotable(Player player){
		if(this.Players.contains(player)) System.out.println("this players is already on this table");
		else this.Players.add(player);
	}
	public void removefromtable(Player player){
		if(!(this.Players.contains(player))) System.out.println("this players is not on this table");
		else this.Players.remove(player);
	}
	public void givecards(){
		//has to randomise a card and give it to the first player
		//once first player get his first card table gives to the second player
		//if their is a second player and keeps going around the table
		//until everyone gets all cards
		
		
		
		
	}
	
	
	 // i love zaydun
	public void Decide_Winner(){
		//decide Winner sets who is the winner of the table
		//it will take the remainning players that are playing in this turn
		//and will check each one type of hand that he has
		//if we have the same type of hand 
		//then the holder of the highcard wins
		//if we have the same high card then the money is split in two and given
		//to the N players
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table table = new Table();
		
		
		
		
	}
	
	
	
	
}
