package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    Kris,Dolio,Wilhem
    ;
    private Integer educatorValue;
    @Override
    public void teach(Learner learner, Double numOfHours) {

    }

    @Override
    public void lecture(Learner[] learners, Double numberOfHours) {

    }
}
