package Week_11;
public class Int3 extends Int2 {
    int j;

    public Int3(int i) {
        super(i);
        this.j = i;
    }
     @Override
    public Object clone() throws CloneNotSupportedException {
        Int3 cloned = (Int3) super.clone();
        cloned.j = this.j;
        return cloned;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

