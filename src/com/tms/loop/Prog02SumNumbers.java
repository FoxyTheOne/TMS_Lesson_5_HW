package com.tms.loop;

import java.util.Scanner;

/**
 * 2. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
 * 	Для ввода числа воспользуйтесь классом Scanner.
 */

public class Prog02SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write positive integer number: ");

        if (!sc.hasNextInt()) { // if (!sc.hasNextInt()) проверяет, является ли пользовательский ввод целым числом (sc - наш созданный объект)
            System.out.println("Вы ввели не целое число");
        } else {
            int number = sc.nextInt(); // number - переменная, в которую мы записали строку, введенную с консоли
            if (number <= 0) {
                System.out.println("Введенное число - не положительное");
            } else {
                // Проверили, чтобы введено было целое, положительное число. Далее программа суммирует все числа от 1 до введенного пользователем числа.

                int sum = 0;
                for (int i = 1; i <= number; i++) {
                    sum = sum + i;
                }
                System.out.println("Sum of " + number + " first positive integer number(s) is " + sum);
            }
        }
    }
}
