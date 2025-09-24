package Mini_LMS;
import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getSeatNo().equals(student.getSeatNo())) {
                studentList.remove(i);
                System.out.println("Student removed successfully: " + student.getName());
                return;
            }
        }
        System.out.println("Student not found: " + student.getSeatNo());
    }

    public void searchStudent(String seatNo) {
        for (Student student : studentList) {
            if (student.getSeatNo().equals(seatNo)) {
                System.out.println("Student found: " + student);
                return;
            }
        }
        System.out.println("Student not found with seat no: " + seatNo);
    }

    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students enrolled yet.");
            return;
        }
        System.out.println("Student List:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}