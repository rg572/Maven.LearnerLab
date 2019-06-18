package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructorId(){
        // Arrange
        Person peon = new Person(170, "170");
        long expected = 170;

        // Act
        long actual = peon.getId();

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorName() {
        // Arrange
        String expected = "Serf";
        Person peon = new Person(342, expected);

        // Act
        String actual = peon.getName();

        // Arrange
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName(){
        // Arrange
        Person peon = new Person( 647, "Automaton");
        String expected = "Anonymous Cog";

        // Act
        peon.setName(expected);
        String actual = peon.getName();

        Assert.assertEquals(expected, actual);
    }

}
