package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    private Person person;

    @Test
    public void setName() {
        person = new Person(1l,"nameName");
        String expected = "newName";
        person.setName("newName");
        String actual = person.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testConstractor() {
        String expected = "nameName";
        person = new Person(1l, expected);
        String actual = person.getName();
        Assert.assertEquals(expected,actual);

        Long eLong = 1l;
        Long aLong = person.getId();
        Assert.assertEquals(eLong,aLong);
    }
}