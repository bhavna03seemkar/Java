//take an array as an input from the user
//search fro given number x and print index at which it occurs

import java.util.*;

public class Array3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();//for size of array
            int numbers[] = new int[size];

            //for input
            for(int i=0; i<size; i++){
                numbers[i] = sc.nextInt();
            }
            int x  = sc.nextInt();//for searching x  initialising number to found

            //for output
            for(int i=0; i<numbers.length; i++){
                if(numbers[i] == x){
                    System.out.println("x found  at  index : "+i);
                }
            }
        }
}


//output is
// 5
// 10 
// 20
// 30
// 40
// 50
// 10
// x found  at  index : 0