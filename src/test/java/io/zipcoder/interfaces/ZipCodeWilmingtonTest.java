package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLecture() {
//        Instructors instructors = Instructors.getInstance();
        Educator educator = Educator.Dolio;
        Students students = Students.getInstance();
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();

        Student student = students.findById(777l);
        Double numHours = 100.0;

        zipCodeWilmington.hostLecture(educator,numHours);
        Double expected = 20.0;
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected,actual);

    }
}