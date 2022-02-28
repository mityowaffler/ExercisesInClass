package com.company;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        int nambar;
        int nambar2;
        System.out.println("Enter any number");
        nambar = skan.nextInt();
        //skan.close();
        System.out.println(nambar);

        System.out.println("Enter any number");
        nambar2 = skan.nextInt();

        System.out.println(nambar2);
    }
}
