//iopackage io.zipcoder.interfaces;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class PeopleTest {
//
//
//    @Test
//    public void testEmptyPeople(){
//        // Arrange
//        People sheeple = new People();
//        Integer expected = 0;
//
//        // Act
//        Integer actual = sheeple.count();
//
//        // Assert
//        Assert.assertEquals(expected, actual);
//    }
//
//
//    @Test
//    public void testAdd(){
//        // Arrange;
//        People sheeple = new People();
//        Person arsehole1 = new Person(1, "One");
//        Person arsehole2 = new Person(2, "Two");
//        Person arsehole3 = new Person(3, "Three");
//        Integer expected = 3;
//
//        // Act
//        sheeple.add(arsehole1);
//        sheeple.add(arsehole2);
//        sheeple.add(arsehole3);
//        Integer actual = sheeple.count();
//
//        // Assert
//        Assert.assertEquals(expected, actual);
//
//
//    }
//
//    @Test
//    public void testRemove(){
//        // Arrange;
//        People sheeple = new People();
//        Person arsehole1 = new Person(1, "One");
//        Person arsehole2 = new Person(2, "Two");
//        Person arsehole3 = new Person(3, "Three");
//        Integer expected = 2;
//
//        // Act
//        sheeple.add(arsehole1);
//        sheeple.add(arsehole2);
//        sheeple.add(arsehole3);
//        sheeple.remove(arsehole2);
//        Integer actual = sheeple.count();
//
//        // Assert
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testFindById(){
//        // Arrange;
//        People sheeple = new People();
//        Person arsehole1 = new Person(1, "One");
//        Person arsehole2 = new Person(2, "Two");
//        Person arsehole3 = new Person(3, "Three");
//        Person expected = arsehole2;
//
//        // Act
//        sheeple.add(arsehole1);
//        sheeple.add(arsehole2);
//        sheeple.add(arsehole3);
//        Person actual = sheeple.findById(2);
//
//        // Assert
//        Assert.assertEquals(expected, actual);
//    }
//
//}