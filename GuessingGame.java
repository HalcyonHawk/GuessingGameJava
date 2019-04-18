import java.util.Random;

public class GuessingGame{
    //start with 10 guesses and a number from 1-100
    static final int startingGuesses = 10;
    
    private int numberOfGuesses;
    private int correctNumber; 
    private boolean gameWon = false;
    private boolean gameOver = false;
    
    public GuessingGame(){
        this.correctNumber = setCorrectNumber();
        this.numberOfGuesses = startingGuesses;
    }
    
    //sets the number to guess. must be private to stop user seeing number during the game 
    private int setCorrectNumber(){
        //generate number to guess
        Random random = new Random();
        int correctNumber = random.nextInt(100);
        return correctNumber;
    }
    
    public int getRemainingGuesses(){
        return numberOfGuesses;
    }

    public boolean isGameOver(){
        if(getRemainingGuesses() == 0 || isGameWon() == true){
            return gameOver = true;
        } else{
            return gameOver = false;
        } 
    }

    public boolean isGameWon(){
        return gameWon;
    }

    public void makeGuess(int number){
        //check if game is over first
        if(isGameOver() == false){
            //reduce numberOfGuesses by 1
            numberOfGuesses --;
            //print if guess is right, too high or too low
            if(number > correctNumber){
                System.out.println("too high");
            } else if(number < correctNumber){
                System.out.println("too low");
            } else{
                //if correctNumber is gussed then game is won
                System.out.println("Game is won");
                gameWon = true;
            }
        } 
    }

    public void correctNumber(){
        //print correct number only at end of game 
        if(isGameOver() == true){
            System.out.println(correctNumber);
        } 
    }
}
