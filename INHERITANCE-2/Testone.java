class GrandParent {
    public void m1(){System.out.println("GP class -m1");}
}
class Parent extends GrandParent{
public void m2(){System.out.println("parent class - m2");}
}
class Child extends Parent{
    public void m3(){System.out.println("child class -m3");}
    public void m4(){System.out.println("And it is Multilevel Inheritance-m4");}
}
class Testone{
    public static void main(String[] args) {
        Child c1=new Child();
        c1.m1();
        c1.m2();
        c1.m3();
        c1.m4();
    }
}
