package myTestNgTest;

import  static org.testng.Assert.*;
import org.testng.annotations.Test;

public class TestUser {

    @Test(description = "Verify admin can create new user")
    public void createNewUserTest(){
        System.out.println("Creating new user");
        fail();
    }
    @Test(dependsOnMethods = "createNewUserTest")
    public void checkCreateUser(){
        System.out.println("Checking created user");
    }

    @Test
    public void test1(){
        String str = "Hello";
        String str1 = null;

        assertEquals(1,1);
        assertEquals(str,"Hello");
        assertEquals(str.length(),5);
        assertFalse(str.endsWith("A"));
        assertTrue(str.startsWith("H"));
        assertNotEquals(5,4);
        assertNotNull(str);
        assertNull(str1);

    }

}
