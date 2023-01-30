package myTestNgTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {

    @DataProvider(name = "Login data")
    public Object[][] dpMethod() {
        return new Object[][]{
                {"john@gmail.com", "VeryhardP@$$123!"},
                {"john@gmail", "VeryhardP@$$123!"},
                {"john@gmail", "VeryhardP@$$!"},
                {"john@gmail", "Very123!"},
                {"john.@gmail.com", "Very123548!"}
        };
    }

    @Test(dataProvider = "Login data")
    public void myTest(String email, String password) {
        System.out.println("Test Login page: Testing email field with " + email + "___" + "Testing password field with :" + password);

    }
}
//    @DataProvider
//    public Object[][] dpMethod(){
//        Object[][] data {
//                {"john@gmail.com", "VeryhardP@$$123!"},
//                {"john@gmail", "VeryhardP@$$123!"},
//                {"john@gmail", "VeryhardP@$$!"},
//                {"john@gmail", "Very123!"},
//                {"john.@gmail.com", "Very123548!"}
//        };
//       return data;
//    }
//
//    @Test(dataProvider = "dpMethod")
//    public void myTest (String email,String password) {
//        System.out.println("Test Login page: Testing email field with " + email + "___"+ "Testing password field with :" + password);
//
//    }
