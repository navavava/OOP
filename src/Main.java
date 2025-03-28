import base.Person;
import uni.*;

public class Main {
    public static void main(String[] args) {
        new Major("Econ", 5);
        new Major("Arts", 3);

        new Person("Nava", "1");
        new Person("Navid", "2");
        new Person("Asal", "3");
        new Person("Niki", "4");
        new Person("Golsa", "5");

        new Student(1, 1402, 1);
        new Student(2, 1404, 1);
        new Student(3, 1402, 2);

        new Professor(4, 1);
        new Professor(5, 2);

        if (Professor.findById(1) != null)
            System.out.println("Professor " + Person.findByID(Professor.findById(1).personID).name + " ,ID: 1");
        if (Professor.findById(2) != null)
            System.out.println("Professor " + Person.findByID(Professor.findById(2).personID).name + " ,ID: 2");

        Course Maths = new Course("Maths", 3);
        Course Econ = new Course("Econ 101", 4);
        Course Arts = new Course("Arts 101", 4);

        PresentedCourse presentedMaths = new PresentedCourse(1, 1, 5);
        PresentedCourse presentedEcon = new PresentedCourse(2, 1, 5);
        PresentedCourse presentedArts = new PresentedCourse(3, 2, 3);

        for (int i = 1; i < 3; i++) {
            if (PresentedCourse.findById(1) != null)
                PresentedCourse.findById(1).addStudent(i);
        }
        for (int i = 1; i < 4; i++) {
            if (PresentedCourse.findById(2) != null)
                PresentedCourse.findById(2).addStudent(i);
        }
        if (PresentedCourse.findById(3) != null)
            PresentedCourse.findById(3).addStudent(3);

        Transcript Nava = new Transcript(1);
        Nava.setGrade(2, 20);
        Nava.setGrade(1, 10);

        Transcript Navid = new Transcript(2);
        Navid.setGrade(1, 20);
        Navid.setGrade(2, 14);

        Transcript Asal = new Transcript(3);
        Asal.setGrade(2, 13);
        Asal.setGrade(3, 17);

        System.out.println("*******************");
        Nava.printTranscript();
        System.out.println("GPA: " + Nava.getGPA());
        System.out.println("*******************");
        Navid.printTranscript();
        System.out.println("GPA: " + Navid.getGPA());
        System.out.println("*******************");
        Asal.printTranscript();
        System.out.println("GPA: " + Asal.getGPA());


    }
}