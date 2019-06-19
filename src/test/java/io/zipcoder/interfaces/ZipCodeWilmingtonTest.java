package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLecture() {
        Instructors instructors = Instructors.getInstance();
        Students students = Students.getInstance();
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();

        Teacher teacher = (Teacher)instructors.findById(0l);
        Student student = (Student)students.findById(777l);
        Double numHours = 100.0;

        zipCodeWilmington.hostLecture(teacher,numHours);
        Double expected = 20.0;
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected,actual);

    }
}