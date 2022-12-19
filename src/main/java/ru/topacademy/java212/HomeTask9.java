package ru.topacademy.java212;

public class HomeTask9 {
    public int[][] Ex1(int n, int m) {
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (i + 1) * (j + 1);

            }

        }
        return arr;
    }

    public static int[][] Ex2(int startRandom, int endRandom, int sizeArray) {
        int[][] arr = new int[sizeArray][sizeArray];
        for (int[] line : arr) {
            for (int el : line) {
                el = (int) (Math.random() * (endRandom - startRandom + 1) + startRandom);
            }
        }
        return arr;

    }



    public static int MaxNumber(int[][] arr) {

        int max = 0;
        for (int[] line : arr) {
            for (int el : line) {
                if (el > max) {
                    max = el;
                }
            }
        }
        return max;
    }



    public static int MinNumber(int[][] arr) {

        int min = arr[0][0];

        for (int[] line : arr) {
            for (int el : line) {
                if (el < min) {
                    min = el;
                }
            }
        }
        return min;
    }



    public  static int[][] Ex4(int rows, int cols) {
        int[][] arr = new int[rows][cols];

        int num = 1;
        int max = rows * cols;

        int rmin = 0, rmax = rows - 1;
        int cmin = 0, cmax = cols - 1;

        while (num <= max) {

            for (int i = cmin; num <= max && i <= cmax; i++) {
                arr[rmin][i] = num++;
            }
            rmin++;

            for (int i = rmin; num <= max && i <= rmax; i++) {
                arr[i][cmax] = num++;
            }
            cmax--;

            for (int i = cmax; num <= max && i >= cmin; i--) {
                arr[rmax][i] = num++;
            }
            rmax--;

            for (int i = rmax; num <= max && i >= rmin; i--) {
                arr[i][cmin] = num++;
            }
            cmin++;
        }

        return arr;
    }

}
