// remove the duplicate characters from the string
package Recursion;

public class RemoveDuplicate {
    public static boolean[] map = new boolean[26];

    // the boolean is declared in order to store the entrance of the character
    // if the character is already present then we dont want to print it again
    // if the character is not present then we want to print it
    public static void removeDuplicateStrings(String str, int index, String newString) {
        // here str is the string from which we want to remove the duplicates
        // index id for the index of the string from which we want to remove the
        // duplicates
        // newString is the string on which we want to store the result
        // base condition
        // when we reach the last character of the string
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        // first get the character from the string
        char currentChar = str.charAt(index);
        if (map[currentChar - 'a']) {
            removeDuplicateStrings(str, index + 1, newString);
        } else {
            // add the character to the newString
            newString = newString + currentChar;
            // mark the current char as present
            map[currentChar - 'a'] = true;
            removeDuplicateStrings(str, index + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abaabcdacdef";
        removeDuplicateStrings(str, 0, "");

    }
}
