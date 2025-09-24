package Week_11;
public class Int2 implements Cloneable {
    private int i;

    public Int2(int i) {
        this.i = i;
    }
    public void increment() {
        this.i++;
    }
    @Override
    public String toString() {
        return Integer.toString(i);
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
