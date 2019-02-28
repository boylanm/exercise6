package com.boylan.csci;
import java.util.*;

/*Made bv Michael Boylan*/

class UserInput{
    Scanner scanner = new Scanner(System.in);
    public String promptString(String message){

        System.out.println(message);
        String userInput = scanner.nextLine();
        String stringPrompt = "";
        boolean isString = false;
        while (!isString) {
            try{
                stringPrompt = userInput;
                isString = true;
            }
            catch (Exception e){
                System.out.println(userInput+" is not a valid string. "+ message);
                userInput = scanner.nextLine();
            }
        }
        return stringPrompt;
    }

    public int promptInt(String message){
        System.out.println(message);
        String userInput = scanner.nextLine();

        int intPrompt = 0;
        boolean isInt = false;
        while(!isInt){
            try{
                intPrompt = Integer.parseInt(userInput);
                isInt = true;
            }
            catch(NumberFormatException e){
                System.out.println(userInput+" is not a valid integer. "+ message);
                userInput = scanner.nextLine();
            }
        }

        return intPrompt;
    }

    public double promptDouble(String message){
        System.out.println(message);
        String userInput = scanner.nextLine();

        double doublePrompt = 0;
        boolean isDouble = false;
        while(!isDouble){
            try{
                doublePrompt = Double.parseDouble(userInput);
                isDouble = true;
            }
            catch(NumberFormatException e){
                System.out.println(userInput+" is not a valid double. "+ message);
                userInput = scanner.nextLine();
            }
        }
        return doublePrompt;
    }
}
public class Main {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        String word1 = input.promptString("Enter a string: ");
        int int1 = input.promptInt("Enter an integer." );
        double double1 = input.promptDouble("Enter a double.");
        System.out.println("The string is "+word1+", the integer is "+int1+", the double is "+double1+".");
    }
}
