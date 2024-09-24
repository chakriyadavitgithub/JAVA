///It is Simple Inheritance
class Parent{
    public void m1(){System.out.println("Parent class -m1");}
    public void m2(){System.out.println("parent class -m2");}
    public void m4(){System.out.println("Simple Inheritance-m4");}

}
class Child extends Parent{
    public void m3(){System.out.println("child class -m3");}
    
}
class Test{
    public static void main(String[] args) {
        Child c1=new Child();
        c1.m1();
        c1.m2();
        c1.m3();
        c1.m4();
    }
}