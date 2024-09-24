class Parent{
    public void m1(){System.out.println("Parent m1");}
    public void m2(){System.err.println("Parent m2");}
}
class Child extends Parent{
    public void m3(){System.out.println("Child m3");}
}
class Testtwo{
    public static void main(String[] args) {
        int a=100;
        Parent p1=new Parent();///parent to parent will be access
        p1.m1();
        p1.m2();
        Child c1=new Child();//child class will be access parent also
        c1.m1();
        c1.m2();
        c1.m3();
        Parent p2=new Child();//parent to child will not be access
        p2.m1();
        p2.m2();
        //p2.m3(); m3 is not possible here
        //Child obj=new Parent();  //Parent cannot be converted to Child error

    }
}