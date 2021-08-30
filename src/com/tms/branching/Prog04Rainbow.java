package com.tms.branching;

/**
 * 4. По введенному номеру определить цвет радуги (1 –
 * 	красный, 4 – зеленый и т. д.)
 */

public class Prog04Rainbow {
    public static void main(String[] args) {
        int colorNumber = 8;
        String color;

        switch (colorNumber) {
            case 1:
                color = "Красный цвет радуги";
                break;
            case 2:
                color = "Оранжевый цвет радуги";
                break;
            case 3:
                color = "Желтый цвет радуги";
                break;
            case 4:
                color = "Зелёный цвет радуги";
                break;
            case 5:
                color = "Голубой цвет радуги";
                break;
            case 6:
                color = "Синий цвет радуги";
                break;
            case 7:
                color = "Фиолетовый цвет радуги";
                break;
            default:
                color = "Цвета в радуге закончились";
                break;
        }

        System.out.println(color);
    }
}
