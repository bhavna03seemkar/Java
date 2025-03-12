import java.util.*;

public class Function2 {

    public static double calculateAvg(int a, int b, int c){
        double average = (a+b+c)/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double average = calculateAvg(a, b, c);
        System.out.println("the average is : "+ average);
    }
}
