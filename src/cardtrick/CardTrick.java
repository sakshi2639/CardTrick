package cardtrick;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Sakshi Patel
 * 09/02/2023
 */
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        Card[] magicHand = new Card[7];
        for (int i = 0; i < magicHand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = card;
            System.out.println(card); // comment this line 
        }

        System.out.println("Welcome to the Card Trick Game !");
        System.out.print("Enter a suit - (\"Heart\", \"Diamond\", \"Spade\", \"Club\"): ");
        String suit = scanner.nextLine();
        System.out.print("Enter a value - [1 - 13]: ");
        int val = scanner.nextInt();

        Card userCard = new Card(val, suit);
        for (Card magicHand1 : magicHand) {
            if (userCard.getValue() == magicHand1.getValue() && userCard.getSuit().equalsIgnoreCase(magicHand1.getSuit())) {
                System.out.println("You Win! Your card was found in the magic hand.");
                return;
            }
        }
        System.out.println("You Loose! Card not found.");   
    }

}
