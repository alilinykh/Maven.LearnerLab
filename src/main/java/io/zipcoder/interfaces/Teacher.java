package io.zipcoder.interfaces;

public interface Teacher {
    void teach(Learner learner, Double numOfHours);
    void lecture (Learner[] learners, Double numberOfHours);
}
