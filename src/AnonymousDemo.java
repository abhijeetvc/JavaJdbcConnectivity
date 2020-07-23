// Anonymous Class: It must be defined inside another class
// It doesn't have any name

public class AnonymousDemo {

    public void getData(){
        getData1();
        System.out.println("In AnonymousDemo class");
    }

    private void getData1(){
        System.out.println("In A. C. getdata1 method");
    }
}

class AnonymousDemo1{

//    void check(){
//        System.out.println("In check method");
//    }
//
     public void checkAnonymousClass(){

         //Anonymous class
         AnonymousDemo ad=new AnonymousDemo(){

             public void getData(){
               //  check();
                 System.out.println("Inside A. C.");
             }
         };
         ad.getData();

     }
}

class CheckAC{
    public static void main(String[] args) {
        AnonymousDemo1 a1=new AnonymousDemo1();
        a1.checkAnonymousClass();
    }
}
