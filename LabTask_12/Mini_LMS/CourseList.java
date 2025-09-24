package Mini_LMS;
import java.util.ArrayList;

public class CourseList {
    private ArrayList<Course> courseList = new ArrayList<>();
    private int count;
    private int size;

public CourseList() {
    this.courseList= new ArrayList<>();
    this.size= 0;
    this.count= 0;
}

public CourseList(int size){
    this.size = size;
    this.courseList = new ArrayList<>();
    this.count = 0;
}

public void addCourse(Course course){
    if(count<size){
        courseList.add(course);
        count++;
        System.out.println("Course " + course + " added successfully");
    }
    else{
        System.out.println("Course List is full " + course + " cannot be added");
    }
}
public void removeCourse(Course course){
    for (int i = 0; i < count; i++) {
        if (courseList.get(i).getCode().equals(course.getCode())) {
            courseList.remove(i);
            count--;
            System.out.println("Course " + course+  " removed successfully");
            return;
        }
    }
    System.out.println("Course not found");
}
@Override
public String toString() {
    if (courseList.isEmpty()) {
        return "No courses enrolled";
    }

    String result = "";
    for (Course course : courseList) {
        result += course.toString();
    }
    return result;
}

}