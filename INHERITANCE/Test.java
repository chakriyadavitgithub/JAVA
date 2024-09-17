///parent refernce & child 
class Parent{
    void m1(){System.out.println("parent-m1");}
    void m2(){System.out.println("parent-m2");}
}
class Child extends Parent{
    void m3(){System.out.println("child-m3");}
     
}
class Test{
    public static void main(String[] args) {
        Parent p1 =new Parent();//parent to parent accessable
        p1.m1();
        p1.m2();
        Child c1=new Child();//child to child accessbale
        c1.m1();
        c1.m2();
        c1.m3();
        //child p2=new parent (); error will be occur child doesn't allow parent
        Parent c2=new Child();//parent to child will accessable
        c2.m1();
        c2.m2();
        //c2.m3();error
    }
}


//output:
//for excetute the java Test

// parent-m1
// parent-m2
// parent-m1
// parent-m2
// child-m3
// parent-m1
// parent-m2
