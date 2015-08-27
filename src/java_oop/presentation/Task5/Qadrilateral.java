package java_oop.presentation.Task5;

/**
 * Created by Master on 8.7.2015.
 */
public class Qadrilateral {

    private int heightX;
    private int heightY;
    private int widthX;
    private int widthY;

    public void square() {
        int height = this.heightX;
        int width = height;

    }

    public void rectangle(int heightX, int widthX) {

    }

    public void rhomb (int heightX) {

    }

    public void arbitrary (int heightX, int heightY, int widthX, int widthY) {

    }

    public int area () {
        int area;
      area = getHeightX() * getHeightY() * getHeightY() * getWidthY();

        return area;
    }

    public int getHeightX() {
        return heightX;
    }

    public void setHeightX(int heightX) {
        this.heightX = heightX;
    }

    public int getHeightY() {
        return heightY;
    }

    public void setHeightY(int heightY) {
        this.heightY = heightY;
    }

    public int getWidthX() {
        return widthX;
    }

    public void setWidthX(int widthX) {
        this.widthX = widthX;
    }

    public int getWidthY() {
        return widthY;
    }

    public void setWidthY(int widthY) {
        this.widthY = widthY;
    }
}
