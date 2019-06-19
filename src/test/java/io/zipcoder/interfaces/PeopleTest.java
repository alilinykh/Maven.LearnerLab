package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PeopleTest {
    private Person person;
    private People people;


    @Before
    public void setUp() throws Exception {
        person = new Person(666l,"Cersei Lannister");
        people = new People() {
            @Override
            Person[] toArray() {
                return people.toArray();
            }
        };
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addTest() {
        people.add(person);
        Integer expected = 1;
        Integer actual = people.count();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findByIdTest() {
        people.add(person);
        String expected = "Cersei Lannister";
        String actual = people.findById(666l).getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeTest() {
        Person person1 = new Person(1l,"Tyrion Lannister");
        people.add(person);
        people.add(person1);
        Integer expected = 1;
        people.remove(person1);
        Integer actual = people.count();

        Assert.assertEquals(expected,actual);

    }
}