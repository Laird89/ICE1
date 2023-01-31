package exercise1;
import java.util.*;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * 
 * @author Chris Laird Jan 31, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        Card[] cards = new Card[7];
        int cardValue;
        int cardSuit;

        for(int i = 0; i < cards.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            card.setValue(random.nextInt(13) + 1);
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            cards[i] = card;
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        System.out.print("Input a card value from 1-13(1 being ace, 11 being"
                + " jack, 12 being queen and 13 being king: ");
        cardValue = input.nextInt();
        System.out.print("Input a suit value between 1-4 (1 being Hearts, 2"
                + " being Diamonds, 3 being Spades and 4 being clubs): ");
        cardSuit = input.nextInt() - 1;
        
        
        // If the guess is successful, invoke the printInfo() method below.
        for(int i = 0; i < cards.length; i++){
            System.out.println(cards[i].getValue());
        System.out.println(cards[i].getSuit() );
            if(cards[i].getValue() == cardValue && cards[i].getSuit().equals(Card.SUITS[cardSuit]))
                    printInfo();
        }       
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Chris Laird Jan 31, 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Christopher, but you can call me Chris");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be a frontend developer");
        System.out.println("-- Get good grades second sem!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Skateboarding");
        System.out.println("-- Music");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Coding");

        System.out.println();
        
    
    }

}
