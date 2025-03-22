package Recursion;

public class endx {
    public static void moveAlltoEnd(String str, int index, int count, String newString) {
        // mtlb index ki value string ke length ke equal hoga to count me jitna x h
        // usko newString me add kar denge end me
        if (index == str.length()) {
            for (int i = 0; i <= count; i++) {
                newString = newString + "x";
            }
            System.out.println(newString);
            return;
        }
        // first lets take the current char of the string
        char currentChar = str.charAt(index);
        // now lets check if current char is x or not
        if (currentChar == 'x') {
            // current char equal then lets increment the count value
            // this is done in order to get the total number of x in the string
            count++;
            moveAlltoEnd(str, index + 1, count, newString);
        } else {
            newString = newString + currentChar;
            moveAlltoEnd(str, index + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axbxxaxdx";
        moveAlltoEnd(str, 0, 0, "");
    }
}
