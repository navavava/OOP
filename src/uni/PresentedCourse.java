package uni;

import java.util.ArrayList;

public class PresentedCourse {
    public int id;
    public static ArrayList<PresentedCourse> presentedCourseList = new ArrayList<>();
    public int courseID;
    public int professorID;
    public int capacity;
    public ArrayList<Integer> studentIds;

    public PresentedCourse(int courseID, int professorID, int maxCapacity) {
        this.courseID = courseID;
        this.professorID = professorID;
        capacity = maxCapacity;
        studentIds = new ArrayList<>();
        studentIds.ensureCapacity(maxCapacity);
        presentedCourseList.add(this);
        this.id = presentedCourseList.size();
    }

    public static PresentedCourse findById(int ID) {
        for (PresentedCourse presentedCourse : presentedCourseList) {
            if (presentedCourse.id == ID)
                return presentedCourse;
        }
        return null;
    }

    public void addStudent(int studentID) {
        if (studentIds.size() < capacity)
            studentIds.add(studentID);
        else
            System.out.println("ERROR: This course is at full capacity.");
    }
}
