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

        root.add(dir1.add(f1,f2)).add(dir2.add(f4).add(dir3.add(f3))).add(f5);

/*        root.add(dir1.add(f1,f2)).add(dir2.add(f4)).add(f5);
        dir2.add(dir3);
        dir3.add(f3);*/

        System.out.println("Размер директории Root: " + root.getSize() + "B");
        System.out.println("Размер директории dir1: " + dir1.getSize() + "B");
        System.out.println("Размер директории dir2: " + dir2.getSize() + "B");
        System.out.println("Размер директории dir3: " + dir3.getSize() + "B");
    }
}
