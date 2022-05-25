package com.bridglabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the coordinates on x1");
        int x1= sc.nextInt();
        System.out.println("enter the coordinates on y1");
        int y1= sc.nextInt();
        System.out.println("enter the coordinates on x2");
        int x2= sc.nextInt();
        System.out.println("enter the coordinates on y2");
        int y2= sc.nextInt();
        double length1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("length of line1 is:"+length1);

        System.out.println("enter the coordinates on x3");
        int x3= sc.nextInt();
        System.out.println("enter the coordinates on y3");
        int y3= sc.nextInt();
        System.out.println("enter the coordinates on x4");
        int x4= sc.nextInt();
        System.out.println("enter the coordinates on y4");
        int y4= sc.nextInt();
        double length2 = Math.sqrt((x3-x4)*(x3-x4) + (y3-y4)*(3-y4));
        System.out.println("length of line2 is:"+length2);

            if (Double.compare(length1, length2) == 0) {
                System.out.println("Both the lines are equal in length");
            }
            else if (Double.compare(length1, length2) < 0) {
                System.out.println("The second line greater then first line");
            }
            else {
                System.out.println("The first line is greater then second line");
        }



    }
}
