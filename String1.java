import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        //here sc is an object to the scanner class
        //declaration of string to take the input from the user
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //next line is used because we want to print the full name
        //if only first name to print then we can use only sc.next()
        System.out.println("Your name is : " + name);

    }
}
