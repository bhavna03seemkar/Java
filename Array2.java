import java.util.*;

public class Array2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input ke liye
        for(int i=0; i<size; i++ ){
            numbers[i] = sc.nextInt();
        }

        //output ke liye
        for(int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }
    }
}

//output is
// 5
// 10
// 11
// 12
// 21
// 32
// 10
// 11
// 12
// 21
// 32
