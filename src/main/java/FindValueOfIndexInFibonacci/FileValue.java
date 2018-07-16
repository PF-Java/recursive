package FindValueOfIndexInFibonacci;

import java.util.Scanner;

public class FileValue {
    public static void main(String[] args) {
        System.out.println("Find the number in the fibonacci range");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index in the fibonacci range:");
        int index = scanner.nextInt();

        int result = findValue(index);
        System.out.println("The value at position "+ index + " in the fibonacci range is: " + result);
    }

    public static int findValue(int index) {
        if (index < 3) return 1;
        return findValue(index - 2) + findValue(index - 1);
    }
}
