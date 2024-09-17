package pack1;
public class A{
    public void m1(){System.out.println("m1 public");}//anywhere we can use
           void m2(){System.out.println("m2 default");}//default
    protected void m3(){System.out.println("m3 protected");}//with in the package & outside the package with the help of child class.
    private void m4(){System.out.println("m4 private");}//with in the class only

}
