//how to acheive multiple interface by using implements.
interface p1 {
    public abstract void m1();
}
interface p2{
public abstract void m2();
}
class Child implements p1,p2{
    public void m1(){System.out.println("m1");}
    public void m2(){System.out.println("m2");}

}
public class Testfour{
    public static void main(String[] args) {
        Child c1=new Child();
        c1.m1();
        c1.m2();
    }

}
