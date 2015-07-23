import java.util.Scanner;

/**
 * Created by Master on 7.23.2015.
 */
public class Draw {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите символ");
        String chTmp = scn.nextLine();
        char ch = chTmp.charAt(0);
        System.out.println("Введите нечётное число:");
        int size = scn.nextInt();
        if(size%2==0){
            size+=1;
        }

        draw(size,ch);

    }

    static void draw(int size, char ch) {

        char[][] c = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == size/2 || j == size/2 || j == size / 2 - i || j == size / 2 + i || j == i - size / 2 ||
                j == size - i + size / 2 - 1)
               // if (j == size / 2 - i || j == size / 2 + i || j == i - size / 2 || j == size - i + size / 2 - 1)
                {
                    c[i][j] = ch;
                } else {
                    c[i][j] = ' ';
                }
            }
        }

        for (char[] anArray : c) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(anArray[j] + " ");
            }
            System.out.println(" ");
        }
    }
}

