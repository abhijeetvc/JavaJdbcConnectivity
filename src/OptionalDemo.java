//Optional : It is used to represent whether the value is present or absent
// Null checks not required
// No null pointer exception


//Optional orElse
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> gender= Optional.of("MALE");
        Optional<String> genderNa=Optional.empty();
//
//        if(gender.isPresent()){
//            System.out.println("Value present");
//        }else{
//            System.out.println("Value not present");
//        }

        System.out.println(gender.orElse("NA"));
        System.out.println(genderNa.orElse("NA"));
    }
}
