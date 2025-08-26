import java.util.ArrayList;
import java.util.Iterator;
class Vector implements Iterable<Double>, Cloneable {
    private ArrayList<Double> coordinates;
    private int diamension;
    
    // default constructor
    public Vector() {
        this.coordinates = new ArrayList<>();
        this.diamension = 0;
    }
    // Parameterized constructor
    public Vector(ArrayList<Double> coordinates) {
        this.coordinates = new ArrayList<>(coordinates); // Deep Copy 
        this.diamension = coordinates.size();
    }

    // Getters and Setters
    public double get(int i) {
        return coordinates.get(i);
    }
    public void set(int i, double coord) {
        coordinates.set(i, coord);
    }
    public int length() {
        return coordinates.size();
    }

    // for addition of vectors
    public Vector add(Vector other) {
        if (this.length() != other.length()) {
            throw new IllegalArgumentException("Vectos cannot be added if the diamenstions are not the same");
        }
        Vector result = new Vector();

    //for loop to add corresponding elements
        for (int i = 0; i < this.length(); i++) {
            result.coordinates.add(this.get(i) + other.get(i));
        }
        return result;
    }

    // for subtraction of vectors
    public Vector Sub(Vector other) {
        if (this.length() != other.length()) {
            throw new IllegalArgumentException("Vectors cannot be subtracted if the dimensions are not the same");
        }
        Vector result = new Vector(); 
        for (int i = 0; i < this.length(); i++) {
            result.coordinates.add(this.get(i) - other.get(i));
        }
        return result;
    }

    // for cross product of vectors
    public Vector crossProduct(Vector other){
        if(this.length() != 3 || other.length() !=3){
            throw new IllegalArgumentException("Cross product can only be taken for 3 diamensional vectors");
        }
        if(this.length() != other.length()){
            throw new IllegalArgumentException("Vectors must also be the same diamension");
        }
        Vector result = new Vector();
        result.coordinates.add(this.get(1)*other.get(2) - this.get(2)*other.get(1));
        result.coordinates.add(this.get(2)*other.get(0) - this.get(0)*other.get(2));
        result.coordinates.add(this.get(0)*other.get(1) - this.get(1)*other.get(0));
        return result;
    }

    // for dot product of vectors
    public double dotProduct(Vector other) {
        if (this.length() != other.length()) {
            throw new IllegalArgumentException("Vectors cannot have dot product if the dimensions are not the same");
        }
        double result = 0;
        for (int i = 0; i < this.length(); i++) {
            result += this.get(i) * other.get(i);
        }
        return result;
    }

    // for cloning the vector
    public Vector clone() {
        return new Vector(new ArrayList<>(this.coordinates)); // deep copy
    }

    // for iterating through the vector elements
    public Iterator<Double> iterator() {
        return coordinates.iterator();
    }

    // for string representation of the vector
    public String toString() {
        return coordinates.toString();
    }

    // for checking equality of two vectors
    public boolean equals(Object o) {
        if (!(o instanceof Vector)) return false;
        Vector other = (Vector) o;
        return this.coordinates.equals(other.coordinates);
    }


}







   