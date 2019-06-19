package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void getInstance() {
       Students students = Students.getInstance();
        Assert.assertThat(students.count(), is (5));
    }
}