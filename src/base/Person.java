package base;

import java.util.ArrayList;

public class Person {
    private static int nextId = 1;
    public int id;
    public String name;
    public String nationalID;
    public static ArrayList<Person> personList = new ArrayList<>();

    public Person(String name, String nationalID) {

        this.id = nextId;
        nextId++;
        this.name = name;
        this.nationalID = nationalID;
        personList.add(this);
    }

    public static Person findByID(int id) {
        for (Person Person : personList) {
            if (Person.id == id)
                return Person;
        }
        return null;
    }
}

