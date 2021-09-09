package com.tms.array;

import java.util.Arrays;

/**
 *  3. Создайте 2 массива из 5 чисел.
 * 	Выведите массивы на консоль в двух отдельных строках.
 * 	Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение
 * 	оказалось больше (либо сообщите, что их средние арифметические равны)
 */

public class Prog03ArrayArithmeticalMean {
    public static void main(String[] args) {
        int[] array1 = {0, 8, 0, 8, 5};
        int[] array2 = {21, 35, 64, 91, 27};

        System.out.println(Arrays.toString(array1) + "\n" + Arrays.toString(array2));
        System.out.println();

        double average1 = arithmeticalMean(array1);
        double average2 = arithmeticalMean(array2);

        if (average1 > average2) {
            System.out.printf("Среднее арифметическое элементов первого массива больше. Оно равно %.2f", average1);
        } else if (average1 == average2) {
            System.out.printf("Средние арифметические элементов равны %.2f в двух массивах", average1);
        } else {
            System.out.printf("Среднее арифметическое элементов второго массива больше. Оно равно %.2f", average2);
        }

        System.out.println();
    }

    public static double arithmeticalMean (int[] array) {
        double sum = 0;
        for (int e: array) {
            sum = sum + e;
        }
        double average = sum / array.length;
        return average;
    }
}
