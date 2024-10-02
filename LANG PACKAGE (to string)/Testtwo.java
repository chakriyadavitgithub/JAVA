class A extends Object{//here without tostring is there 
    public static void main(String[] args) {
      A a=new A();
      System.out.println(a);
      System.out.println(a.toString());//abd direct address will be excetute
    }
}

///output:
//java A
//A@2f92e0f4
// A@2f92e0f4