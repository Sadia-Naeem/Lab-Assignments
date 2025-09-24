package Mini_LMS;

public class Course {
    String name;
    String code;

    public Course(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public Course(Course other) {
        this.name = other.name;
        this.code = other.code;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code){
        this.code = code;
    }

    public String getName(){
        return name;
    }

    public String getCode(){
        return code;
    }
    @Override 
    public String toString(){
        return "Name: " + name + ", Course Code: " + code;
    } 
}

