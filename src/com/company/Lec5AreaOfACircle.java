package com.company;

import java.util.Scanner;

public class Lec5AreaOfACircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the radius");
        double r = sc.nextInt();
        sc.close();

        double result = area(r);
        System.out.println("The area of the circle with the radius R=" + r + ", is: " + result);

    }

    static double area(double r) {
        double pi = 3.14d;

        return (pi * r *r);
    }



}
