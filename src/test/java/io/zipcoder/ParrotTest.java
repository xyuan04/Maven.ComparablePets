package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
// Made by Mike Ninh
public class ParrotTest{

    @Test
    public void parrotConstructorTest() {
        // Given
        Parrot parrot = new Parrot();
        String expectedName = "Parrot name";
        String expectedType = "parrot";


        // When
        String actualName = parrot.getName();
        String actualType = parrot.getType();


        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedType, actualType);
    }

    @Test
    public void getNameTest(){
        Parrot parrot = new Parrot("DJ C#", "parrot");
        String expectedName = "DJ C#";
        String actualName = parrot.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest(){
        Parrot parrot= new Parrot("DJ C#", "parrot");
        String expectedSpeak = "Give me a /br";
        String actualSpeak = parrot.speak();
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }
}