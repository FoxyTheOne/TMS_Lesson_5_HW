package com.tms.branching;

/**
 * 1. Написать программу для вывода названия поры года по номеру месяца.
 * 	При решении используйте оператор if-else-if.
 */

public class Prog01SeasonTime {
    public static void main(String[] args) {
        int month = 111;

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Пора года - зима.");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Пора года - весна.");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Пора года - лето.");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Пора года - осень.");
        } else {
            System.out.println("Не знаем такого месяца.");
        }
    }
}
