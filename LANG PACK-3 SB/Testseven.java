class A{}
class B{}
class C extends B{}
public class Testseven {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        int c=100;
        String ename1="Chakri";
        String ename2=new String("Chakri");
        StringBuffer ename3=new StringBuffer("Chakri");
        
        A obj1=new A();
        B obj2=new B();
        C obj3=new C();

        ///here we are using the Stringbuffer
        //and this SB also create the object in the heapmemory
        //SB is a mutable
       


        System.out.println(ename3.equals(ename2));//false
        System.out.println(ename1.equals(obj3));//false
        
        System.out.println(ename2.equals(ename1));//true
        System.out.println(ename3.equals(obj1));//false

         System.out.println(ename3.equals(ename1));//false
         System.out.println(obj1.equals(ename1));//false

    }
    }