package com.tms.loop;

/**
 * 0. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
 * 	При решении используйте оперцию инкремента (++).
 */

public class Prog00OddNumbers {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                continue; // Если число чётное - не печатаем и возвращаемся в начало цикла
            }
            System.out.println(i);
        }

    }
}
