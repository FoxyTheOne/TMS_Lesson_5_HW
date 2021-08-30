package com.tms.additTask;

/**
 * 0. Выведите на экран первые 11 членов последовательности Фибоначчи
 */

public class Prog00FibonacciNumbers {
    public static void main(String[] args) {
        int[] fibonacciNumbers = new int[11];
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        for (int i = 2; i < 11; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        // Цикл for-each (только для массива). перебирает каждую ячейку массива и что-то с ней делает
        // Вводим пер-ю "e", при помощи кот. будем работать с элементами массива внутри фигурных скобок
        for (int e : fibonacciNumbers) {
            System.out.print(e + " ");
        }
    }
}
