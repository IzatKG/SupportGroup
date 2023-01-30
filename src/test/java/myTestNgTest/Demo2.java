package myTestNgTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {


    public static int[] sortedArray(int[] num2) {
        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                if (num2[i] < num2[j]) {
                    int a = num2[i];
                    num2[i] = num2[j];
                    num2[j] = a;
                }
            }
        }
        return num2;
    }


    @Test
    public void testSortedArrayFunction() {
        int[] arr = {1, 5, 11, 3, 6, 0, 8};
        sortedArray(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) { /// nums[0] ==5   nums[1] ==3
                Assert.fail();
            } else {
                Assert.assertTrue(true);
            }
        }
    }

    @Test
    public void testSortedArrayFunction1() {
        int[] arr = {1, 5, 11, 0, 3, -5, 6, 8};
        int[] expectedSortedArray = {-5, 0, 1, 3, 5, 6, 8, 11};
        Assert.assertEquals(sortedArray(arr), expectedSortedArray);
        Assert.assertEquals(expectedSortedArray[0], arr[0]);
    }

}

