package com.company;

import java.util.Scanner;

public class Lecture3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i = 1;
        System.out.println("Enter a number:");
        n = sc.nextInt();
        sc.close();

        // basic while loop
        // while (condition)
        // { code block }
        // it moves forward if the condition false
        while (i<=n) {
            System.out.println("Numbers between 1 and (including) your input: " + i++);
        }
    }
}
