package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    Instructors instructors = Instructors.getInstance();

    @Test
    public void testInstructorsSize(){
        // Arrange
        Integer expected = 4;

        // Act
        Integer actual = instructors.count();

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInstructors1(){
        // Arrange
        String expected = "KRIS";

        // Act
        String actual = instructors.findById(5).getName();

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInstructors2(){
        // Arrange
        String expected = "DOLIO";

        // Act
        String actual = instructors.findById(6).getName();

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInstructors3(){
        // Arrange
        String expected = "WILHEM";

        // Act
        String actual = instructors.findById(7).getName();

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInstructors4(){
        // Arrange
        String expected = "FROILAN";

        // Act
        String actual = instructors.findById(8).getName();

        // Assert
        Assert.assertEquals(expected, actual);
    }

}