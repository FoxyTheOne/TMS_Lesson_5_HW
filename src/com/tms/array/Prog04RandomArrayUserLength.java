package com.tms.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  4. Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
 * 	Создайте массив из n случайных целых чисел и выведите его на экран.
 * 	Размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10.
 * 	Если n не удовлетворяет условию - выведите сообщение об этом.
 * 	Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
 */

public class Prog04RandomArrayUserLength {
    public static void main(String[] args) {
        // Размер массива задается с консоли. Размер массива может быть больше 5 и меньше или равно 10
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива, от 6 до 10: ");
        int arraySize = 0;

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                arraySize = sc.nextInt();
                if (arraySize > 5 && arraySize <= 10) {
                    System.out.println("Вы ввели число " + arraySize);
                    break;
                } else {
                    System.out.println("Число " + arraySize + " не соответствует заданному диапазону. Попробуйте ещё раз.");
                    System.out.print("Введите размер массива, от 6 до 10: ");
                }
            } else {
                String str = sc.nextLine();
                System.out.println("\"" + str + "\" не является целым числом. Попробуйте ещё раз.");
                System.out.print("Введите размер массива, от 6 до 10: ");
            }
        }

        // Создаём массив из n случайных целых чисел и выводим его на экран
        int[] randomArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            randomArray[i] = (int) (Math.random()*(200+1)) - 100; // Диапазон целых чисел [-100; +100](100 включительно)
        }
        System.out.println();
        System.out.println("Полученный массив из " + arraySize + " случайных чисел: " + Arrays.toString(randomArray));

        // Создаём второй массив только из чётных элементов первого массива, если они там есть, и выводим его на экран
        // Для начала, посчитаем количество чётных элементов в массиве
        int counterEven = 0;
        for (int i = 0; i < arraySize; i++) {
            if (randomArray[i] % 2 == 0) {
                counterEven++;
            }
        }

        if (counterEven > 0) {
            // Создаём массив, в который запишем новые значения:
            int[] arrayOfEven = new int[counterEven];

            // Записываем в новый массив все чётные значения из первого массива:
            int indexOfEvenDestination = 0;
            for (int i = 0; i < arraySize; i++) {
                if (randomArray[i] % 2 == 0) {
                    arrayOfEven[indexOfEvenDestination] = randomArray[i];
                    indexOfEvenDestination++;
                }
            }
            System.out.println("Полученный массив из чётных элементов первого массива: " + Arrays.toString(arrayOfEven));

        } else {
            System.out.println("Чётных элементов в массиве нет");
        }
    }
}
