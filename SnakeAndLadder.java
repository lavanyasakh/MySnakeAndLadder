public class SnakeAndLadder {
	public static final int IS_LADDER = 1;
	public static final int IS_SNAKE = 2;
	public static void main(String[] args)
	{
		int player1Position = 0;
		int maxPosition = 0;
		System.out.println("Player Initial position is =" +player1Position);
		System.out.println("Please Start The Game");
		//Roll The Die To Get A Number From 1 To 6
		while (player1Position != 100)
		{
			int diceRoll = (int)Math.floor(Math.random() *10) %6+1;

			//Player Option Check
			int position = (int)Math.floor(Math.random() *10) %3;
			switch (position) {
				case IS_LADDER:
					System.out.println("Is Ladder");
					player1Position += diceRoll;
					break;
				case IS_SNAKE:
					System.out.println("Is Snake");
					player1Position -= diceRoll;
					if (player1Position < 0)
						player1Position = 0;
							break;
				default:
					System.out.println("No Play");
					player1Position = player1Position;
			maxPosition = player1Position;
			}
			System.out.println("player Position is =" +player1Position);
		}
		
		
	}
}
