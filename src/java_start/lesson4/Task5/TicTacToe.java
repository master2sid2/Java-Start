package java_start.lesson4.Task5;

import java.util.Scanner;

/**
 * * Написать игру «Крестики нолики» используя
 * двухмерные массивы.
 */
public class TicTacToe {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        char[][] field = new char[3][3];

        System.out.println("Координаты поля");
        printFieldCord();
        System.out.println("----------");
        fillFieldsNewGame(field);
        printField(field);

        int cord;
        char plChar;
        int[][] turnArr = new int[2][1];

        while (true) {

            if (turnArr[0][0] == 0)
                plChar = 'x';
            else plChar = 'o';

            System.out.println("Сейчас ход " + "\"" + plChar + "\"");
            System.out.println("Введите координату точки куда хотите поставить " + "\"" + plChar + "\"");

            cord = scn.nextInt();

            if (cord > 9 && cord < 9) {
                System.out.println("Неверный ввод");
                continue;
            } else {
                switch (cord) {
                    case 1:
                        caseTurn(turnArr, field, plChar, 0, 0);
                        break;
                    case 2:
                        caseTurn(turnArr, field, plChar, 0, 1);
                        break;
                    case 3:
                        caseTurn(turnArr, field, plChar, 0, 2);
                        break;
                    case 4:
                        caseTurn(turnArr, field, plChar, 1, 0);
                        break;
                    case 5:
                        caseTurn(turnArr, field, plChar, 1, 1);
                        break;
                    case 6:
                        caseTurn(turnArr, field, plChar, 1, 2);
                        break;
                    case 7:
                        caseTurn(turnArr, field, plChar, 2, 0);
                        break;
                    case 8:
                        caseTurn(turnArr, field, plChar, 2, 1);
                        break;
                    case 9:
                        caseTurn(turnArr, field, plChar, 2, 2);
                        break;
                    default:
                        System.out.println("0_o");
                        break;
                }
            }
            if (winGame(field)) {
                scn.close();
                System.out.println("Победил " + "\"" + plChar + "\"");
                break;
            } else if (turnArr[1][0] == 9) {
                scn.close();
                System.out.println("Ничья");
                break;
            }
        }
    }

    static void caseTurn(int[][] turnArr, char[][] array, char c, int x, int y) {
        if (array[x][y] != '.') {
            System.out.println("Тут занято, сюда ставить нельзя!");
        } else {
            printFieldCord();
            System.out.println("----------");
            array[x][y] = c;
            printField(array);
            placeSymbol(turnArr);
        }
    }

    static void placeSymbol(int[][] turnArr) {
        if (turnArr[0][0] == 1)
            turnArr[0][0] = 0;
        else turnArr[0][0] = 1;
        turnArr[1][0] += 1;
    }

    static void fillFieldsNewGame(char[][] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++) {
                array[i][j] = '.';
            }
    }

    static int[][] printFieldCord() {
        int[][] array = new int[3][3];
        int num = 1;
        for (int i = 0; i < array.length; i++) {
            int[] anArray = array[i];
            for (int j = 0; j < array.length; j++) {
                anArray[j] = num++;
                System.out.print(anArray[j] + "\t");
            }
            System.out.println();
        }
        return array;
    }

    static void printField(char[][] array) {
        for (char[] anArray : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(anArray[j] + "\t");
            }
            System.out.println();
        }
    }

    static boolean winGame(char[][] array) {
        boolean winStatus = false;
        for (int i = 0; i < 3; i++) {
            if (array[i][0] == array[i][1] && array[i][1] == array[i][2]
                    && array[i][0] != '.') {
                winStatus = true;
                break;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (array[0][i] == array[1][i] && array[1][i] == array[2][i]
                    && array[0][i] != '.') {
                winStatus = true;
                break;
            }
        }
        if (array[0][0] == array[1][1] && array[1][1] == array[2][2]
                && array[0][0] != '.')
            winStatus = true;
        if (array[0][2] == array[1][1] && array[1][1] == array[2][0]
                && array[0][2] != '.')
            winStatus = true;

        return winStatus;
    }
}
