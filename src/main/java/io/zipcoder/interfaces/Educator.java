package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    Kris(new Instructor(1l,"Kris"),1.0),
    Dolio(new Instructor(2l,"Dolio"),2.0),
    Wilhem(new Instructor(3l, "Wilhem"),3.0);

    private final Instructor instructor;
    private  Instructors instructors = Instructors.getInstance();
    private double timeWorked;


    Educator(Instructor instructor, double time) {
        this.timeWorked = time;
        this.instructor = instructor;
        instructors.add(instructor);
    }


    @Override
    public void teach(Learner learner, Double numOfHours) {
        instructor.teach(learner,numOfHours);
    }

    @Override
    public void lecture(Learner[] learners, Double numberOfHours) {
        instructor.lecture(learners,numberOfHours);
    }
}


