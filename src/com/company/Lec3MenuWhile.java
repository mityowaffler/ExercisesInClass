package com.company;

import java.util.Scanner;

public class Lec3MenuWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("enter a");
        a = sc.nextInt();
        int b;
        System.out.println("enter b");
        b = sc.nextInt();

        int result;
        result = a + b;

        int inputNumber=result;
        // inputNumber = sc.nextInt();

        while (inputNumber !=6) {
            System.out.println("Please choose an option: \n" +
                    "1) Option 1 \n" +
                    "2) Option 2 \n" +
                    "Else - end the program");
            inputNumber = sc.nextInt();

            switch (inputNumber) {
                case 1:
                    System.out.println("1)");
                    break;
                case 2:
                    System.out.println("2)");
                    break;
                default:
                    inputNumber = 6;
                    System.out.println("Program ends");

            }
        }




        sc.close();
    }
}
