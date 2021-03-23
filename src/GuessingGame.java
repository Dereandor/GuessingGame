import javax.swing.*;

public class GuessingGame {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random()* 100 + 1);
        int userAnswer = 0;
        System.out.println("The correct guess would be: " + computerNumber);
        int count = 1;
        
        while (userAnswer != computerNumber) {
            String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100", "Guessing Game", 3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, determineGuess(userAnswer, computerNumber, count));
            count++;
        }
    }
    
    public static String determineGuess(int guess, int answer, int count) {
        if (guess <= 0 || guess > 100) {
            return "your guess is invalid";
        } else if (guess == answer) {
            return "Correct answer! total guesses: " + count;
        } else if (guess > answer) {
            return "Answer too high, try again. Try number: " + count;
        } else if (guess < answer) {
            return "Answer too low, try again. Try number: " + count;
        } else {
            return "Wrong answer, try again. Try number: " + count;
        }
    }
}
