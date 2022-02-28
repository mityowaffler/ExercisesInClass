package com.company;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
       /* String lastName = "Petkov";

        if(lastName.equals("Petkov")) {
            System.out.println("Last name is Petkov");
        } else if (lastName.equals("Petrov")) ;
        {
            System.out.println("Last name is not Petkov is Petrov");
        } */

        Scanner skan = new Scanner(System.in);
        int grade;
        System.out.println("Enter the grade, please");
        grade = skan.nextInt();
        System.out.println(grade);
        skan.close();

        if (grade > 3) {
            System.out.println("Minava s: "+ grade);
        } else if (grade == 3) {
            System.out.println("Minava nezadovolitelno s: "+ grade);
        } else if (grade < 3) {
            System.out.println("Ne minava, slab "+ grade);
        }

    }
}

