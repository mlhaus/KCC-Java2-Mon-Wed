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
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author marchauschildt
 */
public class AnimalTest {

    private Animal animal;
    
    @Before
    public void setUp() {
        animal = new Animal();
    }
    
    // TODO - Need testGetId method
    
    @org.junit.Test
    public void testGetName() {
        setUp();
        String expected = "Unknown";
        String actual = animal.getName();
        assertEquals(expected, actual);
    }
    
    // TODO - Need testGetSpecies method (Becky)
    
    // TODO - Need testGetGender method (Whitney)
    
    // TODO - Need testGetName method (Chase)
    
    // TODO - Need testGetAge method (Fadwa)
    @Test
    public void testGetAge(){
        int expected=0;
        int result=animal.getAge();
        assertEquals(expected,result);
    }
    
    // TODO - Need testGetFixed method (Ryan)
    @org.junit.Test
    public void testGetFixed(){
        setUp();
        boolean expected = false;
        boolean actual = animal.getFixed();
        assertEquals(expected, actual);
    }
    // TODO - Need testGetId method (Joseph)
    
    // TODO - Need testGeLegs method (Jory)
    public void testGetLegs(){
        setUp();
        int expected = 4;
        int actual = animal.getLegs();
        assertEquals(expected, actual);
    }
    
    // TODO - Need testGetWeight method (Chantal)
    @Test
    public void testGetWeight() {
        BigDecimal expResult = new BigDecimal(0);
        BigDecimal result = animal.getWeight();
        assertEquals(expResult,result);
    }
    
    // TODO - Need testGetDateAdded method
    
    // TODO - Need testGetLastFeedingTime method
    
}
