package guessGame;

public class Player {
	
	public String name;
	public int number;
	
	Player(String name) {
		this.name = name;
	}
	
	public void greeting() {
		String[] greetings = { "Hello.", "Hi!", "Nice to be here.", "What's up guys?", "Guten Tag.", "Salut!"};
		String hi = greetings[(int) (Math.random()*6)];
		
		System.out.println(name + " : " + hi);
    }
	
	public int chooseANumber() {
		int y = (int) (Math.random()*11);
		number = y;
		return y;
	}
	
	
}
