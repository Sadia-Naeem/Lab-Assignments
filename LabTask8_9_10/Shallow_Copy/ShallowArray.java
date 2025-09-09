package LabTask8_9_10.Shallow_Copy;
import java.util.Arrays;
public class ShallowArray implements Cloneable {
    private int[] ShallowArray= {0,1,3,4,6};
    private int value;
    public ShallowArray() {
        ShallowArray = new int[]{0,1,3,4,6};
    }
    public void increment(int v) {
       for(int j=0; j<ShallowArray.length; j++) {
        if (j==v) {
            ShallowArray[j] = ShallowArray[j] + 1;
        }
       }
    }
    @Override
    public String toString() {
        return "Array"  + Arrays.toString(ShallowArray) ;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
       return super.clone();
    }
}
