import java.util.Scanner;

public class Fibonacci {
    public static void fibonacci(int a, int b, int n){
        if(n == 0){
            return ;
        }
        else{
            int sum = a + b;
            System.out.println(sum+" ");
            a = b;
            b = sum;
            fibonacci(a, b, n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0, second = 1;
        System.out.println(first);
        System.out.println(second);
        fibonacci(first,second,n-2);
    }
}
