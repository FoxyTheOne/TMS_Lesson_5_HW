package com.tms.branching;

/**
 * Управляющие конструкции
 *
 * 0. Написать программу для вывода названия поры года по номеру месяца.
 * При решении используйте оператор switch-case.
 */

public class Prog00SeasonTime {
    public static void main(String[] args) {
        int month = getMonth();
        String seasonTime;

        switch (month) {
            case 12:
            case 1:
            case 2:
                seasonTime = "Пора года - зима.";
                break;
            case 3:
            case 4:
            case 5:
                seasonTime = "Пора года - весна.";
                break;
            case 6:
            case 7:
            case 8:
                seasonTime = "Пора года - лето";
                break;
            case 9:
            case 10:
            case 11:
                seasonTime = "Пора года - осень";
                break;
            default:
                seasonTime = "Не знаем такого месяца.";
                break;
        }

        System.out.println(seasonTime);
    }

    public static int getMonth() {
        return 111;
    }
}
