/**
 * Created by Master on 8.10.2015.
 */
abstract class FileSystem {

    private final String NAME = "New items";
    private final boolean MARK = false;

    protected String name;
    protected int size;
    protected boolean mark;

    FileSystem(){
        this.name = NAME;
        this.mark = MARK;
    }

    FileSystem(String name){
        this.name=name;
        this.mark = MARK;
    }

    public FileSystem add(FileSystem fs){
        return this;
    }

    public FileSystem add(FileSystem... fs){
        return this;
    }

    public String getName(){
        return name;
    }

    public int getSize(){
        return size;
    }

    public void setName(String name){
        this.name = name;
    }
}
