package CheckPalindrome;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word you want check:");
        String word = scanner.nextLine();
        System.out.println("Is Palindrome? ");
        System.out.println(isPalindrome(word));
    }

    public static boolean isPalindrome(String word) {
        boolean isPalindrome = false;
        int lenght = word.length();
        if (lenght == 0 || lenght == 1) {
            isPalindrome = true;
            return isPalindrome;
        } else if (word.charAt(0) == word.charAt(lenght - 1)) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
            return isPalindrome;
        }
       return isPalindrome(word.substring(1, lenght - 1));
    }
}
