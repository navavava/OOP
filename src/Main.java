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

        System.out.println("Professor " + Person.findByID(Professor.findById(1).personID) + " ,ID: 1");
        System.out.println("Professor " + Person.findByID(Professor.findById(2).personID) + " ,ID: 2");

        new Course("Maths", 3);
        new Course("Econ 101", 2);
        new Course("Arts 101", 4);

        new PresentedCourse(1, 1, 5);
        new PresentedCourse(1, 1, 5);
        new PresentedCourse(2, 2, 3);




    }
}