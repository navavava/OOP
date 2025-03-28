package uni;

import base.Person;

import java.util.ArrayList;

public class Student {
    private static int nextId = 1;
    public int id;
    public static ArrayList<Student> studentList = new ArrayList<>();
    public int personID;
    public final int entranceYear;
    public int majorID;
    public String studentID;


    public Student(int personID, int entranceYear, int majorID) {
        this.id = nextId;
        nextId++;
        studentList.add(this);
        this.personID = personID;
        this.entranceYear = entranceYear;
        this.majorID = majorID;
        Major.findById(majorID).addStudent();
        this.setStudentCode();

    }

    public static Student findById(int id) {
        for (Student student : studentList) {
            if (student.id == id)
                return student;
        }
        return null;
    }

    public void setStudentCode() {
        int studentID = (Major.findById(majorID).numberOfStudents + (majorID * 100) + (entranceYear) * 10000);
        this.studentID = Integer.toString(studentID);
    }
}
