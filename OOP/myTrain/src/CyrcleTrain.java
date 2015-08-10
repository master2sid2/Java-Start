import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Master on 8.10.2015.
 */
public class CyrcleTrain implements Train{

    private ArrayList<Wagon> list;
    private ArrayList<Integer> tmpList = new ArrayList<Integer>();
    private int step = 0;

    CyrcleTrain(int lenght) {
        if(lenght < 0 || lenght == 0) {
            throw new IllegalArgumentException();
        }
        Random rnd = new Random();
        list = new ArrayList<Wagon>();
        for( int i = 0; i < lenght; i++) {
            Wagon wagon = new Wagon();
            wagon.setLampOn(rnd.nextBoolean());
            list.add(wagon);
        }
    }

    private class Wagon {
        private boolean lampOn;

        public boolean isLampOn() {
            return lampOn;
        }

        public void setLampOn(boolean lampOn) {
            this.lampOn = lampOn;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < list.size(); i++){
            Wagon wagon = list.get(i);
            sb.append(wagon.isLampOn());
            sb.append("][");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    @Override
    public void turnLeft() {
        for (int i = step; 0 <= i; i--){
            if(list.get(i).lampOn){
               turnRight();
            } else
            break;
        }
    }

    @Override
    public void turnRight() {
        for(int i = 1; i < list.size(); i++){
            tmpList.add(i);
            if(!list.get(i).lampOn){
                step = i;
                break;
            }
        }
    }

    @Override
    public void lightOn() {
        if(!list.get(step).isLampOn())
        list.get(step).lampOn = true;
    }

    @Override
    public void lightOff() {
        if(list.get(step).isLampOn())
            list.get(step).lampOn = false;
    }

    @Override
    public boolean isLightOn() {
        return list.get(step).lampOn;
    }

    @Override
    public boolean isLength(int expectedLength) {
        return expectedLength == list.size();
    }

    public int getStep() {
        int max = 0;
        for (int i = 0; i < tmpList.size(); i++){
            if(max<tmpList.get(i)){
                max = tmpList.get(i);
            }
        }
        return max+1;
    }
}