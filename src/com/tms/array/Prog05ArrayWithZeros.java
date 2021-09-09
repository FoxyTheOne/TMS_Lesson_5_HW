package com.tms.array;

import java.util.Arrays;

/**
 *  5. Создайте массив и заполните его.
 * 	Выведите массив на экран в строку.
 * 	Замените каждый элемент с нечётным индексом на ноль.
 * 	Снова выведете массив на экран на отдельной строке.
 */

public class Prog05ArrayWithZeros {
    public static void main(String[] args) {
        int[] array = new int[6];
        array[0] = 1;
        array[1] = 64;
        array[2] = 25;
        array[3] = 6;
        array[4] = 81;
        array[5] = 7;
        System.out.println("Исходный массив: " + Arrays.toString(array));

        for (int i = 1; i < array.length; i = i + 2) {
            array[i] = 0;
        }

        System.out.println("Массив после замены: " + Arrays.toString(array));
    }
}
