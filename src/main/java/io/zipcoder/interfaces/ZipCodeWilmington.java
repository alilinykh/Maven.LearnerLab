package io.zipcoder.interfaces;

import com.sun.corba.se.impl.protocol.INSServerRequestDispatcher;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.HashMap;

public class ZipCodeWilmington {
    private static ZipCodeWilmington INSTANCE;
    private Students students;
    private Instructors instructors;

    public ZipCodeWilmington() {
        students = Students.getInstance();
        instructors = Instructors.getInstance();
    }

    public static ZipCodeWilmington getInstance() {
        if (INSTANCE == null) {return INSTANCE = new ZipCodeWilmington();}
        return INSTANCE;
    }


    public void hostLecture(Teacher teacher, double numberOfHours) {
//        ArrayList<Learner> arr = new ArrayList<>();
//        for (Object student: students
//             ) {
//            arr.add((Learner)student);
//        }
//        Learner[] learners = new Learner[arr.size()];
//        learners = arr.toArray(learners);
//        teacher.lecture(learners,numberOfHours);

        //after refactoring
        teacher.lecture(students.toArray(),numberOfHours);
    }

    public void hostLecture (long id, double numberOfHours) {
//        ArrayList<Instructor> arr = new ArrayList<>();
//        for (Object instructor : instructors
//             ) {
//            arr.add((Instructor) instructor);
//        }
//        for (Instructor i: arr
//             ) {
//            if (i.getId().equals(id)) {
//                hostLecture(i,numberOfHours);
//            }
//        }

        //after refactoring
//        instructors.findById(id).lecture(students.toArray(),numberOfHours);
    }

    public void getStudyMap () {

        HashMap <Object, Double> hashMap = new HashMap();
        ArrayList<Learner> arr = new ArrayList<>();
        for (Object student: students
        ) {
            arr.add((Learner)student);
        }
        for (Learner student: arr
             ) {
            hashMap.put(student,student.getTotalStudyTime());
        }
    }
}

