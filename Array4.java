//take an array of names as an input and print them ont the screen
//user based input

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String name[] = new String[size];
        
        //taking input from the user
        for(int i=0; i<size; i++){
            name[i] = sc.next();
        }
        //output to display
        for(int i=0; i<name.length; i++){
            System.out.println("name " + (i+1) + " is : " + name[i]);
            //printing names through the iteration
        }
    }
}
//output is
// 4
// bhavna
// nehal
// megha
// ashu
// name 1 is : bhavna
// name 2 is : nehal
// name 3 is : megha
// name 4 is : ashu

//hint here we first take the input of array 
//then we add names of string of array by giving names
//then output it according to the names/length of array
//in java size is equal to .length method