import java.util.*;

public class Function1 {
        // public static void printMyName(String name){
        //     System.out.println(name);
        //     return;
        // }
        // public static void main(String args[]){
        //     Scanner sc = new Scanner(System.in);
        //     String name = sc.next();
        //     printMyName(name);
        // }

        //output is
        // bhavna
        // bhavna


        // que 2 make a functiom to add 2 numbers and return sum

        public static int calculateSum(int a,int b){
            int sum = a + b;
            return sum;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = calculateSum(a, b);
            System.out.println("Sum of two number is : "+sum);
    }
    //output is
    // 3
    // 10
    // Sum of two number is : 13

    
}
