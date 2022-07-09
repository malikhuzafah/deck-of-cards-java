import java.util.Scanner;
public class DeckOfCardsTest
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		DeckOfCards myDeckOfCards=new DeckOfCards();
		myDeckOfCards.shuffle();
		System.out.print("Enter number of players(2 or 4): ");
		int numberOfPlayers=input.nextInt();
		Card[][] player=new Card[numberOfPlayers][52/numberOfPlayers];
		for(int i=0;i<(52/numberOfPlayers);i++) {
			for(int j=0;j<numberOfPlayers;j++) {
				player[j][i]=myDeckOfCards.dealCard();
			}
		}
		for (int i=0;i<numberOfPlayers;i++) {
			System.out.printf("Player %d cards:%n",i+1);
			for (int j=0;j<(52/numberOfPlayers);j++) {
				System.out.printf("%s%n",player[i][j]);
			}
			System.out.println();
		}
		/*for (int i=1;i<=52;i++) {
			System.out.printf("%-19s",myDeckOfCards.dealCard());
			if (i%4==0)
				System.out.println();
		}*/
	}
}