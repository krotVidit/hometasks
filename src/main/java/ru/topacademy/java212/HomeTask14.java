package ru.topacademy.java212;

public class HomeTask14 {

    /*  Создать класс ArrayUtils в пакете ru.topacademy.java212.utils и статический метод
    создания квадратного двумерного массива целых чисел, заполненный случайными числами
    из интервала [a, b]. a,b и размерность массива — параметры метода (итого 3 параметра).
    Сделать тесты в src/test/java/, название пакета то же.
     */

    public static int[][] arrayMatrix(int a,int b, int length){
        int [][] arr = new int[length][length];
        for(int i = 0;i< arr.length;i++){
            for (int j = 0;j< arr[i].length;j++){
                arr[i][j] = (int) (Math.random()*(b-a+1)+a);
            }
        }
        return arr;
    }
}
