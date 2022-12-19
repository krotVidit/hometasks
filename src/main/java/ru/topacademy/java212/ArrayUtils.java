package ru.topacademy.java212;

import java.util.Arrays;

public class ArrayUtils { // HomeWork11

    public static int[][] matrixArrays(int a, int b, int length) {
        int[][] arr = new int[length][length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * (b - a + 1) + a);
            }
        }
        return arr;
    }

    public static void reverseArrays(int[] arr) {
        if (arr.length > 0) {
            System.out.print(arr[arr.length - 1] + " ");
            int[] index = new int[arr.length - 1];
            for (int i = 0; i < index.length; i++) {
                index[i] = arr[i];
            }

            reverseArrays(index);
        }
    }
}
