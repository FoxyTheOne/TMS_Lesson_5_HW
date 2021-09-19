package com.tms.arrayMulti;

/**
 * 2. Умножение двух матриц. Создайте два массива целых чисел размером 3х3 (две матрицы).
 * Напишите программу для умножения двух матриц.
 * Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * Ожидаемый результат: 1  2  3   1  1  1   0  0  0
 */
public class Prog02MatrixMultiplication {
    public static void main(String[] args) {
        int firstArray[][] = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int secondArray[][] = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int resultArray[][] = new int[3][3];

        int firstLine = 0;
        int secondColumn = 0;
        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[i].length; j++) {
                resultArray[i][j] = firstArray[firstLine][0] * secondArray[0][secondColumn]
                        + firstArray[firstLine][1] * secondArray[1][secondColumn]
                        + firstArray[firstLine][2] * secondArray[2][secondColumn]
                        + firstArray[firstLine][3] * secondArray[3][secondColumn];
                secondColumn++;
            }
            secondColumn = 0;
            firstLine++;
        }

        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[i].length; j++) {
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
