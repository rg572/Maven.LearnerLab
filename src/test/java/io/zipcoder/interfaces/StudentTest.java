package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testImplementation(){
        // Arrange
        Student pretentiousPeon = new Student(312, "Dullard");

        // Act

        // Assert
        Assert.assertTrue(pretentiousPeon instanceof Learner);
    }

    @Test
    public void testInheritance(){
        // Arrange
        Student pretentiousPeon = new Student(123, "Pedant");

        // Act

        // Assert
        Assert.assertTrue(pretentiousPeon instanceof Person);
    }

    @Test
    public void testLearn(){
        // Arrange
        Student pretentiousPeon = new Student(532, "Future White Collar Drone");
        double expected = 10d;

        // Act
        pretentiousPeon.learn(expected);
        double actual = pretentiousPeon.getTotalStudyTime();

        // Assert
        Assert.assertEquals(expected, actual, 0.000001);
    }

}