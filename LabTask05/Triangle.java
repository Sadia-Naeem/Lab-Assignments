package LabTask05;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    private static int objectCounter= 0;
    
    // default construsctor with all sides equal to 1.0
    public Triangle() {
        this.sideA = 1.0;
        this.sideB = 1.0;
        this.sideC = 1.0;
        objectCounter++;
    }
    // constructors with all sides equal to sideA
    public Triangle(double sideA) {
        this.sideA = sideA;
        this.sideB = sideA;
        this.sideC = sideA;
        objectCounter++;
    }
    // constructor with sideA and sideB equal but sideC different
    public Triangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideA;
        this.sideC = sideB;
        objectCounter++;
    }

    // constructor with all sides different
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        objectCounter++;
    }
    // copy constructor for clone triangle
    public Triangle(Triangle other) {
        this.sideA = other.sideA;
        this.sideB = other.sideB;
        this.sideC = other.sideC;
        objectCounter++;
    }
    //getters of all sides
    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }
    //setters of all sides
    public void setSideA(double a) {
        this.sideA = a;
    }
    public void setSideB(double b) {
        this.sideB = b;
    }
    public void setSideC(double c) {
        this.sideC = c;
    }
    // static method for number of create objects
    public static int getObjectCounter() {
        return objectCounter;
    }
    // method to calculate perimeter of triangle
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
    // method to check if triangle is right angle
    public boolean isRightAngled() {
        double a2 = sideA * sideA;
        double b2 = sideB * sideB;
        double c2 = sideC * sideC;
        double max= 0.0001;

    return (
            Math.abs((a2 + b2) - c2) < max ||
            Math.abs((a2 + c2) - b2) < max ||
            Math.abs((b2 + c2) - a2) < max );
    }

    @Override
    public String toString() {
        return "Triangle sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC;
                
    }
}
