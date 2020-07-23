//Streams in Java 8: filter(), collect(), findAny(),orElse()

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("India","Australia","China","France","US");

//        List<String> list2=new ArrayList();
//
//        for (String country:list) {
//            if(!"China".equals(country)){
//                list2.add(country);
//            }
//        }
//        System.out.println(list2);

        List<String> list2=list.stream()
                .filter(str->!"China".equals(str))
                .collect(Collectors.toList());
        System.out.println(list2);

    }
}
