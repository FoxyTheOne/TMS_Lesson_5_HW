package com.tms.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. Создайте массив целых чисел.
 *  Удалите все вхождения заданного числа из массива. Пусть число задается с консоли (класс Scanner).
 *  Если такого числа нет - выведите сообщения об этом.
 * 	В результате должен быть новый массив без указанного числа.
 */

public class Prog01ArrayChange {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, 3, 4, 5, 6, 7, 8, 9, 10, 2};

        Scanner sc = new Scanner(System.in);
        System.out.println("Массив чисел: " + Arrays.toString(arrayOfNumbers));
        System.out.print("Введите целое число для удаления из массива: ");

        if (!sc.hasNextInt()) { // if (!sc.hasNextInt()) проверяет, является ли пользовательский ввод целым числом
            System.out.println("Вы ввели не целое число");
        } else {
            int numberToFind = sc.nextInt();

            Arrays.sort(arrayOfNumbers); // Отсортируем массив перед поиском
            int possiblePosition = Arrays.binarySearch(arrayOfNumbers, numberToFind);

            if (possiblePosition > arrayOfNumbers.length || possiblePosition < 0) {
                System.out.println("Заданное число в массиве не найдено");
            } else if (arrayOfNumbers[possiblePosition] == numberToFind) {
                // Если искомый элемент не найден, то возвращается position+1, где position - позиция элемента, где он МОГ БЫ БЫТЬ, поэтому проверяем

                // Считаем, на сколько меньше получится новый массив:
                int counter = 0;
                for (int i = 0; i < arrayOfNumbers.length; i++) {
                    if (arrayOfNumbers[i] == numberToFind) {
                        counter++;
                    }
                }

                // Создаём массив, в который запишем новые значения:
                int[] arrayOfNumbersDestination = new int[arrayOfNumbers.length - counter];

                // Записываем в новый массив все значения, не равные искомому числу:
                int indexArrayOfNumbersDestination = 0;
                for (int i = 0; i < arrayOfNumbers.length; i++) {
                    if (arrayOfNumbers[i] != numberToFind) {
                        arrayOfNumbersDestination[indexArrayOfNumbersDestination] = arrayOfNumbers[i];
                        indexArrayOfNumbersDestination++;
                    }
                }

                System.out.println("Заданное число входит в массив. Число удалено из массива:");
                System.out.println(Arrays.toString(arrayOfNumbersDestination));

            } else{
                System.out.println("Заданное число в массиве не найдено");
            }
        }
    }
}
