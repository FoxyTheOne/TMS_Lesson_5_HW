package com.tms.arrayMulti;

/**
 * 1. Шахматная доска. Создать программу для раскладки шахматной доски с помощью цикла.
 * Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам циклам значения B(Black) или W(White).
 * Результат работы программы:
 * W  B  W  B  W  B  W  B
 * B  W  B  W  B  W  B  W
 * W  B  W  B  W  B  W  B
 * B  W  B  W  B  W  B  W
 * W  B  W  B  W  B  W  B
 * B  W  B  W  B  W  B  W
 * W  B  W  B  W  B  W  B
 * B  W  B  W  B  W  B  W
 */
public class Prog01ChessBoard {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8]; // 8 массивов по 8 ячеек

        for (int i = 0; i < chessBoard.length; i = i +2) {
            for (int j = 0; j < chessBoard[i].length; j = j + 2) {
                chessBoard[i][j] = "W";
            }
            for (int j = 1; j < chessBoard[i].length; j = j + 2) {
                chessBoard[i][j] = "B";
            }
        }
        for (int i = 1; i < chessBoard.length; i = i +2) {
            for (int j = 1; j < chessBoard[i].length; j = j + 2) {
                chessBoard[i][j] = "W";
            }
            for (int j = 0; j < chessBoard[i].length; j = j + 2) {
                chessBoard[i][j] = "B";
            }
        }

        // Выводим на экран итог заполнения массива
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
