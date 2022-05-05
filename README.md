The version of the game you implement must have the following properties.
The computer will randomly generate the secret code.
The player will try to guess the secret code.
The player has a maximum number of attempts to guess the code correctly. If the player
runs out of guesses, they lose the game.
The secret code consists of some number of colored pegs in a specific order.
Capital letters will be used to indicate colors: B for blue, R for red, and so forth.
The maximum number of guesses, the number of pegs in the secret code, and the available
peg colors should be changeable by passing different instances of the provided
GameConfiguration class into the start method of Driver .
The results of a guess are displayed with black and white pegs. The Wikipedia article refers to
the results as feedback.
A peg in the guess will generate feedback of either: 1 black peg, 1 white peg, or no pegs. A
single peg in the guess cannot generate more than 1 feedback peg.
The order of the feedback does not give any information about which pegs in the guess
generated which feedback pegs. In your feedback, you must give the number of black pegs
(if any) first, and then the number of white ones, if any. 
The player's guesses must be error checked to ensure that they are of the correct length and
only contain valid characters. The output of the game should be a simple text-based display
on the console. See the Sample User Dialogue below.
