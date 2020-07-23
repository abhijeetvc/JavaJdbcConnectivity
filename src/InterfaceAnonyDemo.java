interface Demo{
    void display();
}

public class InterfaceAnonyDemo implements Demo {

    public void check(){
          //Anonymous class
//        Demo d=new Demo() {
//            @Override
//            public void display() {
//                System.out.println("In display of Class");
//            }
//        };
//        d.display();
    }

    @Override
    public void display() {

    }
}
