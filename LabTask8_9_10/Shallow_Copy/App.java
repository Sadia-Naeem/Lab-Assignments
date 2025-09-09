package LabTask8_9_10.Shallow_Copy;
public class App {
    public static void run() {
        ShallowArray v1 = new ShallowArray();
        try {
            ShallowArray v2 = (ShallowArray) v1.clone();
            System.out.println("Original: " + v1);
            System.out.println("Cloned: " + v2);

            v1.increment(1); 

            System.out.println("After changing v1:");
            System.out.println("Original: " + v1);
            System.out.println("Cloned: " + v2);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
    }
}

