package Mini_LMS;

public class Student {
    private String name;
    private String seatNo;
    private CourseList courses; 

    // Constructor
    public Student(String name, String seatNo, int noOfCourses) {
        this.name = name;
        this.seatNo = seatNo;
        this.courses = new CourseList(noOfCourses); // initialize course list
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public CourseList getCourses() {
        return courses;
    }

    // Enroll in a course
    public boolean enrollCourse(Course course) {
        courses.addCourse(course);
        return true;
    }

    // Drop a course
    public boolean dropCourse(Course course) {
        courses.removeCourse(course);
        return true;
    }

    @Override
    public String toString() {
        return "Student Name: " + name 
             + ", Seat No: " + seatNo 
             + "\nEnrolled Courses:\n" + courses.toString();
    }
}
// package Mini_LMS;
// public class Student {
//     private String name;
//     private String seatNo;
//     private CourseList courses; 

//     // Constructor
//     public Student(String name, String seatNo, int NoOfCourses) {
//         this.name = name;
//         this.seatNo = seatNo;
//         this.courses = new CourseList(NoOfCourses);
//     }

//     // Setters
//     public void setName(String name) {
//         this.name = name;
//     }

//     public void setSeatNo(String seatNo) {
//         this.seatNo = seatNo;
//     }

//     // Getters
//     public String getName() {
//         return name;
//     }

//     public String getSeatNo() {
//         return seatNo;
//     }

//     public CourseList getCourses() {
//         return courses;
//     }

//     // Enroll in a course
//     public boolean enrollCourse(Course course) {
//         courses.addCourse(course);
//         return true;
//     }

//     // Drop a course
//     public boolean dropCourse(Course course) {
//         courses.removeCourse(course);
//         return true;
//     }

//     @Override
//     public String toString() {
//         return "Student Name: " + name + ", Seat No: " + seatNo + ", Enrolled Courses: " + courses.toString();
    
//    }
// }
