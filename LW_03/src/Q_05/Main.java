package Q_05;

public class Main {
    public static void main(String[] args) {
        Course oop = new Course();
            oop.setCourseName("Object Oriented Programming");
            oop.setCourseCode("CTEC 22043");


        Lecturer kumar = new Lecturer();
            kumar.setLecturerName("Kumar");
            kumar.setCourseTeaching("Object Oriented Programming");
        oop.setLecturerInCharge(kumar);

        Student sanga = new Student();
            sanga.setStudentName("Sanga");
            sanga.setDegreeName("Bachelor of Information and Communication Technology");
            sanga.setCourseFollowing("Object Oriented Programming");



        System.out.println("\nStudent Details: ");
        System.out.println("Student Name: "+sanga.getStudentName());
        System.out.println("Degree Name: "+sanga.getDegreeName());
        System.out.println("Course Name: "+sanga.getCourseFollowing()+"\n");

        System.out.println("Course Details: ");
        System.out.println("Course Name: "+oop.getCourseName());
        System.out.println("Course Code: "+oop.getCourseCode());
        System.out.println("Lecturer In Charge: "+oop.getLecturerInCharge().getLecturerName()+"\n");

        System.out.println("Lecturer Details: ");
        System.out.println("Lecturer Name: "+kumar.getLecturerName());
        System.out.println("Courses Teaching: "+kumar.getCourseTeaching()+"\n");
    }
}
