package guessGame;

public class GuessGame {
	
	public void guessGameStarts(){
	System.out.println("	Welcome to a new party of GuessGame! \n	We have 4 news cantidates for this session!\n");
	
	
	Player player1 = new Player("Denis");
	Player player2 = new Player("Albert");
	Player player3 = new Player("Mathilde");
	Player player4 = new Player("Chlo?");
	
	player1.greeting();
	player2.greeting();
	player3.greeting();
	player4.greeting();
	
	System.out.println("   I am now choosing a number between 0 and 10...");
	
	int x = (int) (Math.random()*11);
	
	int numP1 = player1.chooseANumber();
	System.out.println(player1.name + " : I am choosing : " + numP1 + " !") ; 
	
	int numP2 = player2.chooseANumber();
	System.out.println(player2.name + " : I am choosing : " + numP2 + " !") ;
	
	int numP3 = player3.chooseANumber();
	System.out.println(player3.name + " : I am choosing : " + numP3 + " !") ;
	
	int numP4 = player4.chooseANumber();
	System.out.println(player4.name + " : I am choosing : " + numP4 + " !") ;
	
	
	if (numP1 == x || numP2 == x || numP3 == x || numP4 == x) {
		System.out.println("We have a winner!!!! It is ..... ");
		
		int[] num = {player1.number, player2.number, player3.number, player4.number};
		String[] name = {player1.name, player2.name, player3.name, player4.name};
		
		for ( int i : num) {
			if (num[i] == x) {
				System.out.print(" " + name[i] + " ");
			}
			
		}
		
	}else {
		System.out.println("Sorry. We have no winner!");
	}
	}
	
	

}
