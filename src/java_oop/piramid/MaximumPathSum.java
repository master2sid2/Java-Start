package java_oop.piramid;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MaximumPathSum {
    public static final String FILE_NAME = "src/java_oop/piramid/triangle.txt";

    public static void main(String[] args) {
        try {
            int[][] triangle = readTriangle(FILE_NAME);

            int result = findMaximumPathSum(triangle);

            findPath(triangle);

            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int findMaximumPathSum(int[][] triangle) {
        // Your code!!!

        return 0;
    }

    public static int[] findPath(int[][] triangle) {
        ArrayList<Integer> array = new ArrayList<>();

        int max = 0;
        int startIndx = 0;
        int indx = 0;

        for (int i = 0; i < 99; i++){
            if(max < triangle[99][i] ) {
                max = triangle[99][i];
                startIndx = i;
            }
        }

        for(int i = triangle.length-2; 0 <= i; i++){

        }


        for(int i = triangle.length-1; 0 <= i; i--){
            for(int j = 0; j < triangle[i].length; j++){
                if(max < triangle[i][j]) {
                    max = triangle[i][j];
                    indx = j;
                }
            }
           array.add(indx);
            max = 0;
        }

        int[] indxArray = {array.size()};
        for(int i = 0; i < indxArray.length-1; i++) {
            indxArray[i] = array.get(i);
        }
        return indxArray;
    }

    public static int[][] readTriangle(String fileName) throws IOException {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            int rows = scanner.nextInt();
            int[][] triangle = new int[rows][];

            for (int row = 0; row < rows; row++) {
                triangle[row] = readArray(scanner, row + 1);
            }

            return triangle;
        }
    }

    private static int[] readArray(Scanner scanner, int elemsQuantity) {
        int[] array = new int[elemsQuantity];

        for (int i = 0; i < elemsQuantity; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }
}