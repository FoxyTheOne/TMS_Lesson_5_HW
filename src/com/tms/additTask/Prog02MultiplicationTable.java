package com.tms.additTask;

/**
 * 2. Напишите программу, которая выводит на консоль таблицу умножения
 */

public class Prog02MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {
            for (int secondNumber = 2; secondNumber < 11; secondNumber++) {
                int result = i * secondNumber;
                System.out.println(i + " * " + secondNumber + " = " + result);
            }
            System.out.println(" ");
        }
    }
}
