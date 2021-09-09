package com.tms.array;

import java.util.Arrays;

/**
 *  6. Создайте массив строк. Заполните его произвольными именами людей.
 * 	Отсортируйте массив.
 * 	Результат выведите на консоль.
 */

public class Prog06ArrayOfNames {
    public static void main(String[] args) {
        String[] arrayOfNames = {"Дмитрий", "Эдуард", "Андрей", "Александр"};
        Arrays.sort(arrayOfNames); // Char с char сравнивается по алфавиту: A < B < D и т.д.
        System.out.println(Arrays.toString(arrayOfNames));
    }
}
