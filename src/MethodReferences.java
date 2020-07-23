import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Method References:   (::) double colon operator
// 4 kinds of method references
// a) Reference to a static method
// b) Reference to an instance method of particular object
// c) Reference to an instance method of an arbitrary object of particular type
// d) Reference to a constructor

public class MethodReferences {

    public static void main(String[] args) {

        List<String> list1= Arrays.asList("India","US","France","Germany");

        // Normal java code
//        for (String s:list1) {
////            System.out.println(s);
////        }

        //lambda expression
      //  list1.forEach(str-> System.out.println(str));

        //Method References
        list1.forEach(System.out::println); //readability
    }
}
