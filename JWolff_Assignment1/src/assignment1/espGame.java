/* 

 * Class: CMSC203  


 * Instructor: Dr. Grinberg

 * Description: It is an esp game that the user will guess the color that the computer will think of and it will track the user corect guesses.

 * Due: 02/05/2024

 * Platform/compiler: Java

 * I pledge that I have completed the programming assignment  

* independently. I have not copied the code from a student or   * any source. I have not given my code to any student. 

 * Print your Name here: John Wolff 

*/ 
package assignment1;

import java.util.Scanner;

public class espGame {

    public static void main(String[] args) {
        final String COLOR_RED = "Red";
        final String COLOR_GREEN = "Green";
        final String COLOR_BLUE = "Blue";
        final String COLOR_ORANGE = "Orange";
        final String COLOR_YELLOW = "Yellow";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Describe yourself: ");
        String description = scanner.nextLine();
        
        System.out.print("Due Date: ");
        String date = scanner.nextLine();
        
        System.out.print("CMSC203 Assignment1: Test your ESP skills!");
        /*System.out.print("\nRound 1");*/
        scanner.nextLine();
        
        
        int correctGuesses = 0;
        for (int round = 1; round <= 11; round++) {
            System.out.println("Round " + round + "\n");

            int generatorNumber = (int) (Math.random() * 5); 

            String color = "";
            switch (generatorNumber) {
                case 0:
                    color = COLOR_RED;
                    break;
                case 1:
                    color = COLOR_GREEN;
                    break;
                case 2:
                    color = COLOR_BLUE;
                    break;
                case 3:
                    color = COLOR_ORANGE;
                    break;
                case 4:
                    color = COLOR_YELLOW;
                    break;
            }
            
            System.out.println("I am thinking of a color.");
            System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
            System.out.print("Enter your guess: ");
            String userGuess = scanner.nextLine();
            
            while (!isValidColor(userGuess)) {
            	System.out.print("You entered an incorrect color. Please enter Red, Green, Blue, Orange, or Yellow: ");
            	userGuess = scanner.nextLine();
            	

            }
            
            System.out.println();
            System.out.println("I was thinking of " + color + ".");
            
            if (userGuess.equalsIgnoreCase(color)) {
            	correctGuesses++;
            }
            
            System.out.println();
            

            
        }
        
        System.out.println("Game Over\n");
        System.out.println("You Guessed " + correctGuesses + " out of 11.\n" );
        System.out.println("Student Name: " + name);
        System.out.println("User Descripition: " + description);
        System.out.println("Due Date: " + date);
        
        scanner.close();
    }
    public static boolean isValidColor(String color) {
    	return color.equalsIgnoreCase("Red") ||
    			color.equalsIgnoreCase("Green")||
    			color.equalsIgnoreCase("Blue")||
    			color.equalsIgnoreCase("Orange")||
    			color.equalsIgnoreCase("Yellow");
    					
    			
    }
}
        

        
        
        

  