package Q_05;

public class Course {
    //Data Members
    private String courseName;
    private String courseCode;
    private Lecturer lecturerInCharge;

    //Getter for courseName
    public String getCourseName() {
        return courseName;
    }

    //Setter for courseName
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    //Getter for courseCode
    public String getCourseCode() {
        return courseCode;
    }

    //Setter For courseCode
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    //Getter for lecturerInCharge
    public Lecturer getLecturerInCharge() {
        return lecturerInCharge;
    }

    //Setter for lecturerInCharge
    public void setLecturerInCharge(Lecturer lecturerInCharge) {
        this.lecturerInCharge = lecturerInCharge;
    }
}
