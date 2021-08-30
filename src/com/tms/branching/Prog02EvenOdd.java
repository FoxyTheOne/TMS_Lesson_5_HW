package com.tms.branching;

/**
 * 2. Напишите программу которая будет принимать на вход число и на выход будет выводить сообщение четное число или нет.
 * 	Для определения четности числа используйет операцию получения остатка от деления - операция выглядит так: '% 2').
 */

public class Prog02EvenOdd {
    public static void main(String[] args) {
        String evenOdd = evenOddCheck(5);
        System.out.println(evenOdd);
    }

    public static String evenOddCheck(int number) {
        if (number % 2 == 0) {
            return "Число " + number + " - чётное";
        } else {
            return "Число " + number + " - нечётное";
        }
    }
}
