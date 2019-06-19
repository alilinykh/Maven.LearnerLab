package io.zipcoder.interfaces;

public final class Instructors extends People{
    private static Instructors INSTANCE;

    public static Instructors getInstance() {
        if (INSTANCE == null) {INSTANCE = new Instructors();}
        return INSTANCE;
    }

    public Instructors() {
        String[] Insturctors = {"Kris","Dolio","Wilhem"};
        Long id = 0l;
        for (String name: Insturctors
             ) {
            Instructor instructor = new Instructor(id,name);
            add(instructor);
            id++;
        }
    }
}
