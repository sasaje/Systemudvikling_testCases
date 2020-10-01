/**
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 01/10/2020
 */

import java.util.Scanner;

class UserInterface {
    //method
    public static void runInterface() {
        System.out.print("Input two values, first and second: ");
        Scanner input = new Scanner(System.in);
        //prompts user for input 3 values
        int first = input.nextInt();
        int second = input.nextInt();

        //runs sammenLign method, from Function class,
        //with the 2 values given.
        //Return Strings and sets to String "resultat".
        String resultat = Function.sammenLign(first, second);
        System.out.println(resultat);


    }
}