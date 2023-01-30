package practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAPExam {
    public static void main(String[] args) {

        Integer myArr[]={4,5,8,7,9};

        List <Integer> list =new ArrayList<>(Arrays.asList(myArr));
        System.out.println(list);


       int k =0;
        for (Integer s:myArr) {
            if(s%2!=0){
              k +=s;

            }
        }
        System.out.println(k);


//        Integer odd = collection.stream().filter(p -> p % 2 != 0).reduce((c1, c2) -> c1 + c2).orElse(0);
    }
}
