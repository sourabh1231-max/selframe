package TEST;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        // Reverse the input string
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Display reversed string
        System.out.println("Reversed word: " + reversed);

        // Check if input is equal to reversed
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("The word \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + input + "\" is not a palindrome.");
        }
    }
}        