// stream().map()

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapDemo {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("a","b","c","d","e");
        System.out.println(list);
        List<String> list1=new ArrayList();
        for (String s:list) {
            list1.add(s.toUpperCase());
        }
        System.out.println(list1);

        //Java 8

        List<String> list2=list.stream().map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(list2);
    }
}
