import javax.swing.*;

public class Paths {
    public static void main(String[] args) {
        int[][] a = {{12, 22, 23, 54}, {43, 35, 21, 20}, {34, 21, 43, 21}, {25, 30, 0, 20}, {0, 22, 10, 10}, {20, 13, 3, 45}};
        int[][] task2c = {{12, 22, 23, 24}, {43, 35, 21, 20}, {34, 21, 43, 21}, {25, 30, 0, 20}, {0, 22, 10, 10}, {20, 13, 3, 45}};
        int[][] task22 = {{30, 11, 10, 30}, {9, 10, 10, 10}, {10, 10, 20, 1}, {10, 1, 1, 10}};
        // test 2.4
        printPaths(task2c);


    }

    public static boolean findIfPath(int[][] mat) {
        boolean ans = true;
        //---------------write your code BELOW this line only!--------------
        // Task 2.1
        ans = findIfPath(mat, 0, 0);
        //---------------write your code ABOVE this line only!--------------
        return ans;
    }

    public static boolean findIfPath(int[][] mat, int row, int colum) {
        boolean ans;
        if (row > mat.length - 1 || colum > mat[0].length - 1 || mat[row][colum] == 0) {
            ans = false;
        } else if (row == mat.length - 1 & colum == mat[0].length - 1) {
            ans = true;
        } else {
            int nextStep = mat[row][colum];
            ans = findIfPath(mat, row + nextStep % 10, colum + nextStep / 10) ||
                    findIfPath(mat, row + nextStep / 10, colum + nextStep % 10);
        }
        return ans;
    }

    public static int countPaths(int[][] mat) {
        int ans = 0;
        //---------------write your code BELOW this line only!--------------
        // Task 2.2
        ans = countPath(mat, 0, 0, 0);

        //---------------write your code ABOVE this line only!--------------
        return ans;
    }

    public static int countPath(int[][] mat, int row, int colum, int track) {
        if (row > mat.length - 1 || colum > mat[0].length - 1 || mat[row][colum] == 0) {
            track = 0;
        } else if (row == mat.length - 1 & colum == mat[0].length - 1) {
            track++;
        } else if (mat[row][colum] % 10 == mat[row][colum] / 10) {
            track = countPath(mat, row + mat[row][colum] % 10, colum + mat[row][colum] / 10, track);
        } else {
            track = countPath(mat, row + mat[row][colum] % 10, colum + mat[row][colum] / 10, track) +
                    countPath(mat, row + mat[row][colum] / 10, colum + mat[row][colum] % 10, track);
        }
        return track;
    }


    public static void printPaths(int[][] mat) {
        //---------------write your code BELOW this line only!--------------
        // Task 2.3
        printPaths(mat, 0, 0, "");
        //---------------write your code ABOVE this line only!--------------
    }

    public static void printPaths(int[][] mat, int row, int colum, String path) {
//        path = path + "[" + row + "]" + "[" + colum + "]" + "->";
        if (row > mat.length - 1 || colum > mat[0].length - 1 || mat[row][colum] == 0) {
            path = path;
        } else if (row == mat.length - 1 & colum == mat[0].length - 1) {
            path = path + "[" + row + "]" + "[" + colum + "]";
            System.out.println(path);
        }

        else if (mat[row][colum] % 10 == mat[row][colum] / 10) {
            path = path + "[" + row + "]" + "[" + colum + "]" + "->";
            printPaths(mat, row + mat[row][colum] % 10, colum + mat[row][colum] / 10, path);
        } else {
            path = path + "[" + row + "]" + "[" + colum + "]" + "->";
            printPaths(mat, row + mat[row][colum] / 10, colum + mat[row][colum] % 10, path);
            printPaths(mat, row + mat[row][colum] % 10, colum + mat[row][colum] / 10, path);
        }
    }

    public static boolean ifSubPath(int[][] mat, int cost) {
        boolean ans = false;
        //---------------write your code BELOW this line only!--------------
        // Task 2.4
        ans = ifSubPath(mat, 0, 0, 0, cost, false);
        //---------------write your code ABOVE this line only!--------------
        return ans;
    }

    public static boolean ifSubPath(int[][] mat, int row, int colum, int sum, int cost, boolean risa) {
        boolean ans;
        if (row > mat.length - 1 || colum > mat[0].length - 1 || mat[row][colum] == 0) {
            ans = false;
        } else {
            int newSum = sum + mat[row][colum];
            if (newSum == cost) {
                risa = true;
            }
            if (row == mat.length - 1 & colum == mat[0].length - 1 & risa) {
                ans = true;
            } else {
                int nextStep = mat[row][colum];
                ans = ifSubPath(mat, row + nextStep % 10, colum + nextStep / 10, newSum, cost, risa) ||
                        ifSubPath(mat, row + nextStep / 10, colum + nextStep % 10, newSum, cost, risa);
            }
        }
        return ans;
    }

}


