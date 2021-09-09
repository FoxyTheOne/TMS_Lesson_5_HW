package com.tms.arrayMulti;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 0. Создать трехмерный массив из целых чисел.
 * С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
 * Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
 */

public class Prog00Array3D {
    public static void main(String[] args) {
        // Создаём трёхмерный массив целых чисел, состоящий из двух двухмерных массивов
        int[][][] array3d = new int[2][][];

        //Создаём первый и второй двумерные массивы, состоящие из двух одномерных массивов и 5 ячеек
        array3d[0] = new int[2][5];
        array3d[1] = new int[2][5];

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое и не отрицательное число, на которое будет увеличиваться каждый элемент в массивах: ");
        int stepSize = 0;

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                stepSize = sc.nextInt();
                if (stepSize >= 0) {
                    System.out.println("Вы ввели число " + stepSize);
                    break;
                } else {
                    System.out.println("Число " + stepSize + " не положительное. Попробуйте ещё раз.");
                    System.out.print("Введите целое и не отрицательное число, на которое будет увеличиваться каждый элемент в массивах: ");
                }
            } else {
                String str = sc.nextLine();
                System.out.println("\"" + str + "\" не является целым числом. Попробуйте ещё раз.");
                System.out.print("Введите целое и не отрицательное число, на которое будет увеличиваться каждый элемент в массивах: ");
            }
        }

        int cellValue = 0;
        // Заполняем трехмерный массив i
        for (int i = 0; i < array3d.length; i++) {
            // Заполняем двумерный массив j трехмерного массива i
            for (int j = 0; j < array3d[i].length; j++) {
                // Заполняем одномерный массив k двумерного массива j
                for (int k = 0; k < array3d[i][j].length; k++) {
                    array3d[i][j][k] = cellValue;
                    cellValue = cellValue + stepSize;
                }
            }
        }

        System.out.println(Arrays.toString(array3d[0][0]) + " "
                + Arrays.toString(array3d[0][1]) + " "
                + Arrays.toString(array3d[1][0]) + " "
                + Arrays.toString(array3d[1][1]));
    }
}
