import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {
        Student s1=new Student();  //student 1
        s1.setId(1);
        s1.setName("A");
        s1.setAge(30);

        Student s2=new Student(); //student 2
        s2.setId(2);
        s2.setName("B");
        s2.setAge(25);

        List<Student> list=new ArrayList();
        list.add(s1);
        list.add(s2);

        System.out.println("Before sorting");
//        for (Student s:list) {
//            System.out.println(s);
//        }
        list.forEach((s)-> System.out.println(s));

        // Using lambda expression
        list.sort((Student st1,Student st2)->st1.getAge()-st2.getAge());
        System.out.println("After sorting");
        list.forEach((student)-> System.out.println(student));

    }
}
