package com.tms.arrayMulti;

/**
 3. Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива.
 */
public class Prog03Array2DSum {
    public static void main(String[] args) {
        int[][] intArray = new int[3][2];

        // Заполняем массив
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = (int) (Math.random() * (200 + 1)) - 100;// Диапазон целых чисел [-100; +101)(101 не включительно). Формула (Math.random()*(b-a))+a) = [a; b)
            }
        }

        // Выводим массив на консоль
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }

        // Считаем сумму
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                sum = sum + intArray[i][j];
            }
        }

        System.out.println();
        System.out.println("Сумма всех элементов равна " + sum);
    }
}
