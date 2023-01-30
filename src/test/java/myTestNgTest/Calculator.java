package myTestNgTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator {

    @Test
    public void testSum(){
        Assert.assertEquals(sum(5,5),10);

    }
    public int sum(int a,int b){
        return a+b;
    }
}
//<suite name="Regression Test Suite" verbose="1"  parallel="classes" thread-count="2">