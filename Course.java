package University;

public class Course {
    private String courseName;
    private String instructor;
    private Integer numberOfStudents;

    public Course(String courseName,String instructor, int numberOfStudents){
        this.courseName = courseName;
        this.instructor = instructor;
        this.numberOfStudents = numberOfStudents;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }
    public String getInstructor(){
        return instructor;
    }
    public void setInstructor(String instructor){
        this.instructor=instructor;
    }
    public Integer getNumberOfStudents(){
        return numberOfStudents;
    }
    public void setNumberOfStudents(int numberOfStudents){
        this.numberOfStudents=numberOfStudents;
    }
    public String toString(){
        return ("Course Name: " + courseName + " Instructor: " + instructor + " Number of Students: " + numberOfStudents);
    }

}
