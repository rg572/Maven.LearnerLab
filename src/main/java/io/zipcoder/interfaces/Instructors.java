package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
//        super.add(new Instructor(5, "Kris"));
//        super.add(new Instructor(6, "Dolio"));
//        super.add(new Instructor(7, "Wilhem"));
//        super.add(new Instructor(8, "Froilan"));
        for(Educator educator : Educator.class.getEnumConstants()){
            super.add(educator.getInstructor());
        }

    }

    @Override
    public Instructor[] toArray() {
        List<Instructor> instructorList = new ArrayList<>();
        Iterator itr = iterator();

        while(itr.hasNext()){
            Instructor instructor = (Instructor)itr.next();
            instructorList.add(instructor);
        }
        return instructorList.toArray(new Instructor[instructorList.size()]);
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
