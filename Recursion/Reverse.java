package Recursion;

public class Reverse {
    public static void printReverse(String str, int index) {
        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printReverse(str, index - 1);
    }

    public static void main(String[] args) {
        String str = "Bhavna Seemkar";
        printReverse(str, str.length() - 1);
    }
}
