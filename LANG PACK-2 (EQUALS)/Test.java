class A{}
class B extends A{}
public class Test{
    public static void main(String[] args) {
        int sal1=50000;
        int sal2=60000;
        A a=new A();
        B b=new B();
        System.out.println(a.equals(b));//false
        System.out.println(a == b);//false
    }

}