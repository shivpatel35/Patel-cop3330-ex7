package org.ex7;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {

        //Constant Declaration for conversion to square meters
        final double square_meters = 0.09290304;

        //Scanner declaration for user input
        Scanner l = new Scanner(System.in);
        Scanner w = new Scanner(System.in);

        //integer variable declaration for length and width
        int length = 0;
        int width = 0;

        //Statement for user input of length and width
        System.out.println("What is the length of the room in feet?");
        length = l.nextInt();

        System.out.println("What is the width of the room in feet?");
        width = w.nextInt();

        int area = length * width;
        double sq_meters = (area * square_meters);

        System.out.println("The area is");
        System.out.println(+ area + " square feet");
        System.out.println(+ sq_meters + " square meters");






    }

}
