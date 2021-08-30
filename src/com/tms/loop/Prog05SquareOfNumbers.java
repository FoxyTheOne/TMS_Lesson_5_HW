package com.tms.loop;

/**
 * 5. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно
 */

public class Prog05SquareOfNumbers {
    public static void main(String[] args) {

        for (int i = 10; i <= 20; i++) {
            System.out.println(squareOfNumber(i)); // Выводим на экран квадрат числа i
        }
    }

    // Метод для возведения числа в квадрат (число в квадрате a = a*a)
    public static int squareOfNumber (int a) {
        return a * a;
    }
}
