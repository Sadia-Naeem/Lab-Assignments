import java.util.*;

public class VectorMain {
    public static void main(String[] args) {
        ArrayList<Double> coords1 = new ArrayList<>(Arrays.asList(4.0, 5.0, 3.0));
        ArrayList<Double> coords2 = new ArrayList<>(Arrays.asList(2.4, 1.1, 1.9));
        
        Vector vector1 = new Vector(coords1);
        Vector vector2 = new Vector(coords2);

        Vector sum = vector1.add(vector2);
        System.out.println("Sum of vector1 and vector2: " + sum);

        Vector sub = vector1.Sub(vector2);
        System.out.println("Subtraction of vector1 and vector2: " + sub);

        //dot product of vector 1 and vector 2
        System.out.println("Dot Product: " + vector1.dotProduct(vector2));

        //cross product of vector 1 and vector 2
        System.out.println("Cross Product of Vector1 and Vector2:" + vector1.crossProduct(vector2));

        // Test clone
        Vector cloneVector = vector1.clone();
        System.out.println("Clone of Vector1: " + cloneVector);

        // Modify vector1 using set()
        vector1.set(0, 4.1); // changes first coordinate from 4.0 to 4.1
        System.out.println("Updated Vector1: " + vector1);

        // Check equality
        System.out.println("Vector1 equals Vector2: " + vector1.equals(vector2));

        // Iterating over elements of vector2
        System.out.print("Iterating Vector2: ");
        for (double coord : vector2) {
            System.out.print(coord + " ");
        }
        System.out.println();
        //to string method on vector1   
        System.out.println("String of coordinates of vector1 " + vector1.toString());
    }

}
