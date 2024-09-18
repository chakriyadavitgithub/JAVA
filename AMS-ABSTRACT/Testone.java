abstract class A {
    abstract void m1();
    //class contain atleast one abstract method
    //class should be abstarct.
    //for abstract class we can't create object
    
}
abstract class B extends A{///implimentation class
   public abstract void m1();
}
class Test{
    public static void main(String[] args) {
        new B();
    }
}
//error B is abstract; cannot be instantiated