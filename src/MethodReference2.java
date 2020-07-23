import java.util.ArrayList;
import java.util.List;

// Reference to an instance method of particular object
public class MethodReference2 {

    public static void main(String[] args) {
        Student s1=new Student();
        s1.setId(1);
        s1.setName("A");
        s1.setAge(5);

        Student s2=new Student();
        s2.setId(2);
        s2.setName("B");
        s2.setAge(25);

        Student s3=new Student();
        s3.setId(3);
        s3.setName("C");
        s3.setAge(15);

        List<Student> list=new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println(list);

        System.out.println("After sorting by Age");

        CompareObj c=new CompareObj();
        list.sort(c::compareByAge);
//
        list.forEach(s-> System.out.println(s));
    }
}

class CompareObj{

    public int compareByAge(Student s1,Student s2){
        System.out.println(s1.getAge()+" "+s2.getAge());
        return s1.getAge().compareTo(s2.getAge());
    }
}
