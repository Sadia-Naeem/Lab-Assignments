package Week_11;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
    Int2 x = new Int2(10);
    Int2 x2 = (Int2)x.clone();
    x2.increment();
    System.out.println("x is " + x+ " and clone x2 is " + x2);

    // Anything inherited is also cloneable
    Int3 x3 = new Int3(20);
    Int3 x4 = (Int3)x3.clone();
    x4.increment();
    System.out.println("x3 is " + x3 + " and clone x4 is " + x4);

    // Clone an ArrayList of Int2
    ArrayList v = new ArrayList();
    for (int i = 0; i < 5; i++) {
        v.add(new Int2(i));
    }
    System.out.println("v: " + v);

    ArrayList v2 = (ArrayList)v.clone();
    // Now clone each element
    for (int i = 0; i < v.size(); i++) {
        v2.set(i, ((Int2)v2.get(i)).clone());
    }

    // Increment all v2's elements
    for (Iterator e = v2.iterator(); e.hasNext();) {
        ((Int2)e.next()).increment();
    }

    // See if it changed v's elements
    System.out.println("Arraylist v: " + v);
    System.out.println("Clone Arraylist v2: " + v2);
}
}
