package com.tms.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2. Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
 * 	Для генерации случайного числа используйте метод Math.random(). +
 * 	Пусть будет возможность создавать массив произвольного размера. Пусть размер массива вводится с консоли. +
 */

public class Prog02RandomArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");

        int arraySize = intInput(sc);
        if (arraySize > 0) {
            // В методе intInput() проверили, является ли пользовательский ввод числом int и записали в переменную введённое значение.

            int[] randomArray = new int[arraySize];
            // Заполняем массив случайными числами:
            for (int i = 0; i < arraySize; i++) {
                randomArray[i] = (int) (Math.random()*(200+1)) - 100;
                // По умолчанию промежуток Math.random() - [0;1) (1 не вкл.)
                // Мы умножаем нижний и верхний диапазон на 201, получаем [0;201) (201 не вкл.)
                // Затем отнимаем 100, получаем целочисленное значение в интервале [-100; +100](100 включительно)
            }

            // Сортируем элементы массива по возрастанию:
            Arrays.sort(randomArray);
            System.out.println("Создан массив целых чисел: " + Arrays.toString(randomArray));

            // Вычисляем значения, необходимые по условию:
            System.out.println("Минимальное число в массиве = " + randomArray[0]);
            System.out.println("Максимальное число в массиве = " + randomArray[arraySize - 1]);

            double sum = 0;
            for (int e: randomArray) {
                sum = sum + e;
            }
            double average = sum / arraySize;
            System.out.printf("Среднее значение чисел в массиве = %.2f", average);
        }
    }

    public static int intInput (Scanner sc) {
        if (!sc.hasNextInt()) {
            System.out.println("Вы ввели не целое число. Следует вводить целое положительное число");
            return 0;
        } else {
            int arraySize = sc.nextInt();
            if (arraySize <= 0) {
                System.out.println("Введенное число - не положительное. Следует вводить целое положительное число");
                return 0;
            } else {
                return arraySize;
            }
        }
    }

}
