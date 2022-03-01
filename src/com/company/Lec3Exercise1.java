package com.company;

import java.util.Scanner;

public class Lec3Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int usersNumber;
        System.out.println("User please enter a number:");
        usersNumber = sc.nextInt();
        int result = 0;

        for (int i = 1; i < usersNumber; i++) {
            System.out.println("the numbers: " + i);
            result = result + i;
        }

        System.out.println("The result is: " + result );


        sc.close();
    }
}
