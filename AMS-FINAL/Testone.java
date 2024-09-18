class Parent{
    public final void m1(){
        System.out.println("parent class method-m1");
    }
    
}
class Child extends Parent{
    public void m1(){///final method,overriding is not possible
        System.out.println("Child class method-m1");
    }
}

// error: m1() in Child cannot override m1() in Parent