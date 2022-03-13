package ru.anbn.array;

public class CreateArray {


    // ЗАПОЛНЯЕМ ДВУМЕРНЫЙ МАССИВ И ВЫВОДИМ ЕГО НА ЭКРАН
    public static void main(String[] args) {
        int[][] myArray = new int[100][200];
        for (int i = 0; i < 100; i++) {
            for (int j = 1; j < 200; j++) {
                myArray[i][j] = (int) (100 * Math.random());
                printSymbol(i, j, myArray[i][j]);
            }
            System.out.println();
        }
    }

    static void printSymbol(int i, int j, int myArray) {
        if (myArray < 10) {
            if (i < 10) {
                System.out.print("Symbol[0" + i + "][" + j + "]" + "=0" + myArray + "  ");
            } else {
                System.out.print("Symbol[" + i + "][" + j + "]" + "=0" + myArray + "  ");
            }
        } else {
            if (i < 10) {
                System.out.print("Symbol[0" + i + "][" + j + "]" + "=" + myArray + "  ");
            } else {
                System.out.print("Symbol[" + i + "][" + j + "]" + "=" + myArray + "  ");
            }
        }

        System.out.println("Comment for commit.----------------");

    }

    static void printText() {
        int i = 4;
    }


}
