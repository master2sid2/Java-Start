/**
 * Created by Master on 8.10.2015.
 */
public class Directory extends FileSystem {

    public Directory(String name){
        this.name = name;
        this.size = 0;
        this.type = "Directory";
    }

    public Directory(){
        this.size = 0;
        this.type = "Directory";
    }

    @Override
    public int getSize(){
        return size;
    }

    @Override
    public void putData(FileSystem fs){
        if (this == fs){
            throw new UnsupportedOperationException();
        }
        size += fs.getSize();


    }
}