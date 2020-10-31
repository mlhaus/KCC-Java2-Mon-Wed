package edu.kcc.animal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.HashSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static com.gargoylesoftware.htmlunit.html.InputElementFactory.instance;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *
 * @author k0519415
 */
public class AnimalTest {
    
    private Animal animal;
    private static final String GOOD_NAME = "Snowball";
    private static final String GOOD_ID = "0";
    private static final String GOOD_SPECIES = "Artiodactyla ";
    private static final String GOOD_GENDER = "Female";
    private static final int GOOD_AGE = 0;
    private static final boolean GOOD_FIXED = false;
    private static final int GOOD_LEGS = 4;
    private static final BigDecimal GOOD_WEIGHT = BigDecimal.valueOf(0);
    private static final LocalDate GOOD_DATE_ADDED = LocalDate.of(2020, 9, 1);
    private static final LocalDateTime GOOD_LAST_FEEDING_TIME = LocalDateTime.of(2020, 10, 1, 23, 59);
    
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

    @Test
    public void testSetName() {
        setUp();
        animal.setName(GOOD_NAME);
        assertEquals(GOOD_NAME, animal.getName());
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

    @Test
    public void testSetAge() {
        animal.setAge(3);
        assertEquals(3,animal.getAge());
    }
    
    @Test
    public void testSetAgeNegativeBad() {
        assertThrows(IllegalArgumentException.class,
                () -> animal.setAge(-5),
                "Invalid Animal age.");
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

    @Test
    public void testSetFixed() {
        System.out.println("setFixed");
        boolean fixed = true;
        Animal animal = new Animal();
        animal.setFixed(fixed);
        assertEquals(fixed, animal.getFixed());
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
    public void testGetDateAdded() {
        LocalDate expResult = LocalDate.of(2020, 9, 1); // The default date
        LocalDate result = animal.getDateAdded();
        assertEquals(expResult.toString(), result.toString());
    }

    // TODO
    @Test
    public void testSetDateAdded() {
        LocalDate goodDate = LocalDate.now();
        animal.setDateAdded(goodDate);
        assertEquals(goodDate.toString(), animal.getDateAdded().toString());
    }
    
    // TODO
    @Test
    public void testSetDateAddedMoreThanAWeekAgoBad() {
        LocalDate badDate = LocalDate.now().minusWeeks(1));
        LocalDate original = animal.getDateAdded();
        try{
            animal.setDateAdded(badDate);
            fail("The date added may not be longer than a week in the past.");           
        }
        catch(IllegalArguementException iae){
            assertEquals(original, animal.getDateAdded());
        }
    }
    
    // TODO
    @Test
    public void testSetDateAddedFutureDateBad() {
        LocalDate badDate = LocalDate.now().plusDays(1);
        LocalDate original = animal.getDateAdded();
        try{
            animal.setDateAdded(badDate);
            fail("The date added may not be in the future.");           
        }
        catch(IllegalArguementException iae){
            assertEquals(original, animal.getDateAdded());
        }
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
    
    @Test
    public void testSetLastFeedingTimeMoreThan2DaysAgoBad() {
        LocalDateTime ldtThreeDays = LocalDateTime.now().minusDays(3);
        Animal instance = new Animal();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            instance.setLastFeedingTime(ldtThreeDays);
        });

    }
    
    @Test
    public void testSetLastFeedingTimeFutureDateBad() {
        LocalDateTime ldtFutureDate = LocalDateTime.now().plusDays(1);
        Animal instance = new Animal();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            instance.setLastFeedingTime(ldtFutureDate);
                });
        
    }


    // TODO
    @Test
    public void testToString() {
        fail("The test case is a prototype.");
    }

    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Animal other = new Animal(GOOD_ID,
                GOOD_NAME,
                GOOD_GENDER,
                GOOD_AGE,
                GOOD_FIXED,
                GOOD_LEGS,
                GOOD_WEIGHT,
                GOOD_DATE_ADDED,
                GOOD_LAST_FEEDING_TIME);
        Animal instance = new Animal(GOOD_ID,
                GOOD_NAME,
                GOOD_GENDER,
                GOOD_AGE,
                GOOD_FIXED,
                GOOD_LEGS,
                GOOD_WEIGHT,
                GOOD_DATE_ADDED,
                GOOD_LAST_FEEDING_TIME);
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
    }

}
