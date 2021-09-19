package com.tms.arrayMulti;

/**
 * 4. Создайте двумерный массив. Выведите на консоль диагонали массива.
 */
public class Prog04ArrayDiagonal {
    public static void main(String[] args) {
        int[][] intArray = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}, {0, 0, 0, 0}};

        System.out.println("Наш массив: ");
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Диагональ массива: ");
        int j = 0;
        for (int i = 0; i < intArray.length; i++) {
            while (j < intArray[i].length) {
                System.out.print(intArray[i][j] + " ");
                break;
            }
            j++;
        }
    }
}
