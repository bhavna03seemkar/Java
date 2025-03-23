package Recursion;

public class PrintKeypad {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printCombination(String str, int index, String combination) {
        if (index == str.length()) {
            System.out.println(combination);
            return;
        }
        char currentChar = str.charAt(index);
        String mapping = keypad[currentChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printCombination(str, index + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "432";
        printCombination(str, 0, "");
    }
}
// time complexity will be O(4^n)
