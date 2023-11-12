import java.lang.Math;

public class Student {
    private String firstName;
    private int gradeLevel;
    private int studentID;

    public Student(String name) {
        firstName = name;
        gradeLevel = 0;
        studentID = 1;
    }

    public Student(String name, int grade) {
        firstName = name;
        gradeLevel = grade;
        studentID++;
    }

    public boolean isSenior() {
        return gradeLevel == 12;
    }

    public String getName() {
        return firstName;
    }
}