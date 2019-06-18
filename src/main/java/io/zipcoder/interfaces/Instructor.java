package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {
    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, Double numOfHours) {
        learner.learn(numOfHours);
    }

    @Override
    public void lecture(Learner[] learners, Double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner l: learners
             ) {
            l.learn(numberOfHoursPerLearner);
        }
    }
}
