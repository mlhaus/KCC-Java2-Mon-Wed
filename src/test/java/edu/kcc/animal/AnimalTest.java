/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kcc.animal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author k0519415
 */
public class AnimalTest {
    
    private Animal animal;
    
    public AnimalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        animal = new Animal();
    }
    
    @After
    public void tearDown() {
    }

    // TODO
    @Test
    public void testGetId() {
        fail("The test case is a prototype.");
    }

    // TODO - Set the ID to something not already set
    @Test
    public void testSetId() {
        setUp();
        String expected = "0";
        String actual = animal.getId();
        assertEquals(expected,actual);
    }
    
    // TODO - Create a second Animal object with a unique id. Try to set the first animal's id equal to the second one
    @Test
    public void testSetIdBad() {
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetName() {
        setUp();
        String expected = "Unknown";
        String actual = animal.getName();
        assertEquals(expected, actual);
    }

    // TODO
    @Test
    public void testSetName() {
        fail("The test case is a prototype.");
    }

    // TODO
    @Test
    public void testGetSpecies() {
        fail("The test case is a prototype.");
    }

    // TODO
    @Test
    public void testSetSpeciesCat() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @Test
    public void testSetSpeciesDog() {
        fail("The test case is a prototype.");
    }
    
    // TODO - Attempt to set a non Cat or Dog
    @Test
    public void testSetSpeciesBad() {
        fail("The test case is a prototype.");
    }
    
    // TODO - Attempt to set a cat to a dog
    @Test
    public void testSetSpeciesBadCatToDog() {
        fail("The test case is a prototype.");
    }

    // TODO
    @Test
    public void testGetGender() {
        fail("The test case is a prototype.");
    }

    // TODO
    @Test
    public void testSetGender() {
        fail("The test case is a prototype.");
    }
    
    // TODO - Attempt to set non male or female
    @Test
    public void testSetGenderBad() {
        fail("The test case is a prototype.");
    }
    
     // TODO - Attempt to set a male to female
    @Test
    public void testSetGenderBadMaleToFemale() {
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAge(){
        setUp();
        int expected=0;
        int result=animal.getAge();
        assertEquals(expected,result);
    }

    // TODO
    @Test
    public void testSetAge() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @Test
    public void testSetAgeNegativeBad() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @Test
    public void testSetAgeOver100Bad() {
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFixed(){
        setUp();
        boolean expected = false;
        boolean actual = animal.getFixed();
        assertEquals(expected, actual);
    }

    // TODO
    @Test
    public void testSetFixed() {
        fail("The test case is a prototype.");
    }
    
    // TODO - Attempt to set a fixed animal to not fixed
    @Test
    public void testSetFixedTruetoFalse() {
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetLegs(){
        setUp();
        int expected = 4;
        int actual = animal.getLegs();
        assertEquals(expected, actual);
    }

    // TODO
    @Test
    public void testSetLegs() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @Test
    public void testSetLegsNegativeBad() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @Test
    public void testSetLegsGreaterThan4Bad() {
        fail("The test case is a prototype.");
    }


    @Test
    public void testGetWeight() {
        BigDecimal expResult = new BigDecimal(0);
        BigDecimal result = animal.getWeight();
        assertEquals(expResult,result);
    }

    // TODO
    @Test
    public void testSetWeight() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @Test
    public void testSetWeightNegativeBad() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @Test
    public void testSetWeightAbove1000Bad() {
        fail("The test case is a prototype.");
    }


    // TODO
    @Test
    public void testGetdateAdded() {
        fail("The test case is a prototype.");
    }

    // TODO
    @Test
    public void testSetDateAdded() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @Test
    public void testSetDateAddedMoreThanAWeekAgoBad() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @Test
    public void testSetDateAddedFutureDateBad() {
        fail("The test case is a prototype.");
    }


    // TODO
    @Test
    public void testGetLastFeedingTime() {
        fail("The test case is a prototype.");
    }

    // TODO
    @Test
    public void testSetLastFeedingTime() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @Test
    public void testSetLastFeedingTimeMoreThan2DaysAgoBad() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @Test
    public void testSetLastFeedingTimeFutureDateBad() {
        fail("The test case is a prototype.");
    }


    // TODO
    @Test
    public void testToString() {
        fail("The test case is a prototype.");
    }

    // TODO
    @Test
    public void testCompareTo() {
        fail("The test case is a prototype.");
    }
    
}
