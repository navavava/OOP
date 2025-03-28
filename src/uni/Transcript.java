package uni;

import java.util.HashMap;

public class Transcript {
    public int studentID;
    public HashMap<Integer, Double> transcript;

    public Transcript(int studentID) {
        this.studentID = studentID;
        transcript = new HashMap<>();
    }

    public void setGrade(int presentedCourseID, double grade) {
        boolean meow = false;
        PresentedCourse thisSubject = PresentedCourse.findById(presentedCourseID);
        for (Integer studentID : thisSubject.studentIds) {
            if (this.studentID == studentID)
                transcript.put(presentedCourseID, grade);
        }
    }

    public void printTranscript() {
        System.out.println("student code: " + this.studentID);
        for (Integer i : transcript.keySet()) {
            System.out.println("course name: " + Course.findById(i).title + "grade: " + transcript.get(i));
        }
    }

    public double getGPA() {
        double gpa = 0;
        for (Integer i : transcript.keySet()) {
            gpa = +(transcript.get(i) * Course.findById(i).units);
        }
        return gpa;
    }
}
