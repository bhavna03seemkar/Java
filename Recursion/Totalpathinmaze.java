package Recursion;

public class Totalpathinmaze {
    public static int findTotalPath(int i, int j, int n, int m) {
        // when n == m base condition 1
        if (i == n || j == m) {
            return 0;
        }
        // base condition 2
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // recursion condition for downwward path
        int downPath = findTotalPath(i + 1, j, n, m);
        // recursive condition for right path
        int rightPath = findTotalPath(i, j + 1, n, m);
        // returning total path
        return downPath + rightPath;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;// taking 3*3 matrix or maze
        int totalpath = findTotalPath(0, 0, n, m);
        System.out.println(totalpath);
    }
}

// output is 6
// but the method can be optimized due to reccursion the time complexity
// increases
// but the ultimate solution can be achived by dynamic programing
