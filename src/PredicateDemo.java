import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateDemo {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,3,7,8,9,1,2,4);

        List<Integer> list2=list.stream()
                .filter(a->a>5 && a<9)
                .collect(Collectors.toList());
        System.out.println(list2);
    }
}
