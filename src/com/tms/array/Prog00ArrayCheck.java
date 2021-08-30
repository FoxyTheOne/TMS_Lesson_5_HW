package com.tms.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 0. Создайте массив целых чисел.
 *  Напишите программу, которая выводит сообщение о том, входит ли заданное число в массив или нет.
 * 	Пусть число для поиска задается с консоли (класс Scanner).
 */

public class Prog00ArrayCheck {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, 3, 4, 5, 6, 7, 8, 9, 10, 2};

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число для поиска в массиве: ");

        if (!sc.hasNextInt()) { // if (!sc.hasNextInt()) проверяет, является ли пользовательский ввод целым числом
            System.out.println("Вы ввели не целое число");
        } else {
            int numberToFind = sc.nextInt();

            Arrays.sort(arrayOfNumbers); // Отсортируем массив перед поиском
            int possiblePosition = Arrays.binarySearch(arrayOfNumbers, numberToFind);

            if (possiblePosition > arrayOfNumbers.length || possiblePosition < 0) {
                System.out.println("Заданное число в массиве не найдено");
            } else if (arrayOfNumbers[possiblePosition] == numberToFind) { // Если искомый элемент не найден, то возвращается position+1, где position - позиция элемента, где он МОГ БЫ БЫТЬ
                System.out.println("Заданное число входит в массив");
            } else{
                System.out.println("Заданное число в массиве не найдено");
            }
        }
    }
}
