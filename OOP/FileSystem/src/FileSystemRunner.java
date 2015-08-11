import java.util.ArrayList;
import java.util.List;

/**
 * Created by Master on 8.10.2015.
 */
public class FileSystemRunner {
    public static void main(String[] args) {

        FileSystem root = new Directory("Root");
        FileSystem dir1 = new Directory("dir1");
        FileSystem dir2 = new Directory("dir2");
        FileSystem dir3 = new Directory("dir3");
        FileSystem f1 = new File("f1",10);
        FileSystem f2 = new File("f2",20);
        FileSystem f3 = new File("f3",30);
        FileSystem f4 = new File("f4",40);
        FileSystem f5 = new File("f5",50);

        dir1.putData(f1);
        dir1.putData(f2);
        dir3.putData(f3);
        dir2.putData(f4);
        dir2.putData(dir3);
        root.putData(dir1);
        root.putData(dir2);
        root.putData(f5);

        System.out.println("Размер директории Root: " + root.getSize() + "B");
        System.out.println("Размер директории dir1: " + dir1.getSize() + "B");
        System.out.println("Размер директории dir2: " + dir2.getSize() + "B");
        System.out.println("Размер директории dir3: " + dir3.getSize() + "B");
    }
}
