package java_oop.file_system;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Master on 8.28.2015.
 */
public class Directory extends FileSystem {

    List<FileSystem> list = new ArrayList<>();
    private String type;

    public Directory(String name) {
        this.name = name;
        this.type = "Directory";
    }

    public Directory() {
        this.name = "New folder";
        this.type = "Directory";
    }

    public int getSize() {
        size = 0;
        for (FileSystem aList : list) {
            size += aList.getSize();
        }
        return size;
    }

    @Override
    public FileSystem add(FileSystem fs) {
        if (this == fs || fs == null || fs.mark) {
            throw new UnsupportedOperationException();
        }
        fs.mark = true;
        list.add(fs);
        return this;
    }

    @Override
    public FileSystem add(FileSystem... fs) {
        for (FileSystem x : fs) {
            if (this == x || x == null || x.mark) {
                throw new UnsupportedOperationException();
            }
            x.mark = true;
            list.add(x);
        }
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Directory{");
        sb.append("size=").append(this.size);
        sb.append(", type='").append(type).append('\'');
        sb.append(", mark=").append(this.mark);
        sb.append('}');
        return sb.toString();
    }
}
