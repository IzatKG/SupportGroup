//package myTestNgTest;
//
//import javafaker.FakeDataProvider;
//import org.testng.annotations.*;
//
//public class TestDemo {
//    Demo1 demo1 =new Demo1();
//     String expectedFakeName;
//
//    @BeforeClass
//    public void setUp(){
//        System.out.println("This is before class");
//        System.out.println("open chrome browser");
//        System.out.println("Go to NambaFood");
//
//    }
//
//    @BeforeMethod
//    public void beforeMethod(){
//        System.out.println("This is before method");
//        expectedFakeName= FakeDataProvider.generateFakeName();
//    }
//    @AfterMethod
//    public void afterMethod(){
//        expectedFakeName=null;
//        System.out.println(expectedFakeName);
//        System.out.println("Screenshot");
//    }
//
//    @Test(description = "Verify food title is displayed on Home Page")
//
//    public void testFoodTitle (){
//        System.out.println("This is test 1");
//        System.out.println("Check food title");
//        System.out.println(expectedFakeName);
//    }
//
//
//
//    @Test(description = "Verify pharmacy title is displayed on Home Page")
//    public void testPharmacyTitle(){
//        System.out.println("This is test 2");
//        System.out.println("Check pharmacy title");
//        System.out.println(expectedFakeName);
//    }
//
//    @Test(description = "Verify shop title is displayed on Home Page")
//    public void testShops() {
//        System.out.println("This is test 3");
//        System.out.println("Check shop title");
//    }
//
//    @AfterClass
//    public void tearDown(){
//        System.out.println("Closing chrome browser");
//    }
//
//}
