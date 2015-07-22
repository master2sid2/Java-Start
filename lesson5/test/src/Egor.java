/**
 * Created by Master on 7.22.2015.
 */
public class Egor {
    public static void main(String[] args){
        //Scanner scan = new Scanner(System.in);
        int a = 25;
        double b = 34;
        String c = "Что я тут забыл";
        transfIDS(c, a, b);
    }
    static void transfIDS( String c, int a, double b){
        System.out.print(c+b+a);
    }
}