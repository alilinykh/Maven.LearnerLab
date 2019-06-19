package io.zipcoder.interfaces;

public final class Instructors extends People <Instructor>{
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

    @Override
    Instructor[] toArray() {
        Instructor[] arr = new Instructor[INSTANCE.count()];
        int i = 0;
        for (Object instructor: INSTANCE
        ) {
            arr[i] = (Instructor) instructor;
            i++;
        }
        return arr;
    }
}
