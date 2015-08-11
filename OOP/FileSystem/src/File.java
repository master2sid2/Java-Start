/**
 * Created by Master on 8.10.2015.
 */
public class File extends FileSystem {

    public File(String name, int size){
        super(name,size);
        this.name = name;
        this.size = size;
        this.type = "File";
        this.mark = false;
    }

    @Override
    public int getSize(){
        return size;
    }

    @Override
    public void putData(FileSystem fs){
            throw new UnsupportedOperationException();
    }
}
