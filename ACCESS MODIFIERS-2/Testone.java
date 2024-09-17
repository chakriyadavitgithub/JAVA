package pack1;
public class Testone{
    public static void main(String[] args) {
        A a1=new A();
        a1.m1();
        a1.m2();
        a1.m3();
        //a1.m4(); error will be occur bcoz it is private
        B b1=new B();
        b1.m5();
    }

}