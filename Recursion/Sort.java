package Recursion;

public class Sort {
    public static boolean isSorted(int array[], int index) {
        if (index == array.length - 1) {
            return true;
        }
        if (array[index] >= array[index + 1]) {
            // array is unsorted so return false
            return false;
        }
        return isSorted(array, index + 1);
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(isSorted(array, 0));
    }
}
