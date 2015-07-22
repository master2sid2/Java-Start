import java.util.Random;

/**
 * Created by Master on 7.22.2015.
 */
public class MyArrayToString {
    public static void main (String[] args){

        Random rnd = new Random();
        int[] array = new int[rnd.nextInt(10)+1];
        for(int i = 0; i < array.length; i++){
            array[i]= rnd.nextInt(10)+1;
        }
        myToString(array);
    }

    static void myToString(int[] array){
        int num;
        StringBuilder str= new StringBuilder();
        System.out.print("[");
        for(int i = 0; i < array.length; i++){
            num = array[i];
                str.append(num).append(", ");
            }
        System.out.print(str.substring(0, str.length() - 2));
        System.out.print("]");
        }
    }

