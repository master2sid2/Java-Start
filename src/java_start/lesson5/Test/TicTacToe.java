package java_start.lesson5.Test;

import java.util.Scanner;

/**
 * Created by Master on 8.4.2015.
 */
public class TicTacToe {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Игрок назовись!");
        String firstPlayer = scan.nextLine();
        System.out.println("Тебя это тоже касается!");
        String secondPlayert = scan.nextLine();
        System.out.println("-------------------------------------");
        System.out.print("В красном углу ринга: " + firstPlayer + ", Играет \"X\"" + "\n");
        System.out.print("В зеленом углу ринга: " + secondPlayert + ", Играет \"0\"" + "\n");
        System.out.println("-------------------------------------");

        char[][] board = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        gameBoard(board);

        int step;
        int hod = 0;
        char mark;
        int round = 0;

        while (true) {

            if (hod == 1) {
                System.out.println("Ходит " + firstPlayer + " , играющий за \"X\"");
                mark = 'X';
                step = scan.nextInt();
                // while (mark == )

                while (step <= 0 || step > 9) {
                    System.out.println("Вы походили как рагуль, сделайте другой выбор");
                    gameBoard(board);
                    step = scan.nextInt();
                }

                gameStep(round, mark, step, board);
                gameBoard(board);
                System.out.println(round);
                if (checkWin(mark, board)) {
                    break;
                } else if (round == 9) {
                    System.out.println("Биба и боба - победила дружба!");
                    break;
                }

                hod = 2;

            } else {
                System.out.println("Ходит " + secondPlayert + " , играющий за \"O\"");
                mark = 'O';
                step = scan.nextInt();
                while (step <= 0 || step > 9) {
                    System.out.println("Вы походили как рагуль, сделайте другой выбор");
                    gameBoard(board);
                    step = scan.nextInt();
                }
                gameStep(round, mark, step, board);
                gameBoard(board);
                checkWin(mark, board);
                if (checkWin(mark, board)) {
                    break;
                } else if (round == 8) {
                    System.out.println("Биба и боба - победила дружба!");
                    break;
                }
                hod = 1;
            }
            //++round;
        }
    }

    static void gameBoard(char[][] array) {
        System.out.println("Игровое поле:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("  " + array[i][j]);
            }
            System.out.println();

        }
        System.out.println("-------------------------------------");
    }

    static int gameStep(int round, char mark, int step, char[][] array) {

        //round = 0;
        switch (step) {
            case 1:
                if (array[0][0] != '1') {
                    System.out.print("Занято!");
                    break;
                } else {
                    array[0][0] = mark;
                    round++;
                }
                break;
            case 2:
                if (array[0][1] != '2') {
                    System.out.print("Занято!");
                    break;
                } else {
                    array[0][1] = mark;
                    round++;
                }
                break;
            case 3:
                if (array[0][2] != '3') {
                    System.out.print("Занято!");
                    break;
                } else {
                    array[0][2] = mark;
                    round++;
                }
                break;
            case 4:
                if (array[1][0] != '4') {
                    System.out.print("Занято!");
                    break;
                } else {
                    array[1][0] = mark;
                    round++;
                }
                break;
            case 5:
                if (array[1][1] != '5') {
                    System.out.print("Занято!");
                    break;
                } else {
                    array[1][1] = mark;
                    round++;
                }
                break;
            case 6:
                if (array[1][2] != '6') {
                    System.out.print("Занято!");
                    break;
                } else {
                    array[1][2] = mark;
                    round++;
                }
                break;
            case 7:
                if (array[2][0] != '7') {
                    System.out.print("Занято!");
                    break;
                } else {
                    array[2][0] = mark;
                    round++;
                }
                break;
            case 8:
                if (array[2][1] != '8') {
                    System.out.print("Занято!");
                    break;
                } else {
                    array[2][1] = mark;
                    round++;
                }
                break;
            case 9:
                if (array[2][2] != '9') {
                    System.out.print("Занято!");
                    break;
                } else {
                    array[2][2] = mark;
                    round++;
                }
                break;
            default:
                System.out.println("Ты явно что то сломал");
                break;
        }
        return round;

    }

    static boolean checkWin(char mark, char[][] array) {
        boolean win = false;
        if ((array[0][0] == mark && array[0][1] == mark && array[0][2] == mark)
                || (array[1][0] == mark && array[1][1] == mark && array[1][2] == mark)
                || (array[2][0] == mark && array[2][1] == mark && array[2][2] == mark)
                || (array[0][0] == mark && array[1][0] == mark && array[2][0] == mark)
                || (array[0][1] == mark && array[1][1] == mark && array[2][1] == mark)
                || (array[0][2] == mark && array[1][2] == mark && array[2][2] == mark)
                || (array[0][0] == mark && array[1][1] == mark && array[2][2] == mark)
                || (array[0][2] == mark && array[1][1] == mark && array[2][0] == mark)) {

            System.out.println("Победил " + mark);
            win = true;

        }
        return win;
    }
}
