public class SnakeAndLadder {
	public static final int IS_LADDER = 1;
	public static final int IS_SNAKE = 2;
	public static void main(String[] args)
	{
		int player1Position = 0, player2Position = 0;
		int maxPosition1 = 0, maxPosition2  = 0;
		int count1 = 0, count2 = 0;
		System.out.println("Player1 Initial position is =" +player1Position);
		System.out.println("Player2 Initial Position is =" +player2Position);
		System.out.println("Please Start The Game");
		//Roll The Die To Get A Number From 1 To 6
		while (player1Position < 100 && player2Position <100)
		{
			int diceRoll1 = (int)Math.floor(Math.random() *10) %6+1;

			//Player Option Check
			int position1 = (int)Math.floor(Math.random() *10) %3;
			switch (position1) {
				case IS_LADDER:
					System.out.println("Is Ladder");
					player1Position += diceRoll1;
					if (player1Position > 100)
						player1Position = maxPosition1;
					break;
				case IS_SNAKE:
					System.out.println("Is Snake");
					player1Position -= diceRoll1;
					if (player1Position < 0)
						player1Position = 0;
					break;
				default:
					System.out.println("No Play");
			maxPosition1 = player1Position;
			count1++;
			System.out.println("Player Position After Every Dice Roll :" +player1Position);
			}
			System.out.println("Number Of Times Dice Rolled = " +count1);
			System.out.println("player1 Position is =" +player1Position);
			if (player1Position == 100)
				break;

			int diceRoll2 = (int)Math.floor(Math.random() *10) %6+1;

			//Player Option Check
			int position2 = (int)Math.floor(Math.random() *10) %3;
			switch (position2) {
				case IS_LADDER:
					System.out.println("Is Ladder");
					player2Position += diceRoll2;
					if (player2Position > 100)
						player2Position = maxPosition2;
					break;
				case IS_SNAKE:
					System.out.println("Is Snake");
					player2Position -= diceRoll2;
					if (player2Position < 0)
						player2Position = 0;
					break;
				default:
					System.out.println("No Play");
			maxPosition2 = player2Position;
			count2++;
			System.out.println("Player Position After Every Dice Roll :" +player2Position);
			}
			System.out.println("Number Of Times Dice Rolled = " +count2);
			System.out.println("player2 Position is =" +player2Position);
			if (player2Position == 100)
				break;
		}
		if (player1Position == 100)
			System.out.println("Player-1 Won The Game");
		else
			System.out.println("Player-2 Won The Game");
		
		
	}
}
