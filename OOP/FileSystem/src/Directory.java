import java.util.ArrayList;
import java.util.List;

/**
 * Created by Master on 8.10.2015.
 */
public class Directory extends FileSystem  {

    List<FileSystem> list = new ArrayList<>();

    public Directory(String name){
        this.name = name;
        this.size = 0;
        this.type = "Directory";
        this.mark = false;
    }

    public Directory(){
        this.size = 0;
        this.type = "Directory";
        this.mark = false;
    }

    @Override
    public int getSize(){
        size = 0;
        for(FileSystem aList : list){
            size += aList.getSize();
        }
        return size;
    }

    @Override
    public void putData(FileSystem fs){
        if (this == fs){
            throw new UnsupportedOperationException();
        }
        if(fs.mark){
            throw new UnsupportedOperationException();
        }
        fs.mark = true;
        list.add(fs);
    }
}