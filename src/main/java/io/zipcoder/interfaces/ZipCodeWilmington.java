package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    private ZipCodeWilmington(){

    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){

        teacher.lecture(students.toArray(), numberOfHours);

    }

    public void hostLecture(long id, double numberOfHours){
        Teacher teacher = (Teacher)instructors.findById(id);

        if(teacher != null){
            hostLecture(teacher, numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> studyMap = new HashMap<>();


        for(Student student : students.toArray()){
            studyMap.put(student, student.getTotalStudyTime());
        }
        return studyMap;
    }
}
