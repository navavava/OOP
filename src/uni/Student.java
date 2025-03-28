package uni;

import base.Person;

import java.util.ArrayList;

public class Student {
    public int id;
    public static ArrayList<Student> studentList = new ArrayList<>();
    public int personID;
    public final int entranceYear;
    public int majorID;
    public String studentID;


    public Student(int personID, int entranceYear, int majorID) {
        this.personID = personID;
        this.entranceYear = entranceYear;
        this.majorID = majorID;
        if (Major.findById(majorID) != null)
            Major.findById(majorID).addStudent();
        this.setStudentCode();
        studentList.add(this);
        this.id = studentList.size();
    }

    public static Student findById(int id) {
        for (Student student : studentList) {
            if (student.id == id)
                return student;
        }
        return null;
    }

    public void setStudentCode() {
        int studentID;
        if (Major.findById(majorID) != null) {
            studentID = (Major.findById(majorID).numberOfStudents + (majorID * 100) + (entranceYear) * 10000);
            this.studentID = Integer.toString(studentID);
        }
    }
}
