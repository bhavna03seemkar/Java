package Recursion;

public class PlaceTile {
    public static int placeTiles(int n, int m) {
        // base case 1
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // recursive condition
        // vertically
        int verticalPlacements = placeTiles(n - m, m);
        // horzontal placements
        int horizontalPlacements = placeTiles(n - 1, m);
        // return statements
        return verticalPlacements + horizontalPlacements;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(placeTiles(n, m));
    }
}
