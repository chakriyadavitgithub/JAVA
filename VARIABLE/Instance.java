 ///Instance:if variable value is varied from object to object.
 class Test{
    int a=10;
    int b=20;
    static int c=30;
    public static void main(String[] args) {
      Test  t1 =new Test();
      //t1 are the updated values
      t1.a=100;
      Test t2=new Test();
           t2.b=200;
      System.out.println(t1.a+t1.b+t1.c);
      System.out.println(t2.a+t2.b+t2.c);
      //static variables we can use any where
      t1.c=300;
      System.out.println(t1.a+t1.b+t1.c);
      System.out.println(t2.a+t2.b+t2.c);
    }
    
}
