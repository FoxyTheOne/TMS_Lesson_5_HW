package com.tms.array;

import java.util.Arrays;

/**
 * 7. Реализуйте алгоритм сортировки пузырьком.
 */

public class Prog07BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 10, 35, 49, 12, 7};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;

        // Функция входит в цикл while, в котором проходит весь массив и меняет элементы местами при необходимости
        while(!sorted) {
            // Массив в алгоритме считается отсортированным. При первой замене доказывается обратное и запускается еще одна итерация.
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
                // Цикл останавливается, когда все пары элементов в массиве пропускаются без замен
            }
        }
    }
}
