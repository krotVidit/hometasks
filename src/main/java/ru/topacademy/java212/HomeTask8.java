package ru.topacademy.java212;

public class HomeTask8 {

    /**
     * Метод возвращает true для симметричного массива  Симметричным считается массив,
     * в котором значения элементов с конца равно значению элементов с начала.
     * Проверяемый массив - параметр метода.
     * Примеры значений для симметричного массива: 1, 2, 3, 2, 1
     * 2, 2, 3, 2, 2
     * 1, 3, 2, 3, 1
     * 5, 4, 3, 4, 5
     */

    public boolean isSymmetric(int[] array) {
        //i сначала, j с конца массива
        for (int i = 0, j = array.length - 1; j > i; i++, j--)
            if (array[i] != array[j])
                return false;
        return true;
    }

    // Задание 1
    public boolean exampl1(int[] arr) {
        for (int i = 2; i < 17; i++)
            arr[i] = arr[i - arr[i - 1]] + arr[i - arr[i - 2]];
        return true;
    }
}
