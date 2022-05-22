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
    }
}
