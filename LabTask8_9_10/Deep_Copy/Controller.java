package LabTask8_9_10.Deep_Copy;

public class Controller {
    public static void run() {
        Array v1 = new Array();
        try {
            Array v2 = (Array) v1.clone();
            System.out.println("Original: " + v1);
            System.out.println("Cloned: " + v2);

            v1.increment(0); // chnage original to show deep copy
            System.out.println("After changing v1:");
            System.out.println("Original: " + v1);
            System.out.println("Cloned: " + v2);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
    }
}
