//Author: Yanga Rubushe


public class Student {
    String studentName;
    int studentNumber;
    long regYear;
    String faculty;
    String department;

    // Constructor
    public Student(String studentName, int studentNumber, long regYear, String faculty, String department) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.regYear = regYear;
        this.faculty = faculty;
        this.department = department;
    }

    // Default constructor for MyFriends
    public Student() {}

    // Getters and Setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public long getRegYear() {
        return regYear;
    }

    public void setRegYear(long regYear) {
        this.regYear = regYear;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Method to print student details
    public static void toStrings(String studentName, String faculty, String department) {
        System.out.println(studentName + ", " + faculty + ", " + department);
    }
}
