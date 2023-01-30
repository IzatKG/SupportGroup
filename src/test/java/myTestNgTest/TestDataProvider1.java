package myTestNgTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider1 {
    @DataProvider
    public Object[][] dpCheck(){
        Object[][] a = {
                {"Meder@gmail.com","MMK125!"},
                {"MEder.@gamil"," MKJUI44"},
                {"Meder@gmail.com","MMK1785!"},
                {"medder@gamil"," MK88844"},};

        return a;
    }


    @Test(dataProvider = "dpCheck")
    public void testCheckUserLog(String login,String psw){
        if(login.equals("Meder@gmail.com") && psw.equals("MMK125!")) {
            System.out.println("Testing email field with : " + login + " Testing psw field with :" + psw);
        }else {
            System.out.println("Wrong invalid dates : " +login +" "+ psw);
        }
    }
}
