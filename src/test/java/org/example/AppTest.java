package org.example;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    Calculator calculator;
    @Before
    public void setupEachTest() {
        // run before each test
        System.out.println("Before every test");
        System.out.println("---------------->");
        calculator = new Calculator();
    }

    @BeforeClass
    public static void setupEachTestSet() {
        // run before each test suite
        System.out.println("Before every test suite !");
    }

    @After
    public void teardownTest() {
        // run after each test
        System.out.println("After every test");
        System.out.println("---------------->");
    }

    @AfterClass
    public static void teardownTestSuite() {
        // run after each test
        System.out.println("After every test suite");
    }


    @Test
    public void substractionPositiveNumbersFirstNumberBiggerSecond()
    {
        System.out.println("True test");
        int result = calculator.substraction(3, 2);
        assertEquals(1, result);
        assertTrue( true );
    }

    @Test
    public void substractionNыegativeNumbersFirstNumberBiggerSecond()
    {
        int result = calculator.substraction(-3, -2);
        System.out.println("False test");
        assertEquals(-1, result);
        assertFalse( false );
    }

    @Test
    public void substractionZeroAndNegative()
    {
        int result = calculator.substraction(0, 3);
        System.out.println("False test");
        assertEquals(-3, result);
        assertFalse( false );
    }

    @Test
    public void additionPositiveNumbersFirstNumberBiggerSecond()
    {
        System.out.println("True test");
        int result = calculator.additionResult(5, 2);
        assertEquals(7, result);
        assertTrue( true );
    }

    @Test
    public void additionNegativeNumbersFirstNumberBiggerSecond()
    {
        int result = calculator.additionResult(-7, -2);
        System.out.println("False test");
        assertEquals(-9, result);
        assertFalse( false );
    }

    @Test
    public void additionZeroAndNegative()
    {
        int result = calculator.additionResult(7, 0);
        System.out.println("False test");
        assertEquals(7, result);
        assertFalse( false );
    }

    @Test
    public void testUserFields()
    {
        User result = new User("Mariya", 26, 345 );
        assertEquals("Mariya", result.name);
        assertEquals(26, result.age);
        assertEquals(345, result.id);
    }

    @Test
    public void testUserDefult()
    {
        User result = new User();
        assertEquals(null, result.name);
        assertEquals(0, result.age);
        assertEquals(0, result.id);
    }

    @Test
    public void setNameMethod()
    {
        User result = new User();
        result.setName("Ivan");
        assertEquals("Ivan", result.name);
    }


}
