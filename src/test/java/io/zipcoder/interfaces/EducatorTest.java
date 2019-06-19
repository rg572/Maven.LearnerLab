package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EducatorTest {

    @Test
    public void testImplementation() {
        // Arrange
        Educator kris = Educator.KRIS;

        // Act

        // Assert
        Assert.assertTrue(kris instanceof Teacher);
    }



    @Test
    public void testTeach() {
        // Arrange
        Educator wilhem = Educator.WILHEM;
        Student dumbass = new Student(324, "Robert");
        Double teachDuration = 10d;
        Double expected = dumbass.getTotalStudyTime() + teachDuration;

        // Act
        wilhem.teach(dumbass, teachDuration);
        Double actual = dumbass.getTotalStudyTime();

        // Assert
        Assert.assertEquals(expected, actual, 0000000.1);
    }

    @Test
    public void testLecture() {
        // Arrange
        Educator froilan = Educator.FROILAN;
        Student dipshit = new Student(12, "Robert");
        Student student1 = new Student(543, "Dasha");
        Student student2 = new Student(53, "Alicia");
        Double lectureLength = 30.0;
        Double expected = lectureLength / 3.0;

        // Act
        Student[] dipshits = {dipshit, student1, student2};
        froilan.lecture(dipshits, lectureLength);
        Double actual1 = dipshit.getTotalStudyTime();
        Double actual2 = student1.getTotalStudyTime();
        Double actual3 = student2.getTotalStudyTime();

        // Assert
        Assert.assertEquals(expected, actual1);
        Assert.assertEquals(expected, actual2);
        Assert.assertEquals(expected, actual3);
    }

}