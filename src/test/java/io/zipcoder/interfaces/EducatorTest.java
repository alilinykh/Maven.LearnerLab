package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {
    Educator educator;
    Student student;
    Teacher teacher = Educator.Dolio;

    @Before
    public void setUp() throws Exception {
        educator = Educator.Dolio;
        student = new Student(0l,"John Snow",0.0);

    }

    @Test
    public void teach() {
        Double expected = 100.0;
        educator.teach(student, 100.0);
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void lecture() {
        Learner[] learners = new Learner[4];
        Student student2 = new Student(0L,"John Snow",0.0);
        Student student3 = new Student(1L,"1 Snow",0.0);
        Student student4 = new Student(3L,"John 3",0.0);
        learners[0] = student;
        learners[1] = student2;
        learners[2] = student3;
        learners[3] = student4;

        educator.lecture(learners,400.0);
        Double expected = 100.0;
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testImplementation() {
        Assert.assertTrue(educator instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(teacher instanceof Person);
        //cannot test enums interfaces
        //so you cannot test educator instanceof Person

    }
}