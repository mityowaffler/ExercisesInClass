package com.company;

import java.util.Scanner;

public class Lec3Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kolko;
        System.out.println("Kolko chisla: ");
        kolko = sc.nextInt();
        int inp;
        int sum = 0;
        int i = 0;

        while (i < kolko) {
            System.out.println("Enter a number");
             inp = sc.nextInt();
             sum = sum + inp;
            i++;
        }
        System.out.println("The sum of your numbers is: " + sum);
    }
}
