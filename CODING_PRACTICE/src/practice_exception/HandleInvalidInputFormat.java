package practice_exception;

import java.util.Scanner;

public class HandleInvalidInputFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String input = sc.next();
            int num = Integer.parseInt(input);
            System.out.println(num * num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        }
        sc.close();
    }
}

