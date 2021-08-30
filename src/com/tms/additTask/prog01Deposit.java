package com.tms.additTask;

import java.util.Scanner;

/**
 * 1. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
 *  Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев.
 *  А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
 * 	Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.
 */

public class prog01Deposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float deposit = floatInput(sc);
        if (deposit > 0) {
            // В методе floatInput() проверили, является ли пользовательский ввод числом float и записали сумму вклада в переменную deposit. Теперь узнаём количество месяцев:

            System.out.print("Введите количество месяцев: ");
            int monthAmount = intInput(sc);
            if (monthAmount > 0) {
                // В методе intInput() проверили, является ли пользовательский ввод числом int и записали сумму вклада в переменную monthAmount. Далее считаем.

                float sumDeposit = deposit;
                for (int i = 0; i < monthAmount; i++) {
                    sumDeposit = (float) (sumDeposit + sumDeposit * 0.07); // за каждый месяц банк начисляет к сумме вклада 7% от суммы
                }
                System.out.printf("Конечная сумма вклада с учетом начисления процентов за каждый месяц: %.2f руб.", sumDeposit);
            }
        }
    }

    public static float floatInput (Scanner sc) {
        if (!sc.hasNextFloat()) {
            System.out.println("Вы ввели не число. Следует вводить положительное число");
            return 0;
        } else {
            float deposit = sc.nextFloat();
            if (deposit <= 0) {
                System.out.println("Введенное число - не положительное. Следует вводить положительное число");
                return 0;
            } else {
                return deposit;
            }
        }
    }

    public static int intInput (Scanner sc) {
        if (!sc.hasNextInt()) {
            System.out.println("Вы ввели не целое число. Следует вводить целое положительное число");
            return 0;
        } else {
            int monthAmount = sc.nextInt();
            if (monthAmount <= 0) {
                System.out.println("Введенное число - не положительное. Следует вводить целое положительное число");
                return 0;
            } else {
                return monthAmount;
            }
        }
    }

}
