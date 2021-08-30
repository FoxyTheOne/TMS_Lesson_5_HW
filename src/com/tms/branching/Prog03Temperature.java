package com.tms.branching;

/**
 * 3. Для введенного числа t (температура на улице) вывести
 * 	Если t>–5, то вывести «Тепло».
 * 	Если –5>= t > –20, то вывести «Нормально».
 * 	Если –20>= t, то вывести «Холодно».
 */

public class Prog03Temperature {
    public static void main(String[] args) {
        int t = 0;

        if (t > -5) {
            System.out.println("Тепло");
        } else if (-5 >= t && t > -20) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
    }
}
