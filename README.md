Lab Task 04 – Cuddly Toy parent and child class

Objective:
To practice inheritance, abstract classes, method overriding, and constructors in Java by modeling different cuddly toys.

UML Overview:
	•	CuddlyToy (abstract class)
	•	Fields: size, color, job
	•	Methods: show(), describe(), makeNoise() (abstract), plus constructor.
	•	Teddy and Bunny extend CuddlyToy
	•	Override makeNoise() and describe().
	•	EngineDriver and Gardener extend Teddy with fixed color/job.
	•	Clown and BankManager extend Bunny with fixed color/job.


 Lab Task 05 – Triangle Class

Objective:
To practice constructor overloading, static variables, method overloading, and basic geometry calculations.

UML Overview:
	•	Triangle
	•	Fields: sideA, sideB, sideC, objectCounter (static)
	•	Multiple constructors:
	•	No parameters → all sides 1.0
	•	1 parameter → all sides equal to that value
	•	2 parameters → sideA, sideB set, sideC default
	•	3 parameters → all sides set
	•	Copy constructor
	•	Methods:
	•	Getters and setters for each side
	•	objectCount() → returns number of Triangle objects made
	•	perimeter() → calculates total length
	•	isRightAngled() → checks using Pythagoras theorem
	•	toString() → returns sides as text
