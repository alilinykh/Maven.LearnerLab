package io.zipcoder.interfaces;

public final class Students extends People<Student>{
    private static Students INSTANCE;

    public static Students getInstance() {
        if (INSTANCE == null) {INSTANCE = new Students();}
        return INSTANCE;
    }
    private Students (){
        String[] students = {"Rick","Morty","BirdPerson","Summer","Jerry"};
        Long id = 777l;
        for (String s: students
             ) {
            Student student = new Student(id,s);
            add(student);
            id++;
        }
    }

    @Override
    Student[] toArray() {
        Student[] arr = new Student[INSTANCE.count()];
        int i = 0;
        for (Object student: INSTANCE
             ) {
            arr[i] = (Student) student;
            i++;
        }
        return arr;
    }
}
