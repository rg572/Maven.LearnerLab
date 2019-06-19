package io.zipcoder.interfaces;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Students extends People<Student> {

    private static final Students INSTANCE = new Students();

    private Students(){
        super.add(new Student(1, "Dasha"));
        super.add(new Student(2, "Alicia"));
        super.add(new Student(3, "Andrew"));
        super.add(new Student(4, "Asshole"));
    }

    @Override
    public Student[] toArray() {
        List<Student> studentList = new ArrayList<>();
        Iterator itr = iterator();

        while(itr.hasNext()){
            Student student = (Student)itr.next();
            studentList.add(student);
        }
        return studentList.toArray(new Student[studentList.size()]);
    }


    public static Students getInstance(){
        return INSTANCE;
    }



}
