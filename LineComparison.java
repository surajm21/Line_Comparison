package com.bridglabz;

import java.util.Scanner;

public class LineComparison {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public LineComparison(int x1,int x2,int y1,int y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
    public double length(){
        double lengthOfLine= Math.pow(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)),0.5);
        return lengthOfLine;
    }
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


        System.out.println("enter the coordinates on x3");
        int x3= sc.nextInt();
        System.out.println("enter the coordinates on y3");
        int y3= sc.nextInt();
        System.out.println("enter the coordinates on x4");
        int x4= sc.nextInt();
        System.out.println("enter the coordinates on y4");
        int y4= sc.nextInt();

        LineComparison l1 = new LineComparison(x1,y1,x2,y2);
        System .out.println("length of line1 is:"+l1.length());
        LineComparison l2 = new LineComparison(x3,y3,x4,y4);
        System.out.println(" length of  line2  is "+l2.length());

        int val1 = (int) l1.length();
        int val2 = (int) l2.length();

        Integer length1 = Integer.valueOf(val1);
        Integer length2 = Integer.valueOf(val2);
        
        if(length1.equals(length2))
            System.out.println("The lines are equal!!!");
        else
            System.out.println("The lines are not equal!!!");

        int result=length1.compareTo(length2);
        if(result>0)
            System.out.println("line1 is greater than line2!!!");
        else if(result<0)
            System.out.println("Line2 is greater than line1!!!");
        else
            System.out.println("line1 is greater than line2!!!");
    }
}