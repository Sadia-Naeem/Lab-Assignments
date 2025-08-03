package LabTask05;

public class TriangleMain {
    public static void main(String[] args) {
        // Create instances of Triangle using different constructors
        Triangle t1= new Triangle(); 
        Triangle t2= new Triangle(3.4);
        Triangle t3= new Triangle(4.0,6.0); 
        Triangle t4= new Triangle(2.0, 3.5, 4.0);
        Triangle t5= new Triangle(t4); 

        // printing all information of each triangle
        System.out.println("Triangle 1: " + t1);
        System.out.println("Triangle 2: " + t2);
        System.out.println("Triangle 3: " + t3);
        System.out.println("Triangle 4: " + t4 + ", Perimeter: " + t4.getPerimeter() + ", Is Right Angled: " + t4.isRightAngled());
        System.out.println("Triangle 5: " + t5);
        System.out.println("Total number of Triangle objects created: " + Triangle.getObjectCounter());



 }
}