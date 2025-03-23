package Recursion;

import java.util.HashSet;

public class Uniquesubsequence {
    public static void printUnique(String str, int index, String newString, HashSet<String> set) {
        // now for the base condition
        if (index == str.length()) {

            if (set.contains(newString)) {
                return;// condition when set contains the strring then simply returns

            } else {
                System.out.println(newString);// print the string
                set.add(newString); // ad the string to the set
                return;
            }
        }
        // taking string as a current char
        char currentChar = str.charAt(index);
        // when the character to be added
        printUnique(str, index + 1, newString + currentChar, set);
        // not tobe added
        printUnique(str, index + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printUnique(str, 0, "", set);
    }
}
