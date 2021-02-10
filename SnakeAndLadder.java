public class SnakeAndLadder {
	public static void main(String[] args)
	{
		int player1Position = 0;
		System.out.println("Please Start The Game");
		int diceRoll = (int)Math.floor(Math.random() *10) %6+1;
		player1Position += diceRoll;
		System.out.println("Player1 Position =" +player1Position);
		
	}
}
