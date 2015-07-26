import java.util.Arrays;

/**
 * Created by Master on 7.27.2015.
 */
public class ChangeWords {
    public static void main(String[] args){

        String str = "word1 word2 word3";

        System.out.println(str);
        System.out.println(change(str));

    }

    static StringBuilder change(String s){

        String[] array = s.split(" ");
        StringBuilder str = new StringBuilder();
        String tmpStr;
        tmpStr = array[array.length-1];
        array[array.length-1] = array[0];
        array[0] = tmpStr;
        for(int i = 0; i < array.length; i++){
            str.append(array[i]).append(" ");
        }
        return str;
    }
}
