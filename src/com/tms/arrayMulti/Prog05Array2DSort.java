package com.tms.arrayMulti;

import java.util.Arrays;

/**
 * 5. Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.
 */
public class Prog05Array2DSort {
    public static void main(String[] args) {
        int[][] intArray = new int[3][5];

        // Заполняем массив
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = (int) (Math.random() * 100); // Формула (Math.random()*(b-a))+a) = [a; b)
            }
        }

        // Выводим массив на консоль
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Отсортированные массивы: ");

        for (int i = 0; i < intArray.length; i++) {
            Arrays.sort(intArray[i]);
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
