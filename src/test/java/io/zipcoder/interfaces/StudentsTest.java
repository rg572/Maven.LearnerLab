package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    Students students = Students.getInstance();

    @Test
    public void testStudents0(){
        // Arrange
        Person[] studentArray = students.toArray();
        Integer expected = 4;

        // Act
        Integer actual = studentArray.length;

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testStudents1(){
        // Arrange
        String expected = "Dasha";

        // Act
        String actual = students.findById(1).getName();

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testStudents2(){
        // Arrange
        String expected = "Alicia";

        // Act
        String actual = students.findById(2).getName();

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testStudents3(){
        // Arrange
        String expected = "Andrew";

        // Act
        String actual = students.findById(3).getName();

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testStudents4(){
        // Arrange
        String expected = "Asshole";

        // Act
        String actual = students.findById(4).getName();

        // Assert
        Assert.assertEquals(expected, actual);
    }

}