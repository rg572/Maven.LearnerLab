package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void testImplementation() {
        // Arrange
        Instructor pissant = new Instructor(12, "Adjunct");

        // Act

        // Assert
        Assert.assertTrue(pissant instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        // Arrange
        Instructor pissant = new Instructor(543, "T.A.");

        // Act

        // Assert
        Assert.assertTrue(pissant instanceof Person);
    }

    @Test
    public void testTeach() {
        // Arrange
        Instructor pissant = new Instructor(432, "Regretting His Life Choices");
        Student dumbass = new Student(324, "Clock Puncher");
        Double teachDuration = 10d;
        Double expected = dumbass.getTotalStudyTime() + teachDuration;

        // Act
        pissant.teach(dumbass, teachDuration);
        Double actual = dumbass.getTotalStudyTime();

        // Assert
        Assert.assertEquals(expected, actual, 0000000.1);
    }

    @Test
    public void testLecture() {
        // Arrange
        Instructor pissant = new Instructor(234, "Will Never Receive Tenure");
        Student dipshit1 = new Student(12, "Dumbass");
        Student dipshit2 = new Student(543, "Dumbfuck");
        Student dipshit3 = new Student(53, "Dumb Motherfucker");
        Double lectureLength = 30.0;
        Double expected = lectureLength / 3.0;

        // Act
        Student[] dipshits = {dipshit1, dipshit2, dipshit3};
        pissant.lecture(dipshits, lectureLength);
        Double actual1 = dipshit1.getTotalStudyTime();
        Double actual2 = dipshit1.getTotalStudyTime();
        Double actual3 = dipshit1.getTotalStudyTime();

        // Assert
        Assert.assertEquals(expected, actual1);
        Assert.assertEquals(expected, actual2);
        Assert.assertEquals(expected, actual3);
    }

}