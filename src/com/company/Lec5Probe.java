package com.company;

import java.util.Scanner;

public class Lec5Probe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the first number");
        int a = sc.nextInt();
        System.out.println("Please, enter the second number");
        int b = sc.nextInt();
        System.out.println("Please, enter the third number");
        int c = sc.nextInt();

        sc.close();

        int smallest = min(a, b, c);

        System.out.println("The smallest number is: " + smallest);
    }

    static int min(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        }
        else if (b <= a && b <= c) {
            return b;
        }
        else {
            return c;
        }
    }


}
