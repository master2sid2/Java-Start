import java.util.Objects;

/**
 * Created by Master on 8.10.2015.
 */
abstract class FileSystem {

    private final String NAME = "New items";
    private final String TYPE = "";
    private final int SIZE = 0;

    protected String name;
    protected int size;
    protected String type;

    FileSystem(){
        this.name = NAME;
        this.size = SIZE;
        this.type = TYPE;
    }

    FileSystem(String name){
        this.name=name;
        this.size=SIZE;
        this.type=TYPE;
    }

    FileSystem(String name,int size){
        this.name=name;
        this.size=size;
        this.type=TYPE;
    }

    public void putData(Object fs){

    }

    public String getName(){
        return name;
    }

    public int getSize(){
        return size;
    }

    public String getType(){
        return type;
    }

    public void setName(String name){
        this.name = name;
    }

}
