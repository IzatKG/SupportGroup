package myTestNgTest;

import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import practice2.MyTest1;

public class MyFirstTest {

    @BeforeClass
    public void openBrowse(){
        System.out.println("Open chrome browse");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("This is before method");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Take screenshots");
    }

    @Test(priority = 2)
    public void testSum() {
        int expected = 10;
        assertEquals(MyTest1.sum(5,5),expected);
        assertEquals(MyTest1.sum(4,5),10,"Failed");
        assertNotEquals(MyTest1.sum(14,6),18);

    }

    @Test(description = "Divide two dijits")
    public void testDiv() {
       assertEquals(MyTest1.div(20,5),3);
       assertNotEquals(MyTest1.div(15,3),4);
    }

    @Test(dependsOnMethods = "testDiv",alwaysRun = true,priority = 3)
    public void testMul() {
        assertNotEquals(MyTest1.mul(7,7),48,"Your test failed");
    }

    @Test(priority = 1)
    public void testDif() {
        assertEquals(MyTest1.dif(16,3),13);
    }
}