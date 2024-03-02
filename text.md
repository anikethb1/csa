Blackjack Game:

Blackjack is a card game in which the object is to get a hand that is as close as possible to 21 without going over. A player starts with two cards and can request more cards, one at a time. Numeric cards have their numeric value, and face cards have a value of 10. An ace has the value 1 or 11, whichever is more advantageous to the user. For example, a hand with two aces and one five has a value of 11 + 1 + 5 = 17. In this case, the second ace is counted as a value of 1, since if it were counted as 11, the hand value would be 27. A two-card hand with an ace and 10 is always counted as 21 and is called a "blackjack" hand.

The user of the program is the player, and the program acts as the dealer (another "player"). The program begins by dealing two cards each to the player and the dealer. The values of the player's cards are shown. The value of one of the dealer's cards is shown, with the other value hidden until the hand is over. The hidden dealer card is called the "hole" card.

Once the player's hand is dealt, the player inputs the following one-character commands:

Command -- Char -- Description

hit -- h -- take another card
stand -- s -- stand on hand, proceed to dealer play
If the player's hand value goes above 21, the player "busts" and loses the hand. The dealer reveals the hole card, but does not take any further cards. The hand then concludes. If the player does not bust or the player's hand reaches a value of 21, then the dealer plays. This is done by the dealer taking cards until the dealer's hand value is 17 or higher, or the dealer busts. If the dealer's hand has a value of 17 and the hand includes an ace, then the dealer must take one more card. At the conclusion of dealer play, all dealer cards are revealed, including the hole card. If neither the player nor dealer busts, then the winning hand is the one with the higher value. If the hand values are the same, then the hand is a tie, which is called a "push." A two-card blackjack hand beats a hand of value 21 with more than two cards. The dealer's hole card is displayed as 'X'. When the player's hand value reaches 21, the player is not prompted for a command, and the dealer's play commences automatically.

** Enter 'q' to quit, anything else to play another hand: c 
Player's Hand: 35, JC 
Dealer's Hand: 5H, X 
Enter command: h 
Player's Hand: 35, JC, 9H 
Dealer's Hand: 5H, 2D 
<= reveal the hole card 
Player busts. 
** Enter 'q' to quit, anything else to play another hand: c 
Player's Hand: KS, 8D 
Dealer's Hand: 9C, X 
Enter command: s 
Player's Hand: KS, 8D 
Dealer's Hand: 9C, 3H, 10H <= reveal the hole card 
Dealer busts. 
** Enter 'q' to quit, anything else to play another hand: c 
Player's Hand: 2H, 4C 
Dealer's Hand: QH, X 
Enter command: h 
Player's Hand: 2H, 4C, 10C 
Dealer's Hand: QH, X 
Enter command: h 
Player's Hand: 2H, 4C, 10C, 3D 
Dealer's Hand: QH, X 
Enter command: s 
Player's Hand: 2H, 4C, 10C, 3D 
Dealer's Hand: QH, JS <= reveal the hole card 
Dealer wins. 
** Enter 'q' to quit, anything else to play another hand: c 
Player's Hand: AS, QS 
Dealer's Hand: 3C, 8H, 10D <= reveal the hole card 
Player wins. 

Blackjack Game 
** Enter 'q' to quit, anything else to play another hand: c 
Player's Hand: 2C, 2S 
Dealer's Hand: 5D, X 
Enter command: h 
Player's Hand: 2C, 25, 4H 
Dealer's Hand: 5D, X 
Enter command: h 
Player's Hand: 2C, 25, 4H, 4D 
Dealer's Hand: 5D, X 
Enter command: h 
Player's Hand: 2C, 25, 4H, 4D, 45 
Dealer's Hand: 5D, X 
Enter command: s 
Player's Hand: 2C, 25, 4H, 4D, 45 
Dealer's Hand: 5D, 10S, 5S <= reveal the hole card 
Dealer wins. 
** Enter 'q' to quit, anything else to play another hand: q 


