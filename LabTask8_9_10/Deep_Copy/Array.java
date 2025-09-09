package LabTask8_9_10.Deep_Copy;
import java.util.Arrays;
public class Array implements Cloneable {
    private int[] Array;
    private int index;

    public Array() {
      Array = new int[]{1,2,3,4,5};
    }
     public void increment(int i) {
        for(int j=0;j<Array.length;j++) {
            if(j==i) {
                Array[j]=Array[j]+1;
            }
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Array cloned = (Array) super.clone();
        cloned.Array = Array.clone(); // Deep copy of the array
        return cloned;
    }
    @Override
    public String toString() {
        return "Array"  + Arrays.toString(Array) ;
    }
}
