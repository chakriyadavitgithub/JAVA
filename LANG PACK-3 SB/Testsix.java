class A{}
class B{}
class C extends B{}
public class Testsix {
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

//String using with new keyword.
//and it is create the objects in the heap memory.
//and by using the equals is true.
//and object gets false bcoz ith is not similar for equals.

        System.out.println(ename1.equals(ename2));//true
        System.out.println(obj1.equals(obj2));//false

       // System.out.println(obj1==obj2);//
        System.out.println(obj3==obj2);//false
    }
    
}
