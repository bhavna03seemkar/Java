//statement- print all the subsequence of the string
package Recursion;

public class PrintSubsequences {
    public static void printAllSubsequence(String str, int index, String newString) {
        // base condition
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        // pehle current char print karenge
        char currentChar = str.charAt(index);
        // then string that will be added
        printAllSubsequence(str, index + 1, newString + currentChar);
        // not to be added
        printAllSubsequence(str, index + 1, newString);

    }

    public static void main(String[] args) {
        String str = "abcd";
        printAllSubsequence(str, 0, "");
    }
}
// time complexity
// since as an analysis of the above algorithm we can,
// see that the time complexity of algorithm will be
// T(n) = O(2^n)