package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

//    @Test
//    public void testHostLectureTeacher(){
//        // Arrange
//        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
//        Teacher teacher = new Instructor(9, "Tariq");
//        Double expected = 10.0;
//
//        // Act
//        zcw.hostLecture(teacher, 40.0);
//        Map<Student, Double> studyMap = zcw.getStudyMap();
//
//        // Assert
//        for(Map.Entry<Student, Double> entry: studyMap.entrySet()){
//            Assert.assertEquals(expected, entry.getValue());
//        }
//
//    }

    @Test
    public void testHostLectureEducator(){
        // Arrange
        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
        Educator dolio = Educator.DOLIO;
        Double expected = 10.0;

        // Act
        zcw.hostLecture(dolio, 40.0);
        Map<Student, Double> studyMap = zcw.getStudyMap();

        // Assert
        for(Map.Entry<Student, Double> entry: studyMap.entrySet()){
            Assert.assertEquals(expected, entry.getValue());
        }

    }

//    @Test
//    public void testHostLectureId(){
//        // Arrange
//        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
//        Double expected = 10.0;
//
//        // Act
//        zcw.hostLecture(5,40.0);
//        Map<Student, Double> studyMap = zcw.getStudyMap();
//
//        // Assert
//        Assert.assertEquals(studyMap.size(), 4);
//        for(Map.Entry<Student, Double> entry: studyMap.entrySet()){
//            Assert.assertEquals(expected, entry.getValue());
//        }
//    }



}