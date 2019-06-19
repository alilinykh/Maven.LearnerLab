package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void getInstance() {
        Integer counter = 0;
        for (Object i: Instructors.getInstance()
             ) {
            counter++;
        }
        Integer expected = 3;
        Integer actual = counter;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getInstance1() {
        Instructors instructors = Instructors.getInstance();
        Assert.assertThat(instructors.count(), is(3));
    }
}