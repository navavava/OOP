package uni;

import java.util.ArrayList;

public class Professor {
    private static int nextId = 1;
    public int id;
    public static ArrayList<Professor> professorList = new ArrayList<>();
    public int personID;
    public int majorID;

    public Professor(int personID, int majorID) {
        this.id = nextId;
        nextId++;
        this.majorID = majorID;
        professorList.add(this);
    }

    public static Professor findById(int ID) {
        for (Professor professor : professorList) {
            if (professor.id == ID)
                return professor;
        }
        return null;
    }
}
