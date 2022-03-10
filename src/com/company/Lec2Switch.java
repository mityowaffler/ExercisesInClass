package com.company;

public class Lec2Switch {
    public static void main(String[] args) {
        int number = 2;
        switch (number) {
            case 2:
                System.out.println("bad grade");
            case 3:
                System.out.println("avg");
                break;
            case 6:
                System.out.println("excellent");
            default:
                System.out.println("wrong grade");
        }
    }
}
