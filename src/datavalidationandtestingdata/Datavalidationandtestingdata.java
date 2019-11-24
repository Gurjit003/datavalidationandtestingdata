/*
 * Gurjit Singh
 * Tuesday November 19th - 2019
 * This program displays data validation and testing data
 */

package datavalidationandtestingdata;
import java.util.Scanner;

/**
 *
 * @author gusin5788
 */
public class Datavalidationandtestingdata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String word;
        int value = 0;
        int remainder;
        boolean valid = true;
        
        while (valid) {
            System.out.println("Enter a word that is more than 6 characters long:");
            word = input.nextLine();
            System.out.println("");
            
            try {
                if (word.length() > 6) {
                    System.out.println(word + " is a valid word.\n"
                        + "\n"
                        + "--------------------------------\n"
                        + "");
                valid = false;
                }
                else {
                    throw new wordException("..." + word);  
                }
            }
            catch (wordException nfe) {
                System.out.println("Sorry, this word is not more than 6 characters long.\n"
                    + "");
            }
        }
        
        while (valid == false) {
            System.out.println("Enter a word that contains at least one lowercase 'a':");
            word = input.nextLine();
            System.out.println("");
            
            try {
                if (word.contains("a")) {
                    System.out.println(word + " is a valid word.\n"
                        + "\n"
                        + "--------------------------------\n"
                        + "");
                valid = true;
                }
                else {
                    throw new word2Exception("..." + word);  
                }
            }
            catch (word2Exception nfe) {
                System.out.println("Sorry, this word doesn't contain at least one lowercase 'a'.\n"
                    + "");
            }
        }
        
        while (valid) {
            System.out.println("Enter a word that is between 5 and 15 characters long and does not contain 'z' or 'Z'."
                + "");
            word = input.nextLine();
            System.out.println("");
            
            try {
                if ((word.length() >= 5) && (word.length() <= 15) && (!word.contains("z")) && (!word.contains("Z"))) {
                    System.out.println(word + " is a valid word.\n"
                        + "\n"
                        + "--------------------------------\n"
                        + "");
                valid = false;
                }
                else {
                    throw new word3Exception("..." + word);  
                }
            }
            catch (word3Exception nfe) {
                System.out.println("Sorry, this word is not between 5 and 15 characters long or contains a 'z' or 'Z'.\n"
                    + "");
            }
        }
        
        while (valid == true) {
            System.out.println("Enter an integer between 5 and 500:");
            word = input.nextLine();
            System.out.println("");
            
            try {
                value = Integer.parseInt(word);
                if ((value >= 5) && (value <= 500)) {
                    System.out.println(value + " is a valid integer.\n"
                        + "\n"
                        + "--------------------------------\n"
                        + "");
                valid = false;
                }
                else {
                    System.out.println("Sorry, this integer is not between 5 and 500.\n"
                        + "");
                }
            }
            catch (NumberFormatException nfe) {
                System.out.println("Sorry, this integer is not between 5 and 500.\n"
                    + "");
            }
        }
        
        while (valid == false) {
            System.out.println("Enter a negative integer:");
            word = input.nextLine();
            System.out.println("");
            
            try {
                value = Integer.parseInt(word);
                if (value < 0) {
                    System.out.println(value + " is a valid integer.\n"
                        + "\n"
                        + "--------------------------------\n"
                        + "");
                valid = true;
                }
                else {
                    System.out.println("Sorry, this integer is not negative.\n"
                        + "");
                }
            }
            catch (NumberFormatException nfe) {
                System.out.println("Sorry, this integer is not negative.\n"
                    + "");
            }
        }
        
        while (valid == true) {
            System.out.println("Enter an integer that is positive and odd:");
            word = input.nextLine();
            System.out.println("");
            
            try {
                value = Integer.parseInt(word);
                remainder = value % 2;
                if ((value > 0) && (remainder == 1)) {
                    System.out.println(value + " is a valid integer.\n"
                        + "\n"
                        + "--------------------------------\n"
                        + "");
                valid = false;
                }
                else {
                    System.out.println("Sorry, this integer is not positive and odd.\n"
                        + "");
                }
            }
            catch (NumberFormatException nfe) {
                System.out.println("Sorry, this integer is not positive and odd.\n"
                    + "");
            }
        }
      }

    private static class wordException extends Exception {

        public wordException(String string) {
        }
    }  

    private static class word2Exception extends Exception {

        public word2Exception(String string) {
        }
    }

    private static class word3Exception extends Exception {

        public word3Exception(String string) {
        }
    }
}
