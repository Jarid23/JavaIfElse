/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jarid
 */
import java.util.Scanner;
public class GuessMe {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        //decalre the Answer
        int answer = 7;
        int guess;
        
        System.out.println("Guess a number - it's between 1-10 : ");
        guess = inputReader.nextInt();
        
        if(guess == answer)
        {
            System.out.println("Yeah you guessed correctly! You Win!");
        }
        else if(guess > answer)
        {
            System.out.println("Your guess was too high the answer was : " + answer);
        }
         else if(guess < answer)
        {
            System.out.println("Your guess was too low the answer was : " + answer);
        }
    }
    
}
