package com.tms.loop;

/**
 * 4. Вывести 10 первых чисел последовательности 0, -5,-10,-15..
 */

public class Prog04SequenceOfNumbers {
    public static void main(String[] args) {
        int number = 0;

        //Выводим 10 первых чисел последовательности:
        for (int i = 0; i < 10; i++) {

            // Описываем последовательность:
            System.out.print(number + " ");
            number -= 5;
        }
    }
}
