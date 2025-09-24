package Mini_LMS;

public class Main {
    public static void main(String[] args) {
        // Make Courses
        Course course1 = new Course("OOP", "352");
        Course course2 = new Course("Discrete Math", "358");
        Course course3 = new Course("Linear Algebra", "356");
        Course course4 = new Course("DLD", "354");

        // CourseList with size 4
        CourseList courseList = new CourseList(4);
        courseList.addCourse(course1);
        courseList.addCourse(course2);
        courseList.addCourse(course3);
        courseList.addCourse(course4);

        System.out.println("\nAll Courses:");
        courseList.toString();

        // Remove and add new courses
        courseList.removeCourse(course2);
        courseList.addCourse(new Course("Ideology", "362"));

        System.out.println("\nCourses after updates:");
        courseList.toString();

        //Make Students
        Student student1 = new Student("Aliza", "001", 3);
        Student student2 = new Student("Zara", "002", 2);
        Student student3 = new Student("Mirha", "003", 2);
        Student student4 = new Student("Maryam", "004", 1);

        // Make StudentList
        StudentList studentList = new StudentList();
        studentList.addStudent(student1);
        studentList.addStudent(student2);
        studentList.addStudent(student3);
        studentList.addStudent(student4);

        System.out.println("\nAll Students:");
        studentList.displayAllStudents();

        // Enroll and Drop courses methods
        System.out.println("\nCourse Enrollment:");
        student1.enrollCourse(course1);
        student1.enrollCourse(course3);

        student2.dropCourse(course1); 
        student2.enrollCourse(course4);

        student3.enrollCourse(course2); 
        student3.enrollCourse(course3);

        System.out.println("\nStudents after course enrollment:");
        studentList.displayAllStudents();

        //Search student if in class
        System.out.println("\nSearching student with seat no 002:");
        studentList.searchStudent("002");

        //Remove student
        System.out.println("Removing Mirha:");
        studentList.removeStudent(student3);

        System.out.println("\nFinal Student List:");
        studentList.displayAllStudents();
    }
}