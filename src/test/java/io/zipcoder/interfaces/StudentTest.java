package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    private Object student = new Student(1l,"Joe Snow", 777.0);
    private Student student1 = new Student(1l,"Joe Snow", 777.0);

    @Test
    public void learnTest() {
        Double numHours = 111.0;
        Double expected = 888.0;
        student1.learn(111.0);
        Double actual = student1.getTotalStudyTime();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testImplementation() {
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(student instanceof Person);

    }
}