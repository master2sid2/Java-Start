
/**
 * Created by Master on 7.23.2015.
 */
public class MyArrayEquals {
    public static void main(String[] args){

        short[] arraySource = {15,-56,555,-1347,234};
        short[] arrayTarget = {15,-56,555,-1347,234};

        System.out.println(myEquals(arraySource,arrayTarget));
    }

    static boolean myEquals(short[] arraySource,short[] arrayTarget){
        boolean bool = true;
        for (int i=0; i<arraySource.length; i++)
            if (arraySource[i] != arrayTarget[i])
                return false;
        return bool;
    }
}
