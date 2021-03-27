package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
// Made by Mike Ninh
public class MouseTest {

    @Test
    public void mouseConstructorTest() {
        // Given
        String expectedName = "Mouse name";
        String expectedType = "mouse";
        Mouse mouse = new Mouse();

        // When
        String actualName = mouse.getName();
        String actualType = mouse.getType();


        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedType, actualType);
    }

    @Test
    public void getNameTest(){
        Mouse mouse = new Mouse("Jerry", "mouse");
        String expectedName = "Jerry";
        String actualName = mouse.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest(){
        Mouse mouse = new Mouse("Jerry", "mouse");
        String expectedSpeak = "Squeak!";
        String actualSpeak = mouse.speak();
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }
}
