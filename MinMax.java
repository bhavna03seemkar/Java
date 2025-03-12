//find the minimum and maximum number in an array

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //for the output
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("largest number is : " + max);
        System.out.println("Smallest number is : " + min);
    }
}

//output is
// 5
// 10
// 20
// 30
// 40
// 50
// largest number is : 50
// Smallest number is : 10

//this can be solved using inbuilt form as INT_MAX & INT_MIN
//on comparision when array element < minimum then is called as minimum number
//elwse when number > max then this will be called as maximum number
