/**
 * Created by Master on 8.10.2015.
 */
public class File extends FileSystem {

    private int size;
    private String type;

    public File(String name, int size){
        super(name);
        this.name = name;
        this.size = size;
        this.type = "File";
    }

    @Override
    public int getSize(){
        return this.size;
    }

    @Override
    public FileSystem add(FileSystem fs){
            throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("File{");
        sb.append("size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}
