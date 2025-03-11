import java.util.*;

public class Datatypes {
    public static void main(String args[]) {
        //now we want to take the input from user
        //using without user input
        //variables
        // int a =10;
        // int b = 20;
        // int sum = a+b;
        // System.out.println(sum);
        //"sum" will not return any value 
        //meanwhilw it works as a string

        //now using user input
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println(sum);

        //que1: 
//make a program that takes the radius of a circle as an input and calculates
//its radius and area and print it as outpu tto the user

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double pi = 3.14;
        double area = pi * r *r;
        System.out.println(area);

        //output will be
        //12
        //452.15999999999997
    }
}
