/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Yiqing 991557219
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)Math.random()*13+1);
            c.setSuit(Card.SUITS[(int)Math.random()*4]);
            magicHand[i] = c;
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
        Card luckyCard = new Card();
        bool winning = false;
        for (int i=0; i< magicHand.length;i++){
            
            if (luckyCard.suit == magicHand[i].suit && luckyCard.value == magicHand[i].value)
            {   
                winning = true;
            } 
            
        }
        if (winning == ture)
        {
            system.out.println("Wow, your card is in Magic Hand!");
        }
        else{
        system.out.println("Sorry, your card is not in Magic Hand.");
        }
    }
    
}
