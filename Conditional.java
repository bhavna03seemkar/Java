import java.util.*;

public class Conditional {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int age =sc.nextInt();
        // if(age > 18){
        //     System.out.println("adult");
        // }
        // else{
        //     System.out.println("not an adult");
        // }

        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // if(x % 2 == 0){
        //     System.out.println("x is even number");
        // }
        // else{
        //     System.out.println("x is odd number");
        // }

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if(a == b){
        //     System.out.println("a is equal to b");
        // }
        // else if(a > b){
        //     System.out.println("a is greater than b");
        // }
        // else{
        //     System.out.println("a is less than b");
        // }

        // int button = sc.nextInt();
        // if(button == 1){
        //     System.out.println("Hello");
        // }
        // else if (button == 2){
        //     System.out.println("Namaste");
        // }
        // else if (button == 3){
        //     System.out.println("Bonjur");
        // }
        // else{
        //     System.out.println("Invalid button");
        // }

        //using switch case
        // int button = sc.nextInt();
        // switch (button) {
        //     case 1:
        //         System.out.println("Hello");
        //         break;
        //     case 2:
        //         System.out.println("Namaste");
        //         break;
        //     case 3:
        //         System.out.println("Bonjur");
        //         break;
        //     default:
        //         System.out.println("Invalid button");
        //         break;
        // }


    //      for(int i=0; i<11; i++){
    //         System.out.println(i);
    //      }
    // int i = 0;
    // while(i<11){
    //     System.out.println(i);
    //     i++;

    //using do while loop
    // int i =0;
    // do{
    //     System.out.println(i);
    //     i++;
    // }while(i<11);

    //que - print the sum of first n natural numbers
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int sum = 0;
        // for(int i = 1; i <= n; i++){
        //     sum = sum +i;
        // }
        // System.out.println(sum);

        for(int i = 1; i<11; i++){
            System.out.println(n * i);
        }

    }
}

