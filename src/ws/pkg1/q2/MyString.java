/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.pkg1.q2;

import java.util.Scanner;

/**
 *
 * @author luong
 */
public class MyString {
     public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }

    public String capitalizeFullName(String s) {
        String[] words = s.split(" ");
        StringBuilder capitalized = new StringBuilder();
        for (String word : words) {
            capitalized.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase()).append(" ");
        }
        return capitalized.toString().trim();
    }

    public static void main(String[] args) {
        MyString myString = new MyString();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        System.out.println("1. Test reverseWords");
        System.out.println("2. Test capitalizeFullName");
        System.out.print("Enter TC (1 or 2): ");
        int testCase = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        switch (testCase) {
            case 1:
                System.out.println("OUTPUT: " + myString.reverseWords(input));
                break;
            case 2:
                System.out.println("OUTPUT: " + myString.capitalizeFullName(input));
                break;
        }
    }
}
