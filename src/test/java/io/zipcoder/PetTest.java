package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
// Made by Mike Ninh
public class PetTest {
    @Test
    public void nullConstructorTest() {

        // Given
        Pet pet = new Pet();

        // When
        String expectedName = "Java wrapper";
        String actualName = pet.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void constructorTest() {

        // Given
        String expectedName = "Rocky";
        Pet pet = new Pet(expectedName);

        // When

        String actualName = pet.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest(){
        // : Given
        String name = "Bugs";
        Pet pet = new Pet(name);

        // : When
        String expected = "What's up doc?";
        String actual = pet.speak();

        // : Then
        Assert.assertEquals(expected, actual);
    }
}

